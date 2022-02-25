public class Funcionario
{
    String nome;
    double salarioBruto;
    double imposto;
    
    double salarioLiquido(double x, double y)
    {
        double sL;
        return sL = salarioBruto - imposto;
    }
    
    void aumentoSalario(int x)
    {
        salarioBruto += (salarioBruto * x)/100;
    }
}