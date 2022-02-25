public class Conta 
{
    int numero;
    String dono;
    double saldo;
    
    
    
    void sacar(double valor)
    {
        saldo -= valor;
    }
    
    void depositar(double valor)
    {
        saldo += valor;
    }
    
}