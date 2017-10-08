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
public class Endereco {
    private String rua;
    private String bairro;
    private int numero;
    private String cep;
    private String cidade;
    private String estado;

    public Endereco(String rua, String bairro, int numero, String cep, String cidade, String estado) throws Exception {
        
        if(rua.length() > 100 || rua.equals("") || rua == null) throw new Exception("nome da rua inválido");
        this.rua = rua;
        
        if(bairro.length() > 100 || bairro.equals("") || bairro == null) throw new Exception("nome da bairro inválido");
        this.bairro = bairro;
        
        if(numero < 1) throw new Exception("número inválido");
        this.numero = numero;
        
        if(cep.equals("") || cep == null) throw new Exception("cep inválido");
        this.cep = cep;
        
        if(cidade.length() > 100 || cidade.equals("") || cidade == null ) throw new Exception("nome da cidade inválida");
        this.cidade = cidade;
        
        if(estado.length() > 2 || estado.equals("") || estado == null) throw new Exception("sigla do estado inválida");
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) throws Exception {
        if(rua.length() > 100 || rua.equals("") || rua == null) throw new Exception("nome da rua inválido");
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) throws Exception {
        if(bairro.length() > 100 || bairro.equals("") || bairro == null) throw new Exception("nome da bairro inválido");
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) throws Exception {
        if(numero < 1) throw new Exception("número inválido");
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) throws Exception {
        if(cep.equals("") || cep == null) throw new Exception("cep inválido");
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) throws Exception {
        if(cidade.length() > 100 || cidade.equals("") || cidade == null ) throw new Exception("nome da cidade inválida");
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) throws Exception {
        if(estado.length() > 2 || estado.equals("") || estado == null) throw new Exception("sigla do estado inválida");
        this.estado = estado;
    }
    
    
    
}
