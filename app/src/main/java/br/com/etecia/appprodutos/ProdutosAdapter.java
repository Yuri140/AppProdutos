package br.com.etecia.appprodutos;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class ProdutosAdapter extends RecyclerView.Adapter<ProdutosAdapter.ViewHolder> {

    private Context context;
    private List<Produtos> ListaProdutos;

    //construtor da classe adapter


    public ProdutosAdapter(Context context, List<Produtos> listaProdutos) {
        this.context = context;
        ListaProdutos = listaProdutos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //declarando variaveis que irão representar o xml no java
        ImageView imgProduto;
        TextView txtProduto;
        MaterialCardView cardProduto;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProduto = itemView.findViewById(R.id.idImgProduto);
            txtProduto = itemView.findViewById(R.id.txtDescrProduto);
            cardProduto = itemView.findViewById(R.id.idCardProduto);
        }
    }

}
