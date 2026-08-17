package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: k9 */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0820k9 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final View f5710a;

    /* JADX INFO: renamed from: b */
    public final String f5711b;

    /* JADX INFO: renamed from: c */
    public Method f5712c;

    /* JADX INFO: renamed from: d */
    public Context f5713d;

    public ViewOnClickListenerC0820k9(View view, String str) {
        this.f5710a = view;
        this.f5711b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f5712c != null) {
            break;
        }
        View view2 = this.f5710a;
        Context context = view2.getContext();
        while (true) {
            String str2 = this.f5711b;
            if (context == null) {
                int id = view2.getId();
                if (id == -1) {
                    str = "";
                } else {
                    str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                }
                StringBuilder sbM5347n = AbstractC1308pu.m5347n("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                sbM5347n.append(view2.getClass());
                sbM5347n.append(str);
                throw new IllegalStateException(sbM5347n.toString());
            }
            try {
                if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                    this.f5712c = method;
                    this.f5713d = context;
                    break;
                }
            } catch (NoSuchMethodException unused) {
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        }
        try {
            this.f5712c.invoke(this.f5713d, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
