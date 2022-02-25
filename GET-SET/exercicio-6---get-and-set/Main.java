// Fazer um programa para ler os dados de duas pessoas, depois mostrar o nome da pessoa mais velha.

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
       
        
        System.out.println("Digite o seu nome");
        p1.setNome(sc.nextLine());
        System.out.println("Digite sua idade");
        p1.setIdade(Integer.parseInt(sc.nextLine()));
        
        System.out.println("Digite seu nome");
        p2.setNome(sc.nextLine());
        System.out.println("Digite sua idade");
        p2.setIdade(Integer.parseInt(sc.nextLine()));
        
        
        Pessoa maisvelho = p1.MaiorIdade(p1, p2);
        
        System.out.println("O nome da pessoa mais velha é: "+maisvelho.nome+ " com "+maisvelho.idade+ " anos de idade");
        
    }
}

