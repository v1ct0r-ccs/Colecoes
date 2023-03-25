package TarefaColecoes;

public class Alunos implements Comparable<Alunos>{
    private String nome;
    private String genero;
    private double nota;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Alunos(String nome, String genero, double nota) {
    this.nome = nome;
    this.genero = genero;
    this.nota = nota;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public int compareTo(Alunos alunos) {
        return this.nome.compareTo(alunos.getNome());
    }
}

