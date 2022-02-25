public class IngressoNormal extends Ingresso implements InterfaceIngresso{
    
    public IngressoNormal(String n, String cpf, String data, String h, int i){
        super(n, cpf, data, h, i);
    }
    public IngressoNormal(){
        
    }
    
    @Override
    public void status(){
        System.out.println("Nome: "+this.getNome()+" /  CPF: "+this.getCPF()+" /  Número do Ingresso: "+this.getNumero());
        System.out.println("Data: "+this.getData()+" /  Horário: "+this.getHorario());
    }
    
    @Override
    public double ValorIn(){
        return this.getValor();
    }
    
    @Override
    public double TotalVenda(){
        return 0;
    }
    
    @Override
    public String Buscar(){
        return "";
    }
}