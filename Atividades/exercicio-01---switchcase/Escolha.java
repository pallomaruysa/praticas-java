public class Escolha{
    public void ingresso(int in){
        switch(in){
            case 1: System.out.println("Ingresso Normal comprado com sucesso!");break;
            
            case 2: System.out.println("Ingresso VIP comprado com sucesso!");break;
            
            case 3: System.out.println("Ingresso Camarote Superior comprado com sucesso!");break;
            
            default: System.out.println("Opção Inválida!");
        }
    }
}