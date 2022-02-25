public class Veiculo{
    
    private String marca;
    private String modelo;
    private String cor;
    private double valorDiaria;
    
    Veiculo(String marca, String model, String cor, double vd){
        this.marca = marca;
        this.modelo = model;
        this.cor = cor;
        this.valorDiaria = vd;
    }
    
    Veiculo(){
        
    }
    
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String model){
        this.modelo = model;
    }
    
    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public double getValorDiaria(){
        return this.valorDiaria;
    }
    public void setValorDiaria(double vd){
        this.valorDiaria = vd;
    }
}
