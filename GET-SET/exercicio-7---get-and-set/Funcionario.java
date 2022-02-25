public class Funcionario
{
    public String nome;
    public double salario;
    
    public String getNome()
    {
        return nome;
    }
    public void setNome(String n)
    {
        this.nome = n;
    }
    
    public double getSalario()
    {
        return salario;
    }
    public void setSalario(double s)
    {
        this.salario = s;
    }
    
    
    double salariomedio(Funcionario x, Funcionario y)
    {
        double media = (x.salario + y.salario)/2;
        return media;
    }
}