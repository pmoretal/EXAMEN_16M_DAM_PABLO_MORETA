import java.util.Scanner;

public class EXAMEN_16M_PRIMO {

	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		int num1=0;
		int contador=0;
		
		System.out.println("Buenos días Ceinmark, soy Pablo Moreta");
		System.out.println("Introduce un número para averiguar si es primo o no: ");
		num1=ent.nextInt();
		
		int[] divisores =new int[10];
		boolean primo = true; 
		
		
		for(int i = 2; i <num1; i++) {
						
			if (num1 % i == 0) {
				primo = false;
				divisores[contador]=i;
				contador++;					
			}
		}
		if (primo == true) {
			System.out.print("El número que has introducido por teclado es primo");
			System.out.println(" ");
			
		}else {
			System.out.print("El número que has introducido por teclado no es primo");
			System.out.println(" ");
			
		}
		System.out.printf("Los divisores del número " + num1 + " son: ");
		for (int i = contador - 1; i >= 0; i --) {
			System.out.printf(divisores[i]+ ",");
		}    
		      
		}
	}
