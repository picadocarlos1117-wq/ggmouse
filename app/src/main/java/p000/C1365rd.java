package p000;

/* JADX INFO: renamed from: rd */
/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class C1365rd extends AbstractC0124c6 {

    /* JADX INFO: renamed from: a */
    public final Integer f9896a;

    /* JADX INFO: renamed from: b */
    public final String f9897b;

    /* JADX INFO: renamed from: c */
    public final String f9898c;

    /* JADX INFO: renamed from: d */
    public final String f9899d;

    /* JADX INFO: renamed from: e */
    public final String f9900e;

    /* JADX INFO: renamed from: f */
    public final String f9901f;

    /* JADX INFO: renamed from: g */
    public final String f9902g;

    /* JADX INFO: renamed from: h */
    public final String f9903h;

    /* JADX INFO: renamed from: i */
    public final String f9904i;

    /* JADX INFO: renamed from: j */
    public final String f9905j;

    /* JADX INFO: renamed from: k */
    public final String f9906k;

    /* JADX INFO: renamed from: l */
    public final String f9907l;

    public C1365rd(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f9896a = num;
        this.f9897b = str;
        this.f9898c = str2;
        this.f9899d = str3;
        this.f9900e = str4;
        this.f9901f = str5;
        this.f9902g = str6;
        this.f9903h = str7;
        this.f9904i = str8;
        this.f9905j = str9;
        this.f9906k = str10;
        this.f9907l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0124c6)) {
            return false;
        }
        AbstractC0124c6 abstractC0124c6 = (AbstractC0124c6) obj;
        if (!this.f9896a.equals(((C1365rd) abstractC0124c6).f9896a)) {
            return false;
        }
        if (!this.f9897b.equals(((C1365rd) abstractC0124c6).f9897b)) {
            return false;
        }
        if (!this.f9898c.equals(((C1365rd) abstractC0124c6).f9898c)) {
            return false;
        }
        if (!this.f9899d.equals(((C1365rd) abstractC0124c6).f9899d)) {
            return false;
        }
        if (!this.f9900e.equals(((C1365rd) abstractC0124c6).f9900e)) {
            return false;
        }
        if (!this.f9901f.equals(((C1365rd) abstractC0124c6).f9901f)) {
            return false;
        }
        if (!this.f9902g.equals(((C1365rd) abstractC0124c6).f9902g)) {
            return false;
        }
        if (!this.f9903h.equals(((C1365rd) abstractC0124c6).f9903h)) {
            return false;
        }
        if (!this.f9904i.equals(((C1365rd) abstractC0124c6).f9904i)) {
            return false;
        }
        if (!this.f9905j.equals(((C1365rd) abstractC0124c6).f9905j)) {
            return false;
        }
        if (this.f9906k.equals(((C1365rd) abstractC0124c6).f9906k)) {
            return this.f9907l.equals(((C1365rd) abstractC0124c6).f9907l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9907l.hashCode() ^ ((((((((((((((((((((((this.f9896a.hashCode() ^ 1000003) * 1000003) ^ this.f9897b.hashCode()) * 1000003) ^ this.f9898c.hashCode()) * 1000003) ^ this.f9899d.hashCode()) * 1000003) ^ this.f9900e.hashCode()) * 1000003) ^ this.f9901f.hashCode()) * 1000003) ^ this.f9902g.hashCode()) * 1000003) ^ this.f9903h.hashCode()) * 1000003) ^ this.f9904i.hashCode()) * 1000003) ^ this.f9905j.hashCode()) * 1000003) ^ this.f9906k.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f9896a);
        sb.append(", model=");
        sb.append(this.f9897b);
        sb.append(", hardware=");
        sb.append(this.f9898c);
        sb.append(", device=");
        sb.append(this.f9899d);
        sb.append(", product=");
        sb.append(this.f9900e);
        sb.append(", osBuild=");
        sb.append(this.f9901f);
        sb.append(", manufacturer=");
        sb.append(this.f9902g);
        sb.append(", fingerprint=");
        sb.append(this.f9903h);
        sb.append(", locale=");
        sb.append(this.f9904i);
        sb.append(", country=");
        sb.append(this.f9905j);
        sb.append(", mccMnc=");
        sb.append(this.f9906k);
        sb.append(", applicationBuild=");
        return AbstractC1308pu.m5342i(sb, this.f9907l, "}");
    }
}
