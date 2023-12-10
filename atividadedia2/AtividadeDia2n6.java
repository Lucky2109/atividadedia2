package atividadedia2;
import java.util.Scanner;
public class AtividadeDia2n6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, inc =1 ;
		double media = 0, contador = 0;


		do {
			System.out.println("Digite um numero: ");
			idade = leia.nextInt();
			
			if(!(idade == 0)) {
				if(idade%3 ==0) {
				
				media++;
				contador = contador + idade;}
				
			}else {
				
				System.out.println("A média dos numeros multiplos de 3 digitados é: " +contador/media);			
				inc = -10;}
				
			}while(inc>= 0);
			
		
		
		// TODO Auto-generated method stub

	}

}
