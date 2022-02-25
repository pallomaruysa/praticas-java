// Atividade Avaliativa

import java.util.Scanner;

public class Main
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);

      System.out.println("Oii!! Tudo bom?? \n");
      System.out.println("Por favor digite a cor da casa.");
      String cor = sc.nextLine();
      System.out.println("Digite o número da casa");
      int num = Integer.parseInt(sc.nextLine());
      System.out.println("Digite a quantidade de portas da casa.");
      int qtnportas = Integer.parseInt (sc.nextLine());
      System.out.println("Digite a quantidade de janelas da casa.");
      int qtnjanelas = Integer.parseInt(sc.nextLine());

      CasaVelha cv = new CasaVelha(cor, num, qtnportas, qtnjanelas);

      cv.status();
      cv.abrirCasa();
      cv.entrar();
      System.out.println("Deseja pintar a casa? Se sim, digite a cor, se não, aperte enter.");
      cv.pintarCasa(sc.nextLine ());
      System.out.println("Deseja adicionar portas? Se sim, digite a quantidade, se não, aperte enter.");
      cv.addportas(Integer.parseInt (sc.nextLine()));
      System.out.println("Deseja adicionar janelas? Se sim, digite a quantidade, se não, aperte enter.");
      cv.addjanelas(Integer.parseInt (sc.nextLine()));
      cv.status();
      cv.fecharCasa();
      cv.status();
      cv.entrar();

  }
}
