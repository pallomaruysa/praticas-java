import java.util.ArrayList;

public class Venda extends Ingresso implements InterfaceIngresso{
    public ArrayList<Ingresso>NumeroIn;
    private double qnt_IN;         //quantidade de IngressoNormal
    private double qnt_VIP;        //quantidade de IngressoVIP
    private double qnt_CS;         //quantidade de IngressoCamaroteSuper
    
    public Venda(String n, String cpf, String data, String h, int i, ArrayList<Ingresso>NumeroIn){
        super(n, cpf, data, h, i);
        this.NumeroIn = NumeroIn;
    }
    public Venda(double x, double y, double z){
        this.qnt_IN = x;
        this.qnt_VIP = y;
        this.qnt_CS = z;
    }
    public Venda(){
        
    }
    
    public double getQnt_IN(){
        return qnt_IN;
    }
    public void setQnt_IN(double in){
        this.qnt_IN = in;
    }
    
    public double getQnt_VIP(){
        return qnt_VIP;
    }
    public void setQnt_VIP(double vip){
        this.qnt_VIP = vip;
    }
    
    public double getQnt_CS(){
        return qnt_CS;
    }
    public void setQnt_CS(double cs){
        this.qnt_CS = cs;
    }
    
    @Override
    public void status(){
        System.out.println("Nome: "+this.getNome()+" /  CPF: "+this.getCPF()+" /  Número do Ingresso: "+this.getNumero());
        System.out.println("Data: "+this.getData()+" /  Horário: "+this.getHorario());
    }
    
    @Override
    public double ValorIn(){
        return 0;
    }
    
    @Override
    public double TotalVenda(){
        double total = (this.getQnt_IN() * 30.00) + (this.getQnt_VIP() * 34.50) + (this.getQnt_CS() * 39.00);
        return total;
    }
    
    @Override
    public String Buscar(){
        return "";
    }
}