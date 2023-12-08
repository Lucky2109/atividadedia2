package atividadedia2;

import java.util.Scanner;

public class AtividadeDia2n5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leia = new Scanner(System.in);
		
		int idade, inc =1, soma = 0;
		


		while(inc>= 0) {
			System.out.println("Digite um numero: ");
			idade = leia.nextInt();
			if(idade>0) {
				
		soma=soma+idade;
				
			}if(idade<0) {
				
				
			}if(idade==0) {
				inc = -10;
				System.out.println("a soma dos numeros positivos é :" +soma);
			}
			
			
			
			
			
			
		
		}

	}

}
