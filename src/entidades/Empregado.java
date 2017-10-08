/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author mathe
 */
public class Empregado {
    private String matricula;
    private String cpf;
    private String nome;
    private int idade;
    private double salario;
    private Endereco endereco;

    public Empregado(String matricula, String cpf, String nome, int idade, double salario, Endereco endereco) throws Exception {
        
        if(matricula.length() > 6 || matricula.equals("") || matricula == null) throw new Exception("Matrícula inválida");
        this.matricula = matricula;
        
        this.cpf = cpf;
        
        if(nome.length() > 70 || nome.equals("") || nome == null) throw new Exception("Nome inválido");
        this.nome = nome;
        
        if(idade < 18) throw new Exception("Idade inválida");
        this.idade = idade;
        
        if(salario < 925) throw new Exception("Salário inválido");
        this.salario = salario;
        
        if(endereco == null) throw new Exception("Endereço inválido");
        this.endereco = endereco;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    
    
}
