package p000;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sousasantoslogic.sspro.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class cy1 extends AbstractC1420sv implements View.OnClickListener {

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ int f2664C = 0;

    /* JADX INFO: renamed from: A */
    public int f2665A;

    /* JADX INFO: renamed from: B */
    public int f2666B;

    /* JADX INFO: renamed from: m */
    public final int f2667m;

    /* JADX INFO: renamed from: n */
    public final int f2668n;

    /* JADX INFO: renamed from: o */
    public final LayoutInflater f2669o;

    /* JADX INFO: renamed from: p */
    public final SearchView f2670p;

    /* JADX INFO: renamed from: q */
    public final SearchableInfo f2671q;

    /* JADX INFO: renamed from: r */
    public final Context f2672r;

    /* JADX INFO: renamed from: s */
    public final WeakHashMap f2673s;

    /* JADX INFO: renamed from: t */
    public final int f2674t;

    /* JADX INFO: renamed from: u */
    public int f2675u;

    /* JADX INFO: renamed from: v */
    public ColorStateList f2676v;

    /* JADX INFO: renamed from: w */
    public int f2677w;

    /* JADX INFO: renamed from: x */
    public int f2678x;

    /* JADX INFO: renamed from: y */
    public int f2679y;

    /* JADX INFO: renamed from: z */
    public int f2680z;

    public cy1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f10557b = true;
        this.f10558c = null;
        this.f10556a = false;
        this.f10559d = -1;
        this.f10560e = new C1346qv(this);
        this.f10561f = new C1383rv(this, 0);
        this.f2668n = suggestionRowLayout;
        this.f2667m = suggestionRowLayout;
        this.f2669o = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f2675u = 1;
        this.f2677w = -1;
        this.f2678x = -1;
        this.f2679y = -1;
        this.f2680z = -1;
        this.f2665A = -1;
        this.f2666B = -1;
        this.f2670p = searchView;
        this.f2671q = searchableInfo;
        this.f2674t = searchView.getSuggestionCommitIconResId();
        this.f2672r = context;
        this.f2673s = weakHashMap;
    }

    /* JADX INFO: renamed from: h */
    public static String m2139h(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    @Override // p000.AbstractC1420sv
    /* JADX INFO: renamed from: a */
    public final void mo2140a(View view, Cursor cursor) {
        int i;
        Drawable drawableM2145f;
        CharSequence charSequenceM2139h;
        by1 by1Var = (by1) view.getTag();
        int i2 = this.f2666B;
        int i3 = i2 != -1 ? cursor.getInt(i2) : 0;
        TextView textView = by1Var.f1569a;
        TextView textView2 = by1Var.f1570b;
        ImageView imageView = by1Var.f1573e;
        if (textView != null) {
            String strM2139h = m2139h(cursor, this.f2677w);
            textView.setText(strM2139h);
            if (TextUtils.isEmpty(strM2139h)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.f2672r;
        if (textView2 != null) {
            String strM2139h2 = m2139h(cursor, this.f2679y);
            if (strM2139h2 != null) {
                if (this.f2676v == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.f2676v = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(strM2139h2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f2676v, null), 0, strM2139h2.length(), 33);
                charSequenceM2139h = spannableString;
            } else {
                charSequenceM2139h = m2139h(cursor, this.f2678x);
            }
            if (TextUtils.isEmpty(charSequenceM2139h)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(charSequenceM2139h);
            if (TextUtils.isEmpty(charSequenceM2139h)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView2 = by1Var.f1571c;
        if (imageView2 != null) {
            int i4 = this.f2680z;
            if (i4 == -1) {
                drawableM2145f = null;
            } else {
                drawableM2145f = m2145f(cursor.getString(i4));
                if (drawableM2145f == null) {
                    ComponentName searchActivity = this.f2671q.getSearchActivity();
                    String strFlattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.f2673s;
                    if (weakHashMap.containsKey(strFlattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(strFlattenToShortString);
                        drawableM2145f = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            int iconResource = activityInfo.getIconResource();
                            if (iconResource != 0) {
                                Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                                if (drawable == null) {
                                    StringBuilder sbM5343j = AbstractC1308pu.m5343j(iconResource, "Invalid icon resource ", " for ");
                                    sbM5343j.append(searchActivity.flattenToShortString());
                                    Log.w("SuggestionsAdapter", sbM5343j.toString());
                                    drawableM2145f = null;
                                } else {
                                    drawableM2145f = drawable;
                                }
                            } else {
                                drawableM2145f = null;
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.w("SuggestionsAdapter", e.toString());
                        }
                        weakHashMap.put(strFlattenToShortString, drawableM2145f == null ? null : drawableM2145f.getConstantState());
                    }
                    if (drawableM2145f == null) {
                        drawableM2145f = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView2.setImageDrawable(drawableM2145f);
            if (drawableM2145f == null) {
                imageView2.setVisibility(4);
            } else {
                imageView2.setVisibility(0);
                drawableM2145f.setVisible(false, false);
                drawableM2145f.setVisible(true, false);
            }
        }
        ImageView imageView3 = by1Var.f1572d;
        if (imageView3 == null) {
            i = 1;
        } else {
            int i5 = this.f2665A;
            Drawable drawableM2145f2 = i5 == -1 ? null : m2145f(cursor.getString(i5));
            imageView3.setImageDrawable(drawableM2145f2);
            if (drawableM2145f2 == null) {
                imageView3.setVisibility(8);
                i = 1;
            } else {
                imageView3.setVisibility(0);
                drawableM2145f2.setVisible(false, false);
                i = 1;
                drawableM2145f2.setVisible(true, false);
            }
        }
        int i6 = this.f2675u;
        if (i6 != 2 && (i6 != i || (i3 & 1) == 0)) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        imageView.setTag(textView.getText());
        imageView.setOnClickListener(this);
    }

    @Override // p000.AbstractC1420sv
    /* JADX INFO: renamed from: b */
    public final void mo2141b(Cursor cursor) {
        try {
            super.mo2141b(cursor);
            if (cursor != null) {
                this.f2677w = cursor.getColumnIndex("suggest_text_1");
                this.f2678x = cursor.getColumnIndex("suggest_text_2");
                this.f2679y = cursor.getColumnIndex("suggest_text_2_url");
                this.f2680z = cursor.getColumnIndex("suggest_icon_1");
                this.f2665A = cursor.getColumnIndex("suggest_icon_2");
                this.f2666B = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // p000.AbstractC1420sv
    /* JADX INFO: renamed from: c */
    public final String mo2142c(Cursor cursor) {
        String strM2139h;
        String strM2139h2;
        if (cursor == null) {
            return null;
        }
        String strM2139h3 = m2139h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strM2139h3 != null) {
            return strM2139h3;
        }
        SearchableInfo searchableInfo = this.f2671q;
        if (searchableInfo.shouldRewriteQueryFromData() && (strM2139h2 = m2139h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strM2139h2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strM2139h = m2139h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strM2139h;
    }

    @Override // p000.AbstractC1420sv
    /* JADX INFO: renamed from: d */
    public final View mo2143d(ViewGroup viewGroup) {
        View viewInflate = this.f2669o.inflate(this.f2667m, viewGroup, false);
        viewInflate.setTag(new by1(viewInflate));
        ((ImageView) viewInflate.findViewById(R.id.edit_query)).setImageResource(this.f2674t);
        return viewInflate;
    }

    /* JADX INFO: renamed from: e */
    public final Drawable m2144e(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            lv1.m4298j(uri, "No authority: ");
            return null;
        }
        try {
            Resources resourcesForApplication = this.f2672r.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                lv1.m4298j(uri, "No path: ");
                return null;
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    lv1.m4298j(uri, "Single path segment is not a resource ID: ");
                    return null;
                }
            } else {
                if (size != 2) {
                    lv1.m4298j(uri, "More than two path segments: ");
                    return null;
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            lv1.m4298j(uri, "No resource found for: ");
            return null;
        } catch (PackageManager.NameNotFoundException unused2) {
            lv1.m4298j(uri, "No package found for authority: ");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x010c  */
    /* JADX INFO: renamed from: f */
    public final Drawable m2145f(String str) {
        WeakHashMap weakHashMap = this.f2673s;
        Context context = this.f2672r;
        Drawable drawableM2144e = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int i = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + i;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Drawable drawable = AbstractC0075au.getDrawable(context, i);
                if (drawable != null) {
                    weakHashMap.put(str2, drawable.getConstantState());
                }
                return drawable;
            } catch (Resources.NotFoundException unused) {
                Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(str));
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
                Drawable drawableNewDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (drawableNewDrawable2 != null) {
                    return drawableNewDrawable2;
                }
                Uri uri = Uri.parse(str);
                try {
                    if ("android.resource".equals(uri.getScheme())) {
                        try {
                            drawableM2144e = m2144e(uri);
                        } catch (Resources.NotFoundException unused3) {
                            throw new FileNotFoundException("Resource does not exist: " + uri);
                        }
                    } else {
                        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            throw new FileNotFoundException("Failed to open " + uri);
                        }
                        try {
                            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e);
                            }
                            drawableM2144e = drawableCreateFromStream;
                        } catch (Throwable th) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e2) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e2);
                            }
                            throw th;
                        }
                    }
                } catch (FileNotFoundException e3) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
                    if (drawableM2144e != null) {
                        weakHashMap.put(str, drawableM2144e.getConstantState());
                    }
                    return drawableM2144e;
                }
                if (drawableM2144e != null) {
                    weakHashMap.put(str, drawableM2144e.getConstantState());
                }
            }
        }
        return drawableM2144e;
    }

    /* JADX INFO: renamed from: g */
    public final Cursor m2146g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f2672r.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // p000.AbstractC1420sv, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View viewInflate = this.f2669o.inflate(this.f2668n, viewGroup, false);
            if (viewInflate != null) {
                ((by1) viewInflate.getTag()).f1569a.setText(e.toString());
            }
            return viewInflate;
        }
    }

    @Override // p000.AbstractC1420sv, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View viewMo2143d = mo2143d(viewGroup);
            ((by1) viewMo2143d.getTag()).f1569a.setText(e.toString());
            return viewMo2143d;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f10558c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f10558c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f2670p.m244p((CharSequence) tag);
        }
    }
}
