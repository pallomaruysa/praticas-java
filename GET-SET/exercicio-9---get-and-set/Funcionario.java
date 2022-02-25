public class Funcionario
{
    public String nome;
    public double salarioBruto;
    public double imposto;
    public double salarioLiquido;
    
    public String getNome()
    {
        return nome;
    }
    public void setNome(String n)
    {
        this.nome = n;
    }
    
    public double getSalarioBruto()
    {
        return salarioBruto;
    }
    public void setSalarioBruto(double sb)
    {
        this.salarioBruto = sb;
    }
    
    public double getImposto()
    {
        return imposto;
    }
    public void setImposto(double i)
    {
        this.imposto = i;
    }
    
    public double getSalarioLiquido()
    {
        return salarioLiquido;
    }
    public void setSalarioLiquido(double x, double y)
    {
        this.salarioLiquido = x - y;
    }
    
    public void aumentoSalario(int x)
    {
        this.setSalarioBruto(this.getSalarioBruto() + (this.getSalarioBruto() * x)/100);
    }
}