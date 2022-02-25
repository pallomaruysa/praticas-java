public class Produtos{
    
    private int codigo;
    private String nome;
    private double valor;
    
    public Produtos(int cod, String n, double val){
        this.codigo = cod;
        this.nome = n;
        this.valor = val;
    }
    
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int cod){
        this.codigo = cod;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    
    public double getValor(){
        return valor;
    }
    public void setValor(double val){
        this.valor = val;;
    }
    
    public double CalcularDesconto(){
        return 0;
    }
}