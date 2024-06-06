package br.com.projeto.modelo;

import org.springframework.stereotype.Component;

@Component
public class Pessoa {
    
    // ***** ATRIBUTOS
    private int codigo;
    private String nome;
    private int idade;
    
    // ***** GET e SET
    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
