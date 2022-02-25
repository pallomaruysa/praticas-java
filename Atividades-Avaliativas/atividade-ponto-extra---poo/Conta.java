public class Conta
{
    String dono;
    int numero;
    double saldo;
    
    
    double sacar(double valor)
    {
        return saldo -= valor;
    }
    
    double depositar(double valor)
    {
        return saldo += valor;
    }
    
    
    double transferir(double valor)
    {
        return saldo -= valor; 
    }
    
}