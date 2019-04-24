package br.com.digitalhouse;

import java.util.Map;

public class Usuario {
    public Usuario() {
    }

    public void cadastrarLivro(Livro livro, Map<Integer, Livro> mapa, int codigo) {
        mapa.put(codigo, livro);
    }

    public void consultarPorCodigo(int codigo, Map<Integer, Livro> mapa) {
        if (mapa.get(codigo) == null) {
            System.out.println("Livro não encontrado");
        } else {
            System.out.println(mapa.get(codigo).getTitulo());

        }
    }

    public void efetuarVenda(int codigo, Map<Integer, Livro> mapa) {
        if (mapa.get(codigo).getQuantEstoque() > 0)
        {
            mapa.get(codigo).diminuirEstoque();
        }
            else{
            System.out.println("Estoque esgotado");

        }

    }

}
