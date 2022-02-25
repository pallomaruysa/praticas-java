public class Esportes extends Produtos{
    
    public Esportes(int cod, String n, double val){
        super(cod, n, val);
    }
    
    @Override
    public double CalcularDesconto(){
        this.setValor(this.getValor() - (this.getValor() * 0.15));
        return this.getValor();
    }
} 