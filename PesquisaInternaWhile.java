package LacoRepeticao;

import java.util.Scanner;

public class PesquisaInternaWhile {

	public static void main(String[] args) {
		int idade,gen,dev,back = 0,mtdf = 0,htdmm40 = 0,nbf30 = 0,ptotal =0, mediaIdade = 0;
		String resp = "s";
		Scanner ler = new Scanner(System.in);
		System.out.println("Pesquisa Interna");
		
		while(resp.equalsIgnoreCase("s")) {
			System.out.print("Qual a idade: ");
			idade = ler.nextInt();
			
			System.out.println("Sendo:");
			System.out.println("1 - Mulher Cis");
			System.out.println("2 - Homem Cis");
			System.out.println("3 - Não Binário");
			System.out.println("4 - Mulher Trans");
			System.out.println("5 - Homem Trans");
			System.out.println("6 - Outros");
			
			System.out.print("Qual gênero: ");
			gen = ler.nextInt();
			
			System.out.println("Sendo:");
			System.out.println("1 - Backend");
			System.out.println("2 - Frontend");
			System.out.println("3 - Mobile");
			System.out.println("4 - FullStack");
			
			System.out.print("Qual área Dev: ");
			dev = ler.nextInt();
			
			if(dev == 1) { 
				back++;
			} else if ((gen == 1 || gen == 4) && dev == 2) {
				mtdf++;
			} else if ((gen == 2 || gen == 5) && dev == 3 && idade > 40) {
				htdmm40++;
			} else if (gen == 3 && dev == 4 && idade < 30) {
				nbf30++;
			}
			ptotal++;
			
			mediaIdade += idade;
			
			System.out.println("\nQuer adicionar um novo colaboarador?(S/N)");
			resp = ler.next();
		}
		mediaIdade  = mediaIdade / ptotal;
		System.out.print("\nTotal de pessoas desenvolvedoras Backend: "+back);
		System.out.print("\nTotal de Mulheres Cis e Trans desenvolvedoras Frontend: "+mtdf);
		System.out.print("\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: "+htdmm40);
		System.out.print("\nTotal de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: "+nbf30);
		System.out.print("\nO número total de pessoas que responderam à pesquisa: "+ptotal);
		System.out.print("\nA média de idade das pessoas que responderam à pesquisa: "+mediaIdade);
		
	}

}
