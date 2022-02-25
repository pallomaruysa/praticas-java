public class IngressoCamaroteSuper extends Ingresso implements InterfaceIngresso{
    
    public IngressoCamaroteSuper(String n, String cpf, String data, String h, int i){
        super(n, cpf, data, h, i);
    }
    public IngressoCamaroteSuper(){
        
    }
    
    @Override
    public void status(){
        System.out.println("Nome: "+this.getNome()+" /  CPF: "+this.getCPF()+" /  Número do Ingresso: "+this.getNumero());
        System.out.println("Data: "+this.getData()+" /  Horário: "+this.getHorario());
    }
    
    @Override
    public double ValorIn(){
        this.setValor(this.getValor() + (this.getValor() * 0.30));
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