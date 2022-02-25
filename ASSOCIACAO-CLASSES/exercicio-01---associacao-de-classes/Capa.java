public class Capa{
    
    private String cor;
    private String material;
    private double preco;
    
    public Capa(String cor, String material){
        this.cor = cor;
        this. material = material;
        this.preco = 20.00;
    }
    public Capa(){
        
    }
    
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public String getMaterial(){
        return material;
    }
    public void setMaterial(String material){
        this.material = material;
    }
    
    public double getPreco(){
        return preco;
    }
    public void setPreco(double p){
        this.preco = p;
    }
}