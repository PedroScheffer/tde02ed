package atv02;

public class Livro {
    String titulo;
    String autor;
    int numeroPaginas;
    boolean disponibilidade;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.disponibilidade = true; // Inicialmente disponível
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numeroPaginas);
        System.out.println("Disponibilidade: " + (disponibilidade ? "Disponível" : "Não disponível"));
    }

    public void reservar() {
        if (disponibilidade) {
            disponibilidade = false;
            System.out.println("Livro reservado com sucesso.");
        } else {
            System.out.println("Desculpe, o livro já está reservado.");
        }
    }

    public void devolver() {
        disponibilidade = true;
        System.out.println("Livro devolvido com sucesso.");
    }
}


