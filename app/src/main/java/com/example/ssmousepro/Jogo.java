package com.example.ssmousepro;

import android.graphics.drawable.Drawable;
import p000.AbstractC1308pu;
import p000.hp0;
import p000.jd0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class Jogo {
    private final Drawable icone;
    private final String nome;
    private final String pacote;

    public Jogo(String str, String str2, Drawable drawable) {
        str.getClass();
        str2.getClass();
        this.nome = str;
        this.pacote = str2;
        this.icone = drawable;
    }

    public static /* synthetic */ Jogo copy$default(Jogo jogo, String str, String str2, Drawable drawable, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jogo.nome;
        }
        if ((i & 2) != 0) {
            str2 = jogo.pacote;
        }
        if ((i & 4) != 0) {
            drawable = jogo.icone;
        }
        return jogo.copy(str, str2, drawable);
    }

    public final String component1() {
        return this.nome;
    }

    public final String component2() {
        return this.pacote;
    }

    public final Drawable component3() {
        return this.icone;
    }

    public final Jogo copy(String str, String str2, Drawable drawable) {
        str.getClass();
        str2.getClass();
        return new Jogo(str, str2, drawable);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jogo)) {
            return false;
        }
        Jogo jogo = (Jogo) obj;
        return hp0.m3214e(this.nome, jogo.nome) && hp0.m3214e(this.pacote, jogo.pacote) && hp0.m3214e(this.icone, jogo.icone);
    }

    public final Drawable getIcone() {
        return this.icone;
    }

    public final String getNome() {
        return this.nome;
    }

    public final String getPacote() {
        return this.pacote;
    }

    public int hashCode() {
        int iM5336c = AbstractC1308pu.m5336c(this.nome.hashCode() * 31, 31, this.pacote);
        Drawable drawable = this.icone;
        return iM5336c + (drawable == null ? 0 : drawable.hashCode());
    }

    public String toString() {
        String str = this.nome;
        String str2 = this.pacote;
        Drawable drawable = this.icone;
        StringBuilder sbM3618p = jd0.m3618p("Jogo(nome=", str, ", pacote=", str2, ", icone=");
        sbM3618p.append(drawable);
        sbM3618p.append(")");
        return sbM3618p.toString();
    }
}
