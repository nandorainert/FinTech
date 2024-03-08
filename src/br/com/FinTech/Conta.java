package br.com.FinTech;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.com.FinTech.model.Transacao;

public interface Conta {
    
    static final Double saldo = null;
    static final Integer limite = null;
    static final String banco = null;
    
    List<Transacao> extrato = new ArrayList<>(); // Array para armazenar as transações
    
    default void registrarTransacao(Transacao transacao) {
        extrato.add(transacao); // Adiciona a transação ao extrato
    }
    
    default Integer gerarNumero() {
        Random random = new Random();
        Integer numero = random.nextInt(); // Gera um número aleatório
        return numero; // Retorna o número gerado
    }
    
    default Double verSaldo() {
		return saldo;
    }
}