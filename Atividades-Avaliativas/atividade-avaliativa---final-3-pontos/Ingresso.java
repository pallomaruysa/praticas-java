public class Ingresso{      //abstract TALVES :D
    
    private String nome;
    private String CPF;
    private String data;
    private String horario;
    private int numero;
    private double valor;
    
    public Ingresso(String nome, String CPF, String data, String horario, int i){
        this.nome = nome;
        this.CPF = CPF;
        this.data = data;
        this.horario = horario;
        this.numero = i;
        this.valor = 30.00;
    }
    public Ingresso(){
        
    }
    public void status(){
        System.out.println("Nome: "+this.getNome()+" /  CPF: "+this.getCPF()+" /  Número do Ingresso: "+this.getNumero());
        System.out.println("Data: "+this.getData()+" /  Horário: "+this.getHorario());
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCPF(){
        return CPF;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    
    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data = data;
    }
    
    public String getHorario(){
        return horario;
    }
    public void setHorario(String h){
        this.horario = h;
    }
    
    public int getNumero(){
        return numero;
    }
    public void setNumero(int num){
        this.numero = num;
    }
    
    public double getValor(){
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
}