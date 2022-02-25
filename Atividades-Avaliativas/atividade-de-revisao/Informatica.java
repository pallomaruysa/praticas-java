public class Informatica extends Produtos{
    
    public Informatica(int cod, String n, double val){
        super(cod, n, val);
    }
    
    @Override
    public double CalcularDesconto(){
        this.setValor(this.getValor() - (this.getValor() * 0.10));
        return this.getValor();
    }
}