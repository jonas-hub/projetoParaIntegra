package Br.DigitalHouse.Projetointegravel;

public class Professor {
    public String nome;
    public int turma;
    public int codigoIdProfessor;
    public String especialidade;
    public Integer monitoria;

    public Professor(String nome, int turma, int codigoIdProfessor, String especialidade, Integer monitoria) {
        this.nome = nome;
        this.turma = turma;
        this.codigoIdProfessor = codigoIdProfessor;
        this.especialidade = especialidade;
        this.monitoria = monitoria;
    }
}
