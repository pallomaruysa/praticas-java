import java.util.Scanner;
public class Main

{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    Produto p1 = new Produto();
	    
	    System.out.println("Digite o seu nome");
	    p1.setNome(sc.nextLine());
	    
	    System.out.println("Digite o valor do produto");
	    p1.setPreco(Double.parseDouble(sc.nextLine()));
	    
	    System.out.println("Digite a quantidade do produto");
	    p1.setQuantidade(Integer.parseInt(sc.nextLine()));
	    
	    
	    
	    System.out.println("Deseja adicionar produtos? Se sim, digite aqui a quantidade. Se não, digite 0");
	    p1.adicionar(Integer.parseInt(sc.nextLine()));
	    System.out.println("Deseja remover produtos? Se sim, digite aqui a quantidade. Se não, digite 0");
	    p1.remover(Integer.parseInt(sc.nextLine()));
	    
	    
	     
	    p1.setValorTotal(p1.getPreco(), p1.getQuantidade());
	    
	    
	    
	    System.out.println("Nome do usuário: "+p1.getNome());
	    System.out.println("Valor Total do Produto (preço x quantidade): "+p1.getValorTotal());
	    System.out.println("Quantidade de produtos: "+p1.getQuantidade());
	    
	    
	   
	    
	    
	    
	    
	}
}
