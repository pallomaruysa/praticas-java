import java.util.Scanner;

public class Main
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    Aluno A1 = new Aluno ();

    System.out.println("Digite o do aluno");
    A1.nome = sc.nextLine ();

    System.out.println("Digite a idade do aluno");
    A1.idade = Integer.parseInt (sc.nextLine());

    System.out.println("Digite a matrícula do aluno");
    A1.matricula = Integer.parseInt(sc.nextLine());

    System.out.println("");
    
    System.out.println("Digite a nota 1");
    A1.nota1 = Double.parseDouble(sc.nextLine());
    System.out.println("Digite a nota 2");
    A1.nota2 = Double.parseDouble(sc.nextLine());
    



    double m = A1.media(A1.nota1, A1.nota2);
    double maior = A1.maior(A1.nota1, A1.nota2);



    System.out.println("");
    
    System.out.println("Nome do aluno: " +A1.nome);
    System.out.println("Idade: " +A1.idade);
    System.out.println("Matríccula: " +A1.matricula);
    System.out.println("Média de notas: " +m);
    System.out.println("Nota maior: " +maior);



  }
}
