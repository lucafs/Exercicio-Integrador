package br.com.digitalhouse;

import java.util.Map;
import java.util.Random;

public class Livro {
    private String titulo;
    private String autor;
    private String anoDoLancamento;
    private int codigo;
    private int quantEstoque;
    private int ISBN;
    private float preco;

    public Livro(String titulo, String autor, String anoDoLancamento, int codigo, int quantEstoque, int ISBN, float preco) {

        this.titulo = titulo;
        this.autor = autor;
        this.anoDoLancamento = anoDoLancamento;
        this.quantEstoque = quantEstoque;
        this.ISBN = ISBN;
        this.preco = preco;
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnoDoLancamento() {
        return anoDoLancamento;
    }

    public void setAnoDoLancamento(String anoDoLancamento) {
        this.anoDoLancamento = anoDoLancamento;
    }

    public int getCódigo() {
        return codigo;
    }

    public void setCódigo(int código) {
        this.codigo = código;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    public void diminuirEstoque() {
        this.quantEstoque= quantEstoque - 1;
    }

}
