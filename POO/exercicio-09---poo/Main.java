import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    Funcionario f = new Funcionario();
	    
		System.out.println("Digite o seu nome");
		f.nome = sc.nextLine();
		System.out.println("Digite o seu Salário Bruto");
		f.salarioBruto = Double.parseDouble(sc.nextLine());
		System.out.println("Digite o valor de imposto pago");
		f.imposto = Double.parseDouble(sc.nextLine());
		
		System.out.println("Digite apenas o valor da porcentagem de aumento do salário");
		int x = Integer.parseInt(sc.nextLine());
		f.aumentoSalario(x);
		
		double sL = f.salarioLiquido(f.salarioBruto, f.imposto);
		
		
		System.out.println("Nome: "+f.nome+" - Salário Bruto com aumento: "+f.salarioBruto+" - Imposto: "+f.imposto);
		System.out.println("Salário Líquido: "+sL);
		

		
	}
}
