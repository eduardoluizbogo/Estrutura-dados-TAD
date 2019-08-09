package intro_ed;

import java.util.Scanner;

public class TAD3_ED {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int op;
		boolean tomada = true;
		
		do {
		System.out.println("==== Trabalhando com Vetor ====");
		System.out.println("Escolha uma opção:");
		System.out.println(" 1 - Preencher vetor");
		System.out.println(" 2 - Mostrar vetor");
		System.out.println(" 3 - Mostrar vetor inverso");
		System.out.println(" 4 - Sair");
		System.out.print(" Opção -> ");
		op = entrada.nextInt();
		
		
		switch(op){
		case 1:
			TAD3_objeto.criarVetor();
			break;
		case 2:
			TAD3_objeto.mostraVetor();
			break;
		case 3:
			TAD3_objeto.mostrarVetorInverso();
			break;
		case 4:
			tomada = false;
			break;
			default:
				System.out.println("Opção inválida!");
		}
		
	} while(tomada == true);
		System.out.println("Voce saiu");
		
		entrada.close();

  }

	
}
