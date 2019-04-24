package br.com.digitalhouse;

import java.util.HashMap;
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

    }
}
