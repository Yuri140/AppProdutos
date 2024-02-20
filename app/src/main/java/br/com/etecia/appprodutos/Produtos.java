package br.com.etecia.appprodutos;

public class Produtos {
    private String descricao;
    private int imagem;
    private int avaliacao;
    private double preco;

    public Produtos(String descricao, int imagem, int avaliacao, double preco) {
        this.descricao = descricao;
        this.imagem = imagem;
        this.avaliacao = avaliacao;
        this.preco = preco;

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
