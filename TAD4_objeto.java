
package intro_ed;

import java.util.Scanner;

public class TAD4_objeto {
			
		static Scanner entrada = new Scanner(System.in);
			
		static int conta=0;
		static int j=0;
		static int b=0;
		static int valor=0;
		static int c=0,d=0,e=0,f=0,g=0,h=0,i=0,a=0,k=0,l=0;
		static int resto=0;
		static int digito=0;
		
		public static void cpf() {
		
		System.out.println("Insira o valor de um CPF (xxxxxx): ");
		valor = entrada.nextInt();
	
		a = valor % 10;
		b = (valor % 100) / 10;
		c = (valor % 1000) / 100;
		d = (valor % 10000) / 1000;
		e = (valor % 100000) / 10000;
		f = (valor % 1000000) / 100000;
				
		conta = (f * 7) + (e * 6) + (d * 5) + (c * 4) + (b * 3) + (a * 2);
		
		resto = conta % 11;
		
		digito = 11 - resto;
		
		if(digito == 10 || digito == 11)
			digito = 0;
		
		System.out.println("digito: "+digito);
		
		}
	}
