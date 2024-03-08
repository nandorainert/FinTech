package br.com.FinTech;

import java.util.Random;

public interface Conta {
	
	static final Integer numero = null;
	static final Double saldo = null;
	static final Integer limite = null;
	static final String banco = null;
	
	 private int gerarNumeroConta() {
	        Random random = new Random();
	        return 100000 + random.nextInt(900000);
	    }
	 default double getSaldo() {
	        return saldo;
	    }
}
