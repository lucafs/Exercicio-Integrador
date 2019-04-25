package br.com.digitalhouse;

import java.util.Map;

import java.util.ArrayList;
import java.util.List;
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
        if (mapa.get(codigo).getQuantEstoque() > 0) {
            mapa.get(codigo).diminuirEstoque();
        } else {
            System.out.println("Estoque esgotado");

        }
    }




//     Desafio

        public void CadastrarColecao(ColecaoDeLivros colLivros , Map<Integer, ColecaoDeLivros> mapa2, int codigo){

            mapa2.put(codigo, colLivros);

        }
    }


