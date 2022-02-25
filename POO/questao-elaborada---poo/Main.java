
public class Main
{
	public static void main(String[] args) 
	{
		Conta c1 = new Conta();
		
		c1.numero = 102030;
		c1.dono = "Palloma Ruysa";
		c1.saldo = 3000.00;
		
		System.out.println("Conta n. "+c1.numero);
		System.out.println("Nome: "+c1.dono);
		System.out.println("Saldo "+c1.saldo);
		
		c1.depositar(500);
		
		System.out.println("Conta n. "+c1.numero);
		System.out.println("Nome: "+c1.dono);
		System.out.println("Saldo "+c1.saldo);
		
		c1.sacar(200);
		
		System.out.println("Conta n. "+c1.numero);
		System.out.println("Nome: "+c1.dono);
		System.out.println("Saldo "+c1.saldo);
	}
}
