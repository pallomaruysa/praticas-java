/*                      Atividade Avaliativa - Prova (4 pontos)

                    Curso Técnico em Desenvolimento de Sistemas
                    
Diciplina: Desenvolimento de Sistemas                   Turma: E73009
Docente: Westn Melo                                     Data: 10/06/2021
Aluno(a): Palloma Ruysa Cardoso dos Santos Soares       Nota:   ?


*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("\n Calcule aqui o seu Imposto de Renda - Pessoa Física \n");
		System.out.println("Digite o seu nome");
        String n = sc.nextLine();
        System.out.println("Digite a sua idade");
        int i = Integer.parseInt(sc.nextLine());
        System.out.println("Digite a sua Renda Bruta Mensal");
        double rB = Double.parseDouble(sc.nextLine());
        System.out.println("------------------------------------------");
        
        System.out.println("Digite o seu CPF");
        String cpf = sc.nextLine();
        System.out.println("------------------------------------------");
        
        PessoaFisica pf = new PessoaFisica(n, i, rB, cpf);
        
        System.out.println("\n Calcule aqui o seu Imposto de Renda - Pessoa Jurídica \n");
		System.out.println("Digite o seu nome");
        String n2 = sc.nextLine();
        System.out.println("Digite a sua idade");
        int i2 = Integer.parseInt(sc.nextLine());
        System.out.println("Digite a sua Renda Bruta Mensal");
        double rB2 = Double.parseDouble(sc.nextLine());
        System.out.println("------------------------------------------");
        System.out.println("Digite o seu CNPJ");
        String cnpj = sc.nextLine();
        System.out.println("------------------------------------------");
        PessoaJuridica pj = new PessoaJuridica(n2, i2, rB2, cnpj);
        
        pf.Status(); // aqui status do objeto Pessoa Física 
        System.out.println("------------------------------------------");
        pj.Status(); // aqui status do objeto Pessoa Jurídica 
        
	}
}
