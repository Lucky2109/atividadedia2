package atividadedia2;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
public class AtividadeDia2n4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
	int mulhercis=0, homemcis=0, naobinario=0, mulhertrans=0, homemtrans=0, outros=0, backend=0, frontend=0, mobile=0, fullstack=0, genero=0, profissa=0;
		
		int i,idade = 0, idadesoma = 0, pessoas = 0, casex, case2;
		String confirmacao="S";
		
		System.out.println("1 – Mulher Cis\r\n"
				+ "2 – Homem Cis\r\n"
				+ "3 – Não Binário\r\n"
				+ "4 – Mulher Trans\r\n"
				+ "5 – Homem Trans\r\n"
				+ "6 – Outros\r\n"
				+ "");
		System.out.println("Pessoa Desenvolvedora (Número Inteiro):\r\n"
				+ "1 – Backend\r\n"
				+ "2 – Frontend\r\n"
				+ "3 – Mobile\r\n"
				+ "4 – FullStack\r\n"
				+ "");
		
		while(confirmacao.equals("S"))  {
			System.out.println("Digite sua idade: ");
			idade =leia.nextInt();
			pessoas++;
			idadesoma = idade/pessoas;
			
			
				System.out.println("Digite o codigo de seu genero: ");
				genero =leia.nextInt();
			
	
			System.out.println("Digite o codigo de sua categoria: ");
				profissa =leia.nextInt();
			
			
			System.out.println("Deseja continuar a leitura de dados: ");
			confirmacao =leia.nextLine();
			
			switch(casex) {
		
			
		case 1: 
			System.out.println("Digite o codigo de seu genero: ");
			profissa =leia.nextInt();
	        mulhercis++;
	        break;
	   
	        
		case 2: 
			System.out.println("Digite o codigo de seu genero:  ");
			profissa =leia.nextInt();
	        homemcis++;
	        break;
	        
		case 3: 
			System.out.println("Digite o de seu genero:  ");
			profissa =leia.nextInt();
	        naobinario++;
	        break;   
	        
		case 4: 
			System.out.println("Digite o codigo de seu genero:  ");
			profissa =leia.nextInt();
	        mulhertrans++;
	        break;
		case 5: 
			System.out.println("Digite o codigo de seu genero:  ");
			profissa =leia.nextInt();
	        homemtrans++;
	        break;
		case 6: 
			System.out.println("Digite o de seu genero:  ");
			profissa =leia.nextInt();
	        homemcis++;
	        break;
	        
		default:System.out.println("Codigo invalido");
	        
}
			switch(case2) {
			
			
			case 1: 
				System.out.println("Digite o codigo de sua categoria: ");
				profissa =leia.nextInt();
		        mulhercis++;
		        break;
		   
		        
			case 2: 
				System.out.println("Digite o codigo de sua categoria: ");
				profissa =leia.nextInt();
		        homemcis++;
		        break;
		        
			case 3: 
				System.out.println("Digite o codigo de sua categoria: ");
				profissa =leia.nextInt();
		        naobinario++;
		        break;   
		        
			case 4: 
				System.out.println("Digite o codigo de sua categoria: ");
				profissa =leia.nextInt();
		        mulhertrans++;
		        break;
			
		        
			default:System.out.println("Não temos essa profissão ");
		        
	}
	      
	    
	        
	        
	        
	    
		
		}
			
			
			
			
			
			
			
			
			
			
			
		}
		

		
		
	}

}
