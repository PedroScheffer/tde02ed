package atv02;

import java.util.ArrayList;
import java.util.List;

public class Livraria {
    private List<Livro> livros;

    public Livraria() {
        livros = new ArrayList<>();
    }

    public void inserirLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.titulo);
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            livro.exibirDetalhes();
            System.out.println();
        }
    }

    public void listarDisponiveis() {
        for (Livro livro : livros) {
            if (livro.disponibilidade) {
                livro.exibirDetalhes();
                System.out.println();
            }
        }
    }

    public void reservarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.titulo.equalsIgnoreCase(titulo)) {
                livro.reservar();
                return;
            }
        }
        System.out.println("Livro não encontrado para reserva.");
    }

    public void devolverLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.titulo.equalsIgnoreCase(titulo)) {
                livro.devolver();
                return;
            }
        }
        System.out.println("Livro não encontrado para devolução.");
    }
}

