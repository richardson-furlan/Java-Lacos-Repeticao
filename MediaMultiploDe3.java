package LacoRepeticao;

import java.util.Scanner;

public class MediaMultiploDe3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		  
		float num, mult=0, qtdm=0,media;
		do{
			System.out.print("\nDigite um número: ");
			num = ler.nextFloat();
			
			if(num % 3 == 0 && num > 0){
				qtdm++;
				mult += num;
			}
			
		}
		while(num!=0);
		media = (mult / qtdm);
		System.out.printf("\nA média de todos os números múltiplos de 3 é: %.1f",media);
		
	}

}
