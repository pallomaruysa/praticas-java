// Atividade de Herança - Médico

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	   
	    System.out.println("Digite o seu CRM");
	    String crm = sc.nextLine();
	    System.out.println("Digite o seu nome");
	    String n = sc.nextLine();
	    System.out.println("Digite a sua idade");
	    int i = Integer.parseInt(sc.nextLine());
	    System.out.println("Digite o seu salário");
	    double sal = Double.parseDouble(sc.nextLine());
	    
	    Medico m1 = new Medico(crm, n, i, sal);
	    MedicoAuxiliar ma1 = new MedicoAuxiliar(crm, n, i, sal);
	    MedicoCirurgiao mc1 = new MedicoCirurgiao(crm, n, i, sal);
	    
	    System.out.println("Nome: "+ m1.getNome()+"  / CRM: "+m1.getCRM()+"  / Idade: "+ m1.getIdade()+"  / Salário: "+ m1.getSalario()+" \n");
	    
	    
	    System.out.println("Médico");
	    m1.medicoAposentado();
	    System.out.println("O valor da sua aposentadoria: "+ m1.valorAposentadoria()+"\n");
	    
	    System.out.println("Médico Auxiliar");
	    ma1.medicoAposentado();
	    System.out.println("O valor da sua aposentadoria: "+ ma1.valorAposentadoria()+"\n");
	    
	    System.out.println("Médico Cirurgião");
	    mc1.medicoAposentado();
	    System.out.println("O valor da sua aposentadoria: "+ mc1.valorAposentadoria());
	}
}
