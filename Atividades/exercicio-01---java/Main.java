import java.util.Scanner;
public class Main

{
	public static void main(String[] args) 
	{
			Scanner sc = new Scanner (System.in);
			
		// QUESTÃO 01
			System.out.println("Digite um número");
			int n1 = sc.nextInt();
			System.out.println("Digite um número");
			int n2 = sc.nextInt();
			
			System.out.println("Os números digitados foram: "+n1+ " e "+n2);
			
			if(n1>n2)
			{
			    System.out.println("Maior = "+n1+ "; Menor = "+n2);
			}
			else
			if (n2>n1)
			{
			    System.out.println("Maior = "+n2+ "; Menor = "+n1);
			}
			else
			{
			    System.out.println("Esses valores são iguais!");
			}
			
		//QUESTÃO 02
		
			double media = (n1+n2)/2;
			System.out.println("Média dos números = "+media);
			
		
		//QUESTÃO 03
		
			System.out.println("Digite um número");
			int par_impar = sc.nextInt();
			
			if(par_impar%2==0)
			{
			    System.out.println("Esse valor é par: "+par_impar);
			}
			else
			{
			    System.out.println("Esse valor é ímpar: "+par_impar);
			}
			
			
		// QUESTÃO 04
		
		    System.out.println("Digite seu ano de nascimento");
		    int ano_nasc = sc.nextInt();
		    
		    System.out.println("Digite o ano atual");
		    int ano_atual = sc.nextInt();
		    
		    int idade = ano_atual - ano_nasc;
		    System.out.println("Sua idade é: "+idade);
	    
	    
	    //QUESTÃO 05
	    
	        int ant, suc;
	        
	        System.out.println("Digite um número");
	        int n = sc.nextInt();
	        
	        ant = n-1;
	        suc = n+1;
	        System.out.println("O valor digitado foi: "+n+"; Seu sucessor é: "+suc+"; Seu antecessor é: "+ant);
	    
	        sc.close();
	}
}


