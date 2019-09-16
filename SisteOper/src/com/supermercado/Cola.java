package com.supermercado;

import javax.sql.rowset.spi.SyncResolver;

public class Cola {
	
	private Cliente [] clientes;
	private int nClien;
	private int atend;
	
	
	
	public Cola(Cliente [] a){
		clientes=a;
		nClien=clientes.length;
		atend=0;
	}
	
	
	public int getAtend(){
		return atend;
	}
	
	public synchronized Cliente atenderCliente(){
		Cliente x=null;
			try {
				while(nClien==0) wait();
				x=clientes[atend];
				atend++;
				notify();
			} catch (InterruptedException e) { }
			
		return x;
		
	}
	
	
	
	
	public Cliente[] getClientes() {
		return clientes;
	}


	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}


	public int getnClien() {
		return nClien;
	}


	public void setnClien(int nClien) {
		this.nClien = nClien;
	}

	
}


/*
	private Cliente [] clientes;
	private int nClien;
	private int nPref=0;
	private Caja [] cajas;
	
	public Cola(Cliente [] a, Caja [] b){
		clientes=a;
		cajas=b;
		prefClien();
		nClien=clientes.length;
	}
	
	
	private void running(){
		while(nClien>0){
			 
		}
		
		
	}
	
	
	
	
	private void prefClien(){
		for(int i=0;i<clientes.length;i++){
			if(clientes[i].isPrefCl())
				nPref++;
		}
	}


	
	
	public Cliente[] getClientes() {
		return clientes;
	}


	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}


	public int getnClien() {
		return nClien;
	}


	public void setnClien(int nClien) {
		this.nClien = nClien;
	}


	public int getnPref() {
		return nPref;
	}


	public void setnPref(int nPref) {
		this.nPref = nPref;
	}


	public Caja[] getCajas() {
		return cajas;
	}


	public void setCajas(Caja[] cajas) {
		this.cajas = cajas;
	}

*/