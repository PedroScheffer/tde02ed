import atv01.Aluno;
import atv01.Professor;
import atv01.Turma;
import atv02.Livraria;
import atv02.Livro;

public class Main {
    public static void main(String[] args) {

        //AQUI EU CRIO O PROFESSOR, ALUNOS E A TURMA
        Professor prof1 = new Professor();
        prof1.setNome("Prof. João");
        prof1.setEmail("joao@escola.com");

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Carlos");
        aluno1.setEmail("carlos@escola.com");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Ana");
        aluno2.setEmail("ana@escola.com");

        Turma turma1 = new Turma();
        turma1.setId(1);
        turma1.setNome("Matemática");
        turma1.setProfessor(prof1);

        //AQUI EU INSIRO OS ALUNOS NA TURMA E LOGO OS PROFESSORES E ALUNOS
        turma1.inserirAluno(aluno1);
        turma1.inserirAluno(aluno2);

        prof1.logar();
        aluno1.logar();
        turma1.listarAlunos();

        // ATIVIDADE 2


        //AQUI EU CRIOS OS LIVROS E A LIVRARIA
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1200);
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 300);
        Livro livro3 = new Livro("Dom Casmurro", "Machado de Assis", 256);

        Livraria livraria = new Livraria();


        //AQUI EU INSIRO OS LIVROS NA LIVRARIA E LISTO OS LIVROS DISPONÍVEIS
        livraria.inserirLivro(livro1);
        livraria.inserirLivro(livro2);
        livraria.inserirLivro(livro3);

        System.out.println("Todos os livros na livraria:");
        livraria.listarLivros();

        System.out.println("Livros disponíveis para empréstimo:");
        livraria.listarDisponiveis();

        System.out.println("Reservando o livro 'Dom Casmurro':");
        livraria.reservarLivro("Dom Casmurro");

        System.out.println("Tentando reservar 'Dom Casmurro' novamente:");
        livraria.reservarLivro("Dom Casmurro");

        System.out.println("Devolvendo o livro 'Dom Casmurro':");
        livraria.devolverLivro("Dom Casmurro");

        System.out.println("Livros disponíveis para empréstimo após a devolução:");
        livraria.listarDisponiveis();
    }
}


