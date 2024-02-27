package br.com.etecia.appprodutos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListaProdutosActivity extends AppCompatActivity {
RecyclerView idRecViewProdutos;
List<Produtos> ListaProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_produtos_layout);

        idRecViewProdutos = findViewById(R.id.idRecViewProdutos);

        ListaProdutos = new ArrayList<>();
        //lista produtos

        ProdutosAdapter adapter = new ProdutosAdapter(getApplicationContext(),ListaProdutos);

        idRecViewProdutos.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));

        idRecViewProdutos.setAdapter(adapter);
    }
}