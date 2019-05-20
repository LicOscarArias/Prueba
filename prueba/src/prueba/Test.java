package prueba;
//
//class MiClase {
//	public int valor;
//}

//class ClasePadre {}
//class ClaseHija1 extends ClasePadre {}
//class ClaseHija2 extends ClasePadre {}

class ClaseA {
	  public ClaseA (int x) {
	    System.out.print("ClaseA-" + x);
	  }
	}

	class ClaseB extends ClaseA {
	  public ClaseB() {
	    super(6);
	    System.out.print(" ClaseB-");
	  }
	}


public class Test {
	
//	static int variableEstatica;
	
	public static void main(String argv[]) {
//		System.out.println(variableEstatica);
//	    Padre b = new Padre();
//	    ClaseHija s = (ClaseHija) b;
//	    System.out.print("Ejecutando Aplicación");

//		int cont;
//		for (cont = 5; cont > 0; cont--)
//			System.out.print(cont);
//		System.out.print(cont);

//	    MiClase a1 = new MiClase();
//	    MiClase a2 = new MiClase();
//	    MiClase a3 = new MiClase();
//	    a1.valor=150;
//	    a2.valor=150;
//	    a3 = a2;
//	    if (a1 == a2) { System.out.println(" UNO"); }
//	    if (a1 == a3) { System.out.println(" DOS"); }
//	    if (a2 == a3) { System.out.println(" TRES"); }

//		ClasePadre var0 = new ClasePadre();
//		ClaseHija1 var1 = new ClaseHija1();
//		ClaseHija2 var2 = new ClaseHija2();
//		ClasePadre var3 = new ClaseHija1();
//		ClasePadre var4 = new ClaseHija2();
//
//		
//		var0 = var1;
//		var2 = (ClaseHija2) var1;
//		var2 = var4;
//		var1 = var2;
		
	    ClaseB objB1 = new ClaseB();
	    ClaseB objB2;
	    System.out.println(" FIN");

	}
}