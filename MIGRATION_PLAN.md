# Plan de Migración: GG Mouse Pro → KeySync

## ✅ **YA IMPLEMENTADO**

### 1. Window Manager Flags (FloatingBubbleService.kt)
- ✅ Flags exactas de GG Mouse Pro (824 = 0x338):
  - FLAG_NOT_FOCUSABLE (8)
  - FLAG_NOT_TOUCHABLE (16)
  - FLAG_WATCH_OUTSIDE_TOUCH (32)
  - FLAG_LAYOUT_IN_SCREEN (256)
  - FLAG_LAYOUT_NO_LIMITS (512)
- ✅ Hide system pointer: `setPointerIcon(TYPE_NULL)`
- ✅ Fullscreen cutout support: `layoutInDisplayCutoutMode`

### 2. Array Bounds Validation (EventHandler.kt)
- ✅ Validación en `handleKeyEvent()`, `handleMouseButton()`, `handlePointerMove()`
- ✅ Previene crashes por keyCode fuera de rango

### 3. Launch Order (MainActivityViewModel.kt)
- ✅ Servicio inicia PRIMERO (800ms delay)
- ✅ Luego lanza el juego

---

## 🔴 **FALTA POR IMPLEMENTAR**

### 4. Sistema de Sensibilidad Mejorado
**Archivo:** `FloatingService.java` líneas 5187-5188, 11721-11724

**Lo que GG Mouse Pro hace:**
```java
// Carga sensibilidad guardada
private void carregarSensibilidadeSalva() {
    this.mouseSensitivity = clamp(
        prefs.getFloat("mouse_sensitivity", 1.0f),
        0.5f,  // mínimo
        5.0f   // máximo (SENSI_MAX)
    );
}

// Envía al daemon de inyección
"MOUSE_SENS " + this.mouseSensitivity
```

**KeySync actual:**
- Solo tiene `pointerSensitivityX` y `pointerSensitivityY` (0.0-2.0)
- No hay límites mínimos/máximos claros
- No se persiste correctamente

**Implementar:**
1. Agregar constantes `SENSI_MIN = 0.5f` y `SENSI_MAX = 5.0f`
2. Clamping al cargar/guardar sensibilidad
3. UI con slider mejorado (0.5x - 5.0x)

---

### 5. Inicio Limpio del Overlay
**Archivo:** `FloatingService.java` líneas 11738-11778 (`onStartCommand`)

**Lo que GG Mouse Pro hace:**
```java
@Override
public int onStartCommand(Intent intent, int flags, int startId) {
    // 1. Carga preferencias ANTES de mostrar overlay
    carregarPreferenciaGraficoPartida();
    carregarSensibilidadeSalva();
    carregarConfigInterface();
    
    // 2. Inicia canal de inyección
    iniciarCanalInjecao();
    
    // 3. LUEGO muestra la bolinha
    if (floatingView == null) {
        exibirBolinhaFlutuante();
    }
    
    // 4. Monitorea la pantalla
    iniciarMonitoramentoDeTela();
    
    return START_STICKY; // ⚠️ IMPORTANTE: no START_NOT_STICKY
}
```

**KeySync actual:**
```kotlin
override fun onStartCommand(...): Int {
    // Crea notificación
    // init() directamente
    return START_NOT_STICKY  // ❌ Se mata fácilmente
}
```

**Implementar:**
1. Cambiar a `START_STICKY` para que Android no lo mate
2. Cargar preferencias ANTES de `init()`
3. Inicializar overlays gradualmente (no todos a la vez)

---

### 6. View.setClickable(false) en Overlay
**Archivo:** `FloatingService.java` línea 6278

**Lo que GG Mouse Pro hace:**
```java
View view = this.hudOverlayView;
if (view != null) {
    view.setClickable(false);  // ⚠️ CRÍTICO para que el juego reciba toques
}
```

**KeySync actual:**
```kotlin
// ❌ NO establece setClickable(false) en containerView
```

**Implementar:**
```kotlin
containerView?.isClickable = false  // En init(), después de crear el view
```

---

### 7. Gravity Correcta del Overlay
**Archivo:** `FloatingService.java` línea 6275

**Lo que GG Mouse Pro hace:**
```java
layoutParams.gravity = Gravity.TOP | Gravity.START;  // 8388659 = 0x800033
```

**KeySync actual:**
```kotlin
// ❌ NO establece gravity para itemsContainerLP
```

**Implementar:**
```kotlin
itemsContainerLP.gravity = Gravity.TOP or Gravity.START
```

---

### 8. Orden de Adición de Views
**Archivo:** `FloatingService.java` líneas 6290-6293

**GG Mouse Pro:**
```java
// 1. Configura TODOS los parámetros
configurarControlesHud();
garantirCacheViewsOrdemHud(viewGroup);

// 2. LUEGO agrega al WindowManager
windowManager.addView(hudOverlayView, layoutParams);
```

**KeySync:**
```kotlin
// ❌ Agrega el view SIN configurarlo completamente primero
windowManager.addView(containerView, itemsContainerLP)
```

**Implementar:**
1. Configurar view completamente ANTES de `addView`
2. Establecer `isClickable = false`
3. Aplicar `hideSystemPointer()`
4. LUEGO `addView()`

---

## 📋 **ORDEN DE IMPLEMENTACIÓN RECOMENDADO**

### Fase 1: Fixes Críticos (Prevenir Pantalla Negra)
1. ✅ Window flags (YA HECHO)
2. ✅ Fullscreen cutout (YA HECHO)
3. 🔴 **View.setClickable(false)**
4. 🔴 **Gravity correcta**
5. 🔴 **Orden de inicialización**

### Fase 2: Estabilidad
6. 🔴 **START_STICKY instead of START_NOT_STICKY**
7. 🔴 **Cargar preferencias antes de init()**

### Fase 3: Funcionalidad Mejorada
8. 🔴 **Sistema de sensibilidad con límites**
9. 🔴 **Persistencia de configuración**

---

## 🎯 **PRÓXIMOS PASOS INMEDIATOS**

### 1. Arreglar `init()` en FloatingBubbleService.kt
```kotlin
private fun init() {
    // ... crear layoutParams ...
    
    // CRÍTICO: establecer gravity
    itemsContainerLP.gravity = Gravity.TOP or Gravity.START
    
    // ... crear views ...
    
    // CRÍTICO: configurar view ANTES de addView
    containerView?.apply {
        isClickable = false  // ⚠️ CRUCIAL
        isFocusable = true
        isFocusableInTouchMode = true
    }
    
    // Hide system pointer
    hideSystemPointer(containerView)
    
    // Apply cutout
    applyFullscreenCutout(itemsContainerLP)
    
    // AHORA SÍ agregar al WindowManager
    stateManager.get().windowManager.addView(containerView, itemsContainerLP)
    
    // ... resto del código ...
}
```

### 2. Cambiar START_NOT_STICKY → START_STICKY
```kotlin
override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
    // ... código actual ...
    
    init()
    return START_STICKY  // ⚠️ CAMBIO AQUÍ
}
```

---

## ⚠️ **NOTAS IMPORTANTES**

1. **No sobre-complicar:** Implementar cambios uno a la vez
2. **Probar cada cambio:** Compilar → Instalar → Probar con Free Fire
3. **Si algo falla:** Revertir el último cambio

