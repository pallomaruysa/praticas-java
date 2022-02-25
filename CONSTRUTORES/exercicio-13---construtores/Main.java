//Velocidade Máxima - Carro
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite a cor do carro");
	    String cor = sc.nextLine();
	    System.out.println("Digite o modelo do carro");
	    String model = sc.nextLine();
	    
	    Carro c1 = new Carro(cor, model);
	    
	    c1.ligar();
	    
	    System.out.println("");
	    System.out.println("Sua velocidade Máxima é de "+c1.getVelMax());
	    System.out.println("Sua velocidade Atual é de "+c1.getVelAtual());
	    System.out.println("Você está na Marcha "+c1.passarMarcha());
	    System.out.println("");
	    
	    System.out.println("Digite o quanto você deseja acelerar");
	    c1.acelerar(Double.parseDouble(sc.nextLine()));
	    System.out.println("");
	    
	    System.out.println("Precisa desacelerar? Digite o quanto deseja reduzir");
	    c1.reduzir(Double.parseDouble(sc.nextLine()));
	    System.out.println("");
	    
	    
	    System.out.println("Sua velocidade Máxima é de "+c1.getVelMax());
	    System.out.println("Sua velocidade Atual é de "+c1.getVelAtual());
	    System.out.println("Você está na Marcha "+c1.passarMarcha());
	    System.out.println("");
	    
	    
	}
}

