package LacoRepeticao;

import java.util.Scanner;

public class MultiplosFor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n1,n2, multiplo;
		
		System.out.println("\nDigite o primeiro número do intervalo: ");
		n1 = leia.nextInt();
		System.out.println("\nDigite o ultimo número do intervalo: ");
		n2 = leia.nextInt();
		
	
		
		if(n1 > n2){
			
			System.out.println("\nIntervalo inválido!");
		
		} else {
			
			System.out.println("\nNo Intervalo de "+n1+" e "+n2);
			
			for(multiplo = n1; multiplo <= n2; multiplo++) {
				if(multiplo % 3 == 0 && multiplo % 5 == 0) {
					System.out.println(multiplo+" é múltiplo de 3 e 5");
				}
			}
		}
	}

}
