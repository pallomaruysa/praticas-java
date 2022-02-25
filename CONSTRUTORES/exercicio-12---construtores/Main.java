// Monitor de Frequência Cardíaca
import java.util.Scanner;

public class Main{
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome");
        String n = sc.nextLine();
        System.out.println("Digite seu sobrenome");
        String s = sc.nextLine();
        System.out.println("Digite o seu ano de nascimento");
        int an = Integer.parseInt(sc.nextLine());
        
        Pessoa p1 = new Pessoa(n, s, an);
        System.out.println("");
        
        System.out.println("Nome: "+p1.getNome()+" "+p1.getSobrenome());
        System.out.println("Ano Atual: "+p1.getAnoAtual()+" - Idade: "+p1.Idade());
        System.out.println("Frequência Cardíaca Máxima: "+p1.Fcard_max());
        p1.Fcard_alvo();
        
        //p1.Fcard_alvo(p1.Fcard_max(p1.Idade()));
        
    }

}

