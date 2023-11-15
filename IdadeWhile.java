package LacoRepeticao;

import java.util.Scanner;

public class IdadeWhile {

	public static void main(String[] args) {
		
		int idade, menor = 0, maior = 0;
		
		Scanner leia = new Scanner(System.in);
			
		System.out.println("\nDigite uma idade: ");
		idade = leia.nextInt();
		
		while (idade >= 0) {
			
			if (idade < 21) {
				menor++;
			}
			if (idade > 50) {
				maior++;
			}
			
			System.out.println("\nDigite uma idade: ");
			idade = leia.nextInt();
				
			
		}
		System.out.println("\nTotal de pessoas menores de 21 anos: "+menor);
		System.out.println("\nTotal de pessoas maiores de 50 anos: "+maior);

	}

}
