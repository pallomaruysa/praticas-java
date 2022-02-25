import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        
        System.out.println("Digite o nome do aluno");
        a1.nome = sc.nextLine();
        System.out.println("Digite a matrícula");
        a1.matricula = Integer.parseInt(sc.nextLine());
        System.out.println("Digite a nota 1");
        a1.nota1 = Double.parseDouble(sc.nextLine());
        System.out.println("Digite a nota 2");
        a1.nota2 = Double.parseDouble(sc.nextLine());
        double mediaAluno1  = a1.calcularmedia(a1.nota1, a1.nota2);
        double maiorNota1 = a1.maiornota(a1.nota1, a1.nota2);
        
        System.out.println("Digite o nome do aluno");
        a2.nome = sc.nextLine();
        System.out.println("Digite a matrícula");
        a2.matricula = Integer.parseInt(sc.nextLine());
        System.out.println("Digite a nota 1");
        a2.nota1 = Double.parseDouble(sc.nextLine());
        System.out.println("Digite a nota 2");
        a2.nota2 = Double.parseDouble(sc.nextLine());
        double mediaAluno2 = a2.calcularmedia(a2.nota1, a2.nota2);
        double maiorNota2 = a2.maiornota(a2.nota1, a2.nota2);
        
        double maiorMedia = a1.maiormedia(a1, a2);
        String maiorMedia2 = a2.maiormedia2(a1, a2);
        
        
        
        System.out.println("Aluno: "+a1.nome+" - Matrícula : "+a1.matricula+" - Média : "+mediaAluno1+" - Maior nota: "+maiorNota1);
        System.out.println("Aluno: "+a2.nome+" - Matrícula : "+a2.matricula+" - Média : "+mediaAluno2+" - Maior nota: "+maiorNota2);
        System.out.println("Nome do aluno com média maior: "+maiorMedia2+" - Média: "+maiorMedia);
        
        
        
        
    }
}