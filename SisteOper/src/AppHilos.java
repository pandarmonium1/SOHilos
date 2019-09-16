
public class AppHilos {
	
	public static void main (String [] args){
		Hilo uno, dos;
		uno = new Hilo ("Jamaica");
		dos = new Hilo ("Guatemala");
		
		uno.start();
		dos.start();
		
		System.out.println("main no hace nada");
	}
	
}
