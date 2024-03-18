/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author berez
 */
public class ColaboradorVO {
    
    private long idColaborador;
    private boolean clt;
    private boolean ponto;
    private boolean ativo;
    private boolean casa;
    private boolean apartamento;
    private String primeiroNome;
    private String sobrenome;
    private String cpf;
    private double salario;
    private String cep;
    private String bairro;
    private String rua;
    private String numeroRua;
    
    public long getIdColaborador() {
        return idColaborador;
    }

    public void setIdColaborador(long idColaborador) {
        this.idColaborador = idColaborador;
    }

    public boolean isClt() {
        return clt;
    }

    public void setClt(boolean clt) {
        this.clt = clt;
    }

    public boolean isPonto() {
        return ponto;
    }

    public void setPonto(boolean ponto) {
        this.ponto = ponto;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public boolean isCasa() {
        return casa;
    }

    public void setCasa(boolean casa) {
        this.casa = casa;
    }

    public boolean isApartamento() {
        return apartamento;
    }

    public void setApartamento(boolean apartamento) {
        this.apartamento = apartamento;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primerioNome) {
        this.primeiroNome = primerioNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumeroRua() {
        return numeroRua;
    }

    public void setNumeroRua(String numeroRua) {
        this.numeroRua = numeroRua;
    }
    
    
}
