package com.example.ssmousepro;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC0064c;
import androidx.recyclerview.widget.AbstractC0068g;
import java.util.List;
import p000.bd0;
import p000.ob0;
import p000.og0;

/* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
/* JADX INFO: loaded from: classes.dex */
public final class JogoAdapter extends AbstractC0064c {
    private final og0 aoClicarNoJogo;
    private final og0 aoPressionarLongoNoJogo;
    private final List<Jogo> lista;

    /* JADX INFO: compiled from: r8-map-id-111b6a80b616d31e8b9d8e722d2d8cc99d6979087cf6e6d25de4f2652b3eb537 */
    public static final class JogoViewHolder extends AbstractC0068g {
        private final ImageView imgIcone;
        private final TextView txtNome;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JogoViewHolder(View view) {
            super(view);
            view.getClass();
            View viewFindViewById = view.findViewById(C0203R.id.imgIconeJogo);
            viewFindViewById.getClass();
            this.imgIcone = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(C0203R.id.txtNomeJogo);
            viewFindViewById2.getClass();
            this.txtNome = (TextView) viewFindViewById2;
        }

        public final ImageView getImgIcone() {
            return this.imgIcone;
        }

        public final TextView getTxtNome() {
            return this.txtNome;
        }
    }

    public JogoAdapter(List<Jogo> list, og0 og0Var, og0 og0Var2) {
        list.getClass();
        og0Var.getClass();
        og0Var2.getClass();
        this.lista = list;
        this.aoClicarNoJogo = og0Var;
        this.aoPressionarLongoNoJogo = og0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(JogoViewHolder jogoViewHolder, JogoAdapter jogoAdapter, View view) {
        int adapterPosition = jogoViewHolder.getAdapterPosition();
        if (adapterPosition != -1) {
            jogoAdapter.aoClicarNoJogo.invoke(jogoAdapter.lista.get(adapterPosition));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBindViewHolder$lambda$1(JogoViewHolder jogoViewHolder, JogoAdapter jogoAdapter, View view) {
        int adapterPosition = jogoViewHolder.getAdapterPosition();
        if (adapterPosition == -1) {
            return true;
        }
        jogoAdapter.aoPressionarLongoNoJogo.invoke(jogoAdapter.lista.get(adapterPosition));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0064c
    public int getItemCount() {
        return this.lista.size();
    }

    @Override // androidx.recyclerview.widget.AbstractC0064c
    public void onBindViewHolder(JogoViewHolder jogoViewHolder, int i) {
        jogoViewHolder.getClass();
        Jogo jogo = this.lista.get(i);
        jogoViewHolder.getTxtNome().setText(jogo.getNome());
        if (jogo.getIcone() != null) {
            jogoViewHolder.getImgIcone().setImageDrawable(jogo.getIcone());
        } else {
            jogoViewHolder.getImgIcone().setImageResource(android.R.drawable.sym_def_app_icon);
        }
        jogoViewHolder.itemView.setOnClickListener(new ob0(2, jogoViewHolder, this));
        jogoViewHolder.itemView.setOnLongClickListener(new bd0(1, jogoViewHolder, this));
    }

    @Override // androidx.recyclerview.widget.AbstractC0064c
    public JogoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0203R.layout.item_jogo, viewGroup, false);
        viewInflate.getClass();
        return new JogoViewHolder(viewInflate);
    }
}
