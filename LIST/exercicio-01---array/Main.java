// Faça um programa para ler nome e salário de dois funcionários. Depois, mostrar o salário médio deles.

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        Funcionario f[] = new Funcionario[3];
        int i;
        for(i=0;i<3;i++){
            System.out.println("Digite o seu nome");
            String nome = sc.nextLine();
            System.out.println("Digite o seu salário");
            double salario = Double.parseDouble(sc.nextLine());
            
            f[i] = new Funcionario(nome, salario);
        }
        for(i=0;i<3;i++){
            System.out.println("Nome: "+f[i].getNome());
            System.out.println("salário: "+f[i].getSalario());
        }
    }
}