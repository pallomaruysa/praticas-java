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
        p1.nome = sc.nextLine();
        System.out.println("Digite sua idade");
        p1.idade = Integer.parseInt(sc.nextLine());
        
        System.out.println("Digite seu nome");
        p2.nome = sc.nextLine();
        System.out.println("Digite sua idade");
        p2.idade = Integer.parseInt(sc.nextLine());
        
        
        Pessoa vivido = p1.m_idade(p1, p2);
        
        System.out.println("O nome da pessoa mais velha é: "+vivido.nome+ " com "+vivido.idade+ " anos de idade");
        
    }
}
