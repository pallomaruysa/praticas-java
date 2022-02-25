import java.util.Scanner;

public class Main{
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("    DALLAS LOCADORA -> CADASTRO");
        System.out.println("Vamos iniciar o registro cliente, okay?\n");
        
        System.out.println("Digite o nome completo");
        String nome = sc.nextLine();
        System.out.println("Digite o email");
        String email = sc.nextLine();
        System.out.println("Digite o CPF");
        String cpf = sc.nextLine();
        
        Cliente cli = new Cliente(nome, cpf, email);
        
        System.out.println("--------------------------------------------");
        
        System.out.println("Digite a marca do carro");
        String marca = sc.nextLine();
        System.out.println("Digite o modelo do carro");
        String model = sc.nextLine();
        System.out.println("Digite a cor do carro");
        String cor = sc.nextLine();
        System.out.println("Digite o valor da diária");
        double valDiaria = Double.parseDouble(sc.nextLine());
        
        Veiculo vei = new Veiculo(marca, model, cor, valDiaria);
        
        System.out.println("--------------------------------------------");
        
        System.out.println("Digite a data da Locação, favor seguir o modelo dd/mm/aa");
        String data = sc.nextLine();
        System.out.println("Digite a quantidade de dias");
        int qntDias = Integer.parseInt(sc.nextLine());
        
        DadosLocacao ddlocal = new DadosLocacao(cli, data, qntDias, vei);
        
        System.out.println("--------------------------------------------");
        
        System.out.println("    DALLAS LOCADORA -> RECIBO");
        System.out.println("Dados do Cliente: ");
        System.out.println("        Nome: "+cli.getNome()+"     /   Email: "+cli.getEmail()+"    /   CPF: "+cli.getCPF());
        System.out.println("Dados do Veiculo: ");
        System.out.println("        Marca: "+vei.getMarca()+"       /    Modelo: "+vei.getModelo()+"    /   Cor: "+vei.getCor());
        System.out.println("Valor da Diária: "+vei.getValorDiaria()+"   /    Quantidade de dias: "+ddlocal.getQntDiasLocacao());
        System.out.println("Data da Locação: "+ddlocal.getData()+"      /       TOTAL A SER PAGO: R$"+ddlocal.ValorTotalLocacao());   
    }
}

