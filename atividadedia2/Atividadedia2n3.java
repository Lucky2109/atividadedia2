package atividadedia2;
import java.util.Arrays;
import java.util.Scanner;

public class Atividadedia2n3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leia = new Scanner(System.in);
		
int idade, menor21=0, maior50=0, inc =1 ;


while(inc>= 0) {
	System.out.println("Digite sua idade");
	idade = leia.nextInt();
	if(idade<0) {
		System.out.println("Total de pessoas menores de 21: " +menor21);
		System.out.println("Total de pessoas maiores de 50: "+maior50 );
		inc = -10;
	}
	if(idade< 21) {
		
		menor21 = menor21 + 1;
		
	}if(idade>51) {
		maior50 = maior50 + 1;
		
	}
	
	
	
	
	
}
			
			
			
		}
	
	
	
		
	
		
		
	}


