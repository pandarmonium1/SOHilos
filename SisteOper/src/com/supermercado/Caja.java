package com.supermercado;

public class Caja extends Thread {

	private Cola clientes;
	private int idCaja;
	
	public Caja (Cola a, int b){
		clientes=a;
		idCaja=b;
	}
	
	public void run(){
		Cliente atend;
		while(true){
			atend=clientes.atenderCliente();
			System.out.println("La caja "+idCaja+" esta atendiendo al cliente"+atend.getCodCl());
		}
	}
	
	
}
