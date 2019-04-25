package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,Livro> biblioteca =  new HashMap<>();
        Livro Cinderela = new Livro("Cinderela","Walt Disney","1994", 211, 0, 25, 31);
        Livro BrancaDeNeve = new Livro("Branca De Neve","Walt Disney","1991", 2331, 0, 225, 30);
        Usuario Pedro =  new Usuario();
        Pedro.cadastrarLivro(Cinderela,biblioteca,Cinderela.getCódigo());

        Pedro.consultarPorCodigo(211,biblioteca);
        Pedro.efetuarVenda(211, biblioteca);




        //Desafio
        Map<Integer,ColecaoDeLivros> colecaodeLivros =  new HashMap<>();
        List<String> livros = new ArrayList<>();
        livros. add("Barney");
        livros. add("Power Rangers");
        livros. add("Princesas");
        ColecaoDeLivros livrosCrianca= new ColecaoDeLivros(livros,"São livros para crianças",100,10000);
        colecaodeLivros.put(10000,livrosCrianca);


    }
}
