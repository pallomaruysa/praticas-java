import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        Conta c1 = new Conta();
        
        c1.setNome("Palloma");
        c1.setNumero(1234);
        c1.setSaldo(100);
        
        System.out.println("Nome: "+c1.getNome()+" - Número da Conta: "+c1.getNumero()+" - Saldo: "+c1.getSaldo());
        c1.depositar(300);
        
        System.out.println("Nome: "+c1.getNome()+" - Número da Conta: "+c1.getNumero()+" - Saldo: "+c1.getSaldo());
        c1.sacar(100);
        
        System.out.println("Nome: "+c1.getNome()+" - Número da Conta: "+c1.getNumero()+" - Saldo: "+c1.getSaldo());
        System.out.println("");

        Conta c2 = new Conta();
        
        c2.setNome("Lucas");
        c2.setNumero(5678);
        c2.setSaldo(200);

        System.out.println("Nome: "+c2.getNome()+" - Número da Conta: "+c2.getNumero()+" - Saldo: "+c2.getSaldo());
        c2.depositar(200);

        System.out.println("Nome: "+c2.getNome()+" - Número da Conta: "+c2.getNumero()+" - Saldo: "+c2.getSaldo());
        c2.sacar(300);

        System.out.println("Nome: "+c2.getNome()+" - Número da Conta: "+c2.getNumero()+" - Saldo: "+c2.getSaldo());

        
        
    }
}
    
