import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		System.out.println("Digite seu nome");
        c1.setNome(sc.nextLine());
        System.out.println("Digite o número da conta");
        c1.setNumero(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o seu saldo");
        c1.setSaldo(Double.parseDouble(sc.nextLine()));
        
        System.out.println("");
        
        System.out.println("Deseja depositar algum valor? Se sim, digite o valor, caso não digite 0");
        c1.depositar(Double.parseDouble(sc.nextLine()));
        
        System.out.println("");
        System.out.println("Novo saldo: "+c1.getSaldo());
        
        System.out.println("");
        
        System.out.println("Deseja sacar algum valor? Se sim, digite o valor, caso não digite 0");
        c1.sacar(Double.parseDouble(sc.nextLine()));
        
        System.out.println("");
        System.out.println("Novo saldo: "+c1.getSaldo());
        System.out.println("");
        
        System.out.println("Digite seu nome");
        c2.setNome(sc.nextLine());
        System.out.println("Digite o número da conta");
        c2.setNumero(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o seu saldo");
        c2.setSaldo(Double.parseDouble(sc.nextLine()));
        System.out.println("");
        
        System.out.println("Deseja depositar algum valor? Se sim, digite o valor, caso não digite 0");
        c2.depositar(Double.parseDouble(sc.nextLine()));
        System.out.println("");
        
        System.out.println("Novo saldo: "+c2.getSaldo());
        System.out.println("");
        
        System.out.println("Deseja sacar algum valor? Se sim, digite o valor, caso não digite 0");
        c2.sacar(Double.parseDouble(sc.nextLine()));
        System.out.println("");
        
        System.out.println("Novo saldo: "+c2.getSaldo());
	}
}
