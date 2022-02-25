import java.util.Scanner;
public class Main

{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    Produto p1 = new Produto();
	    
	    System.out.println("Digite o seu nome");
	    p1.nome = sc.nextLine();
	    
	    System.out.println("Digite o valor do produto");
	    p1.preco = Double.parseDouble(sc.nextLine());
	    
	    System.out.println("Digite a quantidade do produto");
	    p1.quantidade = Integer.parseInt(sc.nextLine());
	    
	    
	    
	    System.out.println("Deseja adicionar produtos? Se sim, digite aqui a quantidade. Se não, digite 0");
	    int x = Integer.parseInt(sc.nextLine());
	    System.out.println("Deseja remover produtos? Se sim, digite aqui a quantidade. Se não, digite 0");
	    int y = Integer.parseInt(sc.nextLine());
	    
	    p1.adicionar(x);
	    p1.remover(y);
	    
	    
	    
	    
	    System.out.println("Nome do usuário: "+p1.nome);
	    System.out.println("Valor Total do Produto (preço x quantidade): "+p1.valortotal());
	    System.out.println("Quantidade de produtos: "+p1.quantidade);
	    
	    
	   
	    
	    
	    
	    
	}
}
