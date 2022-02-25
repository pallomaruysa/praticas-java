/******************************************************************************

Crie um sistema que possa vender celular com capinhas

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Escolha a marca do celular |Samsung|Motorola|LG|iPhone|");
	   String marca = sc.nextLine();
	   System.out.println("Digite a cor do celular");
	   String cor = sc.nextLine();
	   System.out.println("Digite o modelo do celular");
	   String modelo = sc.nextLine();
	   
	   System.out.println("\n Deseja que o celular venha com uma capa proterora? Se sim, insira os dados a seguir, se não pule.");
	  
	   System.out.println("\nDigite a cor da capa");
	   String cor1 = sc.nextLine();
	   System.out.println("Digite o material da capa");
	   String material = sc.nextLine();
	   
	   Capa cp = new Capa(cor1, material);
	   Celular c1 = new Celular(marca, cor, modelo, cp);
	   
	   System.out.println("\n       TOTAL DA COMPRA - CELULAR");
	   
	   System.out.println("Marca: "+c1.getMarca()+"     | Cor: "+c1.getCor()+"     | Modelo: "+c1.getModelo());
	   System.out.println("Valor: "+c1.getValor());
	   System.out.println("Capa-Cor: "+c1.getCapa().getCor()+"   | Capa-Material: "+c1.getCapa().getMaterial()+"    | Preço: R$"+c1.getCapa().getPreco());
	   System.out.println("TOTAL: R$ "+c1.Total());
	   
	}
}
