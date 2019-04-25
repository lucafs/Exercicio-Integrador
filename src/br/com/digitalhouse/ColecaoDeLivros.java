package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class ColecaoDeLivros {
    private List<String> lista;
    private String descricao;
    private float preco;
    private int codigo;

    public ColecaoDeLivros(List<String> lista, String descricao, float preco, int codigo) {
        this.lista = lista;
        this.descricao = descricao;
        this.preco = preco;
        this.codigo = codigo;
    }

    public List<String> getLista() {
        return lista;
    }

    public void setLista(List<String> lista) {
        this.lista = lista;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
