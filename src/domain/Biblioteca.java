package src.domain;

import java.util.HashSet;
import java.util.Set;

public class Biblioteca {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Set<Livro> getLivros() {
        return livros;
    }

    public void setLivros(Set<Livro> livros) {
        this.livros = livros;
    }

    private Long codigo;
    private String nome;
    private String endereco;
    private Set<Livro> livros;
    public Biblioteca() {
        for (Livro livro : this.livros) {
            
        }
        new HashSet<>(); }
    public Long getCodigo() {
     return codigo;
    }
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
}
