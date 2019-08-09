package intro_ed;

import java.util.Scanner;

public class TAD2objeto {
	
	static Scanner entrada = new Scanner(System.in);
	
	static int dia=0;
	static int mes=0;
	static int ano=0;
	static int data=0;
	static int estacoes=0;
	
	public static void dia() {
		System.out.println("Digite o dia: ");
		dia = entrada.nextInt();
	}
	public static void mes() {
		System.out.println("Digite o mes: ");
		mes = entrada.nextInt();
	}
	public static void ano() {
		System.out.println("Digite o ano: ");
		ano = entrada.nextInt();
	}
	public static void data() {
		System.out.println("A data informada foi: "+dia+"/"+mes+"/"+ano);
	}
	public static void estacoes() {
		if(mes >= 9 || mes <= 3)
			System.out.println("Estacao de calor");
		else {
			System.out.println("Estacao de frio");
		}
	}
	
}

