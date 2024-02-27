package br.com.etecia.appprodutos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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

        //instanciar modelo para receber os dados

        View view;

        LayoutInflater inflater = LayoutInflater.from(context);

        view = inflater.inflate(R.layout.modelo_produtos, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtProduto.setText(ListaProdutos.get(position).getDescricao());
        holder.imgProduto.setImageResource(ListaProdutos.get(position).getImagem());
        //clique no cardview do modelo

        holder.cardProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"TESTE", Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return ListaProdutos.size();

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
