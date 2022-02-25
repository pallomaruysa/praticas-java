public class Funcionario
{
    public String nome;
    public double salario;
    
    public Funcionario(String nome, double sal){
        this.nome = nome;
        this.salario = sal;
    }
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
    
}