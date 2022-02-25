import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
    //QUESTÃO 01
    
        System.out.println("Digite o nome do aluno");
        String nome= sc.nextLine();
        
        System.out.println("Digite a nota 1");
        double n1 = sc.nextDouble();
        System.out.println("Digite a nota 2");
        double n2 = sc.nextDouble();
        System.out.println("Digite a nota 3");
        double n3 = sc.nextDouble();
        
        double media = (n1+n2+n3)/3;
        
        if(media>7)
        {
            System.out.println("Aluno: "+nome+" Aprovado com a média de: "+media);
        }
        else
        {
            System.out.println("Aluno: "+nome+" Reprovado com a média de: "+media);
            
        }
    
    //  QUESTÃO 02
    
   int i, cont=0;
    
    for(i=0;i<2;i++)
    {
        System.out.println("Digite o nome do aluno");
        String aluno = sc.nextLine();
        System.out.println("Digite a média do aluno");
        double media = Double.parseDouble(sc.nextLine());
        
        if(media>8)
        {
            cont++;
        }
        
    }
    
    System.out.println("Quantidade de alunos com média acima de 8: "+cont);
    
    //  QUESTÃO 03

    int i,cont=0;
    
    for(i=0;i<80;i++)
    {
        System.out.println("Digite um valor");
        int num = sc.nextInt();
        
        if(num>=10 && num<=150)
        {
            cont++;
        }
    }
    
        System.out.println("Existem "+cont+" números entre 10 e 150");
    
    


     
    //  QUESTÃO 04
    
        double ct, s_total;
        
        System.out.println("Digite seu nome");
        String nome = sc.nextLine();
        
        System.out.println("Digite seu salário fixo");
        double s_fixo = sc.nextDouble();
        System.out.println("Digite o total de vendas efetuadas nesse mês em dinheiro");
        double c = sc.nextDouble();
        
        ct = 0.15 * c;
        s_total = ct + s_fixo;
        
        System.out.println("Nome do Vendedor: "+nome+" Salário Fixo: "+s_fixo+"/ Salário Total: "+s_total);
       
        sc.close();
    }
}



