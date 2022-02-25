import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome");
        String nome = sc.nextLine();
        System.out.println("Digite a data da locação, siga o modelo(dd/mm/aaaa)");
        String data = sc.nextLine();
        System.out.println("Digite a quantidades de dias da locação");
        int quantdias = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o modelo do carro");
        String modelo = sc.nextLine();
        
        Locacao l1 = new Locacao(nome, data, quantdias, modelo);
        
        System.out.println("");
        
        System.out.println("Nome: "+l1.getNome()+" - Data: "+l1.getData()+" - Quantidade de dias: "+l1.getQuantDias());
        System.out.println("Modelo do carro: "+l1.getModelo()+" - Diária: "+l1.getValorDia());
        System.out.println("Total a Pagar: "+l1.calcular());
    }
}
