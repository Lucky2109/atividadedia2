package atividadedia2;
import java.util.Scanner;
import java.util.Arrays;
public class atividadeDia2n2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int contadorpar=0,contadorimpar=0;
		
		for(int i = 0; i <= 9; i++) {
			System.out.println("Digite o "+n [i]+" numero: ");
			n[i] =leia.nextInt();
			
		}
		
		
		for(int i = 0; i <= 9; i++) {	
			 if(n[i] % 2 == 0) {
				contadorpar++;				 
				 
			 }else {
				 contadorimpar++;
				 		 
			 }
		}
			 System.out.println("O numero de numeros pares é:  "+contadorpar);
			 System.out.println("O numero de numeros impares é:  "+contadorimpar);
			 
			
			
			
			
		
	}

}
