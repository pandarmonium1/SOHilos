package com.supermercado;

import java.util.Scanner;

public class AppMarket {

	public static void main(String []args){
		System.out.println("Ingrese el numero de cajas para comenzar la simulacion:");
		Scanner scan = new Scanner(System.in);
		int nCajas = scan.nextInt();
		Cliente [] clientes= new Cliente [20];
		Caja [] cajas = new Caja [nCajas];
		for (int i = 0; i < 20; i++) {
			clientes[i]= new Cliente(i);
		}
		
		Cola buffer = new Cola(clientes);
		
		for(int i=0;i<nCajas;i++){
			cajas[i]=new Caja(buffer,i);
		}
		
		for(int i=0;i<nCajas;i++){
			cajas[i].start();
		}
		
		System.out.println("Operacion terminada");
	}
	
	
	
}
