//Atividade de Revisão
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {
	    
	     ArrayList<Produtos>ListaProdutos = new ArrayList();
	     
    	    System.out.println("\n Produto Esportivo");
    	    String nome = "Camisa";
    	    int cod = 12345;
    	    double val = 30.00;
    	    Esportes es = new Esportes(cod, nome, val);
    	    ListaProdutos.add(es);
    	    System.out.println(nome+": "+val);
    	  
    	    System.out.println("\n Produto Informática");
    	    String nome1 = "PC gamer";
    	    int cod1 = 56784;
    	    double val1 = 8000.00;
    	    Informatica in = new Informatica(cod1, nome1, val1);
    	    ListaProdutos.add(in);
    	    System.out.println(nome1+": "+val1);
    	    
    	    System.out.println("__________________________________________________");
    	    System.out.println("Produto Esportivo com desconto: "+es.CalcularDesconto());
    	    System.out.println("Produto Informática com desconto: "+in.CalcularDesconto());
    	    
    	    System.out.println("\n Realizando a Compra");
    	    String nomeComprador = "Palloma Ruysa";
            double valorTotal = es.getValor() + in.getValor();

	        Compra c = new Compra(nomeComprador, ListaProdutos, valorTotal);
	        
	        System.out.println("Total da compra: "+c.CalcularValorTotal());
	        System.out.println("__________________________________________________");
	        System.out.println("\n Status da compra realizanda \n");
	        c.Status();
	    
		
	}
}

