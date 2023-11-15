package LacoRepeticao;

import java.util.Scanner;

public class ParOuImparFor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num,i,par = 0, impar = 0;
		
		for(i = 0;i < 10; i++) {
			System.out.print("\nDigite o "+(i+1)+"° número: ");
			num = leia.nextInt();
			if(num % 2 == 0){
				par++;
			}else {
				impar++;
			}
		}
		
		System.out.print("\nTotal de números pares: "+par);
		System.out.print("\nTotal de números impares: "+impar);
	}
}
