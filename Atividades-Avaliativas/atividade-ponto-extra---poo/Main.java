import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    Conta conta1 = new Conta();
	    Conta conta2 = new Conta();
	    
	    double a, b, c, x, y, z;
	    int c1, c2;
	    
	    
		System.out.println("Digite seu nome");
		conta1.dono = sc.nextLine();
		System.out.println("Digite o número da conta");
		conta1.numero = Integer.parseInt(sc.nextLine());
		System.out.println("Digite seu saldo");
		conta1.saldo = Double.parseDouble(sc.nextLine());
		
		System.out.println("");
		
		
		System.out.println("Deseja depositar algum dinheiro? Se sim digite o valor a ser depositado, se não digite 0");
	    a = Double.parseDouble(sc.nextLine());
		
		double valor1 = conta1.depositar(a);
		
		System.out.println("Saldo atual: "+conta1.saldo);
		
		System.out.println("");
		
		
		System.out.println("Deseja sacar algum dinheiro? Se sim digite o valor a ser sacado, se não digite 0");
		b = Double.parseDouble(sc.nextLine());
		
		double valor2 = conta1.sacar(b);
		
		System.out.println("Saldo atual: "+conta1.saldo);
		
		System.out.println("");
		
		
		System.out.println("Deseja transferir algum dinheiro? Se sim digite a conta a ser transferido o valor, se não digite 0");
		c1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Agora digite o valor a ser transferido, ou digite 0 para pular");
		c = Double.parseDouble(sc.nextLine());
		
		double valor3 = conta1.transferir(c);
		
		System.out.println("Conta à transferir: "+c1);
		System.out.println("Saldo atual: "+conta1.saldo);
		
		System.out.println("");
		
		
		
		
		System.out.println("Digite seu nome");
		conta2.dono = sc.nextLine();
		System.out.println("Digite o número da conta");
		conta2.numero = Integer.parseInt(sc.nextLine());
		System.out.println("Digite seu saldo");
		conta2.saldo = Double.parseDouble(sc.nextLine());
		
		System.out.println("");
		
		System.out.println("Deseja depositar algum dinheiro? Se sim digite o valor a ser depositado, se não digite 0");
	    x = Double.parseDouble(sc.nextLine());
		
		double valor4 = conta2.depositar(x);

		System.out.println("Saldo atual: "+conta2.saldo);
		
		System.out.println("");
		
		System.out.println("Deseja sacar algum dinheiro? Se sim digite o valor a ser sacado, se não digite 0");
		y = Double.parseDouble(sc.nextLine());
		
		double valor5 = conta2.sacar(y);
		
		System.out.println("Saldo atual: "+conta2.saldo);
		
		System.out.println("");
		
		
		System.out.println("Deseja transferir algum dinheiro? Se sim digite a conta a ser transferido o valor, se não digite 0");
		c2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Agora digite o valor a ser transferido, ou digite 0 para pular");
		z = Double.parseDouble(sc.nextLine());
		
		double valor6 = conta2.transferir(z);
		
		System.out.println("Conta à transferir: "+c2);
		System.out.println("Saldo atual: "+conta2.saldo);
		
		
		
	}
}
