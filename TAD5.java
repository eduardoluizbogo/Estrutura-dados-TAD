package intro_ed;

import java.util.Scanner;

public class TAD5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int digito1 = 0;
		
		System.out.println("Digite um CPF para saber se e valido ou nao: ");
		TAD5_objeto.valor = entrada.nextInt();
		
		System.out.println("Digite o digito verificador: ");
		digito1 = entrada.nextInt();
		
		TAD5_objeto.cpf();
		
		if(digito1 == TAD5_objeto.digito)
			System.out.println("O CPF e valido!");
		else
			System.out.println("O CPF e invalido!");
								
		entrada.close();
	}

}
