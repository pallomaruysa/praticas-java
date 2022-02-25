public class Carro{
    
    public String cor;
    public String modelo;
    public double Vel_atual;
    public double Vel_max;
    
    public Carro(String cor, String model){
        this.cor = cor;
        this.modelo = model;
        this.Vel_atual = 0;
        this.Vel_max = 200;
    }
    
    public Carro(){
        this.Vel_atual = 0;
        this.Vel_max = 200;
    }
    
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public String getModel(){
        return modelo;
    }
    public void setModel(String model){
        this.modelo = model;
    }
    
    public double getVelAtual(){
        return Vel_atual;
    }
    public void setVelAtual(double va){
        this.Vel_atual = va;
    }
    
    public double getVelMax(){
        return Vel_max;
    }
    public void setVelMax(double vm){
        this.Vel_max = vm;
    }
    
    public void ligar(){
        System.out.println("Carro Ligado!!");
    }
    
    public void acelerar(double vel){
        this.setVelAtual(this.getVelAtual() + vel);
        
        if(this.getVelAtual()>this.getVelMax()){
            System.out.println("Velocidade Máxima Ultrapassada em "+(this.getVelAtual()-this.getVelMax()+" km.")); 
        }
    }
    
    public void reduzir (double vel){
        this.setVelAtual(this.getVelAtual() - vel);
    }
    
    public int passarMarcha(){
        
        int m;
        
        if(this.getVelAtual()<=20){
            m = 1;
        }
        else if(this.getVelAtual()>20 && this.getVelAtual()<=40){
            m = 2;
        }
        else if(this.getVelAtual()>40 && this.getVelAtual()<=70){
            m = 3;
        }
        else if(this.getVelAtual()>70 && this.getVelAtual()<=100){
            m = 4;
        }
        else{
            m = 5;
        }
        
        return m;
    }
}