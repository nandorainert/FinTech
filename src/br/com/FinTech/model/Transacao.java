package br.com.FinTech.model;

import br.com.FinTech.Conta;

public class Transacao implements Conta {
    
    Integer tipo;
    Double valor;
    Conta contaDe;
    Conta contaPara;

    // Construtor
    public Transacao(Conta contaDe, Conta contaPara, Integer tipo, Double valor) {
        this.contaDe = contaDe;
        this.contaPara = contaPara;
        this.tipo = tipo;
        this.valor = valor;
    }

    // Getters e Setters
    public Conta getContaDe() {
        return contaDe;
    }

    public void setContaDe(Conta contaDe) {
        this.contaDe = contaDe;
    }

    public Conta getContaPara() {
        return contaPara;
    }

    public void setContaPara(Conta contaPara) {
        this.contaPara = contaPara;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
