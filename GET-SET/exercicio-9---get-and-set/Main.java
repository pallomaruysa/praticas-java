import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    Funcionario f = new Funcionario();
	    
		System.out.println("Digite o seu nome");
		f.setNome(sc.nextLine());
		System.out.println("Digite o seu Salário Bruto");
		f.setSalarioBruto(Double.parseDouble(sc.nextLine()));
		System.out.println("Digite o valor de imposto pago");
		f.setImposto(Double.parseDouble(sc.nextLine()));
		
		System.out.println("Digite apenas o valor da porcentagem de aumento do salário");
		f.aumentoSalario(Integer.parseInt(sc.nextLine()));
		
		
		f.setSalarioLiquido(f.getSalarioBruto(), f.getImposto());
		
		
		System.out.println("Nome: "+f.getNome()+" - Salário Bruto com aumento: "+f.getSalarioBruto()+" - Imposto: "+f.getImposto());
		System.out.println("Salário Líquido: "+f.getSalarioLiquido());
		

		
	}
}
