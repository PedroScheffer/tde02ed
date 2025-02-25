package atv01;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int id;
    private String nome;
    private Professor professor;
    private List<Aluno> alunosMatriculados = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void inserirAluno(Aluno aluno) {
        alunosMatriculados.add(aluno);
    }

    public void listarAlunos() {
        for (Aluno aluno : alunosMatriculados) {
            System.out.println(aluno.getNome());
        }
    }
}

