package com.supermercado;

public class Cliente {
	
	private int codCl;
//	private boolean prefCl;
	private int tSelec;
	
	public Cliente (int a){
		codCl=a;
	//	prefCl=b;
		tSelec=(int) Math.random()*13+1;
	}
	
	
	
	public int getCodCl() {
		return codCl;
	}

	public void setCodCl(int codCl) {
		this.codCl = codCl;
	}
/*
	public boolean isPrefCl() {
		return prefCl;
	}

	public void setPrefCl(boolean prefCl) {
		this.prefCl = prefCl;
	}
*/
	public int gettSelec() {
		return tSelec;
	}

	public void settSelec(int tSelec) {
		this.tSelec = tSelec;
	}
	
	
	
}
