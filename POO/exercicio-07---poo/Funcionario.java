public class Funcionario
{
    String nome;
    double salario;
    
    double salariomedio(Funcionario x, Funcionario y)
    {
        double media = (x.salario + y.salario)/2;
        return media;
    }
}