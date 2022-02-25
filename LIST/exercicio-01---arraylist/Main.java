// Faça um programa para ler nome e salário de dois funcionários. Depois, mostrar o salário médio deles.

import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Funcionario>ListaFuncionarios = new ArrayList<>();
        
        int i;
        
        for(i=0;i<3;i++){
            System.out.println("Digite o seu nome");
            String nome = sc.nextLine();
            System.out.println("Digite o seu salário");
            double salario = Double.parseDouble(sc.nextLine());
            
            Funcionario f = new Funcionario(nome, salario);
            ListaFuncionarios.add(f);
        }
        for(i=0;i<ListaFuncionarios.size();i++){
            System.out.println("Nome: "+ListaFuncionarios.get(i).getNome());
            System.out.println("Salário: "+ListaFuncionarios.get(i).getSalario());
        }
    }
}