public abstract class Pessoa{
    
    private String nome;
    private int idade; 
    private double rendaBruta;
    
    public Pessoa(String n, int i, double rB){
        this.nome = n;
        this.idade = i;
        this.rendaBruta = rB;
    }
    
    public abstract void Status();
    
    public String getNome(){
        return nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    
    public int getIdade(){
        return idade;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    
    public double getRendaBrutra(){
        return rendaBruta;
    }
    public void setRendaBrutra(double rB){
        this.rendaBruta = rB;
    }
}