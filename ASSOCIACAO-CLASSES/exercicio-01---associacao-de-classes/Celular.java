public class Celular {
    
    private String marca;
    private String cor;
    private String modelo;
    private double valor;
    private Capa capa;
    
    public Celular(String marca, String cor, String modelo, Capa capa){
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        setValor();
        this.capa = capa;
    }
    public Celular(){
        
    }
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String m){
        this.marca = m;
    }
    
    public String getCor(){
        return cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
    
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String model){
        this.modelo = model;
    }
    
    public double getValor(){
        return valor;
    }
    public void setValor(){
        if(this.getMarca().equalsIgnoreCase("Samsung")){
            this.valor = 799.99;
        }
        else if(this.getMarca().equalsIgnoreCase("Motorola")){
            this.valor = 850.99;
        }
        else if(this.getMarca().equalsIgnoreCase("Lg")){
            this.valor = 679.99;
        }
        else if(this.getMarca().equalsIgnoreCase("Iphone")){
            this.valor = 1099.90;
        }
        else{
            System.out.println("Escolha uma opção do estoque!");
        }
    }
    
    public Capa getCapa(){
        return capa;
    }
    public void setCor(Capa capa){
        this.capa = capa;
    }
    
    public double Total(){
        return this.getValor() + this.getCapa().getPreco();
    }
}