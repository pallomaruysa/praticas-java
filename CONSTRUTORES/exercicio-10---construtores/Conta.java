public class Conta
{
    public String nome;
    public int numero;
    public double saldo;
    
    public Conta(String n, int num, double sal)
    {
        this.nome = n;
        this.numero = num;
        this.saldo = sal;
    }
    
    public Conta()
    {
        
    }
    
    public String getNome()
    {
        return nome;
    } 
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public int getNumero()
    {
        return numero;
    }
    public void setNumero(int n)
    {
        this.numero = n;
    }
    
    public double getSaldo()
    {
        return saldo;
    }
    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }
    
    public void depositar(double valor)
    {
        this.setSaldo(this.getSaldo()+valor);
    }
    
    public void sacar(double valor)
    {
        this.setSaldo(this.getSaldo()-valor);
    }
    

}