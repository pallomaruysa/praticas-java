//Atividade Avaliativa - 3 pontos

import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Ingresso in = new Ingresso();
	    IngressoVIP vip = new IngressoVIP();
	    IngressoNormal nor = new IngressoNormal();
	    IngressoCamaroteSuper cs = new IngressoCamaroteSuper();
	    Venda vd = new Venda();
	    
	    ArrayList<Ingresso>NumeroIn = new ArrayList<>(); //NumeroIn => Numero do Ingresso
	    
	    System.out.println("Digite quantas pessoas vão comprar ingressos");
	    int qnt = Integer.parseInt(sc.nextLine()); //qnt-> quantidade;
	    
	    int i;
	    for(i=1;i<=qnt;i++){
    	    System.out.println("\n COMPRA DE INGRESSOS \n");
    	    System.out.println("Digite seu nome");
    	    String n = sc.nextLine();
    	    System.out.println("Digite o seu CPF");
    	    String cpf = sc.nextLine();
    	    System.out.println("Digite a data (dd/mm/aaaa)");
    	    String data = sc.nextLine();
    	    System.out.println("Digite o horário da compra (hh:mm)");
    	    String h = sc.nextLine();
	        System.out.println("");
	        
	        in = new Ingresso(n, cpf, data, h, i);
	        vip = new IngressoVIP(n, cpf, data, h, i);
	        nor = new IngressoNormal(n, cpf, data, h, i);
	        cs = new IngressoCamaroteSuper(n, cpf, data, h, i);
	        vd = new Venda(n, cpf, data, h, i, NumeroIn);
	        
	        NumeroIn.add(in);
	        NumeroIn.add(vip);
	        NumeroIn.add(nor);
	        NumeroIn.add(cs);
	    }
	    NumeroIn.get(i).status();
	   
	    
	    System.out.println("Digite quantos ingressos você pretende comprar");
	    int qnt2 = Integer.parseInt(sc.nextLine());
	    
    	    for(i=1;i<=qnt2;i++){
        	    System.out.println("Digite o número da opção desejada");
        	    System.out.println("1 - Ingresso Normal = R$30,00");
        	    System.out.println("2 - Ingresso VIP = R$34,50");
        	    System.out.println("3 - Ingresso Camarote Superior = R$39,00");
        	    int ingresso = Integer.parseInt(sc.nextLine());
    	        System.out.println("");
    	        
    	        double IN = 0, VP = 0, CS = 0;
    	        
                switch(ingresso){
                    
                    case 1: 
                        System.out.println("Digite a quantidade de ingressos Normais");
                        IN = Double.parseDouble(sc.nextLine());
                        break;
                    
                    case 2: 
                        System.out.println("Digite a quantidade de ingressos VIPs");
                        VP = Double.parseDouble(sc.nextLine());
                        break;
                    
                    case 3: 
                        System.out.println("Digite a quantidade de ingressos Camarote-Superior");
                        CS = Double.parseDouble(sc.nextLine());
                        break;
                        
                    
                    
                    default: System.out.println("Opção Inválida!");
                }
                Venda vd2 = new Venda(IN,VP,CS);
    	    }
	    System.out.println(nor.ValorIn());
        System.out.println(vip.ValorIn());
        System.out.println(cs.ValorIn());
            

        System.out.println("O valor total é "+vd.TotalVenda());

	}
}

