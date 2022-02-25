//switch - case [test]

import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    Escolha es = new Escolha();
	    
	    ArrayList<String>Opcao = new ArrayList<>(); 
	    
	    int i, ingresso;
	    for(i=1;i<3;i++){
    	    System.out.println("\n COMPRA DE INGRESSOS \n");
    	    System.out.println("Digite o número da opção desejada");
    	    System.out.println("1 - Ingresso Normal (R$ 30,00)");
    	    System.out.println("2 - Ingresso VIP (R$ 45,00)");
    	    System.out.println("3 - Ingresso Camarote Superior (R$ 95,00)");
    	    es.ingresso(Integer.parseInt(sc.nextLine()));
	        System.out.println("");
	    }
	}
}
