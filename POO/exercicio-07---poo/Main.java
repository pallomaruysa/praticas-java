// Faça um programa para ler nome e salário de dois funcionários. Depois, mostrar o salário médio deles.

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        
        System.out.println("Digite o seu nome");
        f1.nome = sc.nextLine();
        
        System.out.println("Digite o seu salário");
        f1.salario = Double.parseDouble(sc.nextLine());
        
        
        System.out.println("Digite seu nome");
        f2.nome = sc.nextLine();
        
        System.out.println("Digite seu salário");
        f2.salario = Double.parseDouble(sc.nextLine());
        
        double media = f1.salariomedio(f1, f2);
        
        System.out.println("Salário Médio dos funcionários: "+media);
        
    }
}