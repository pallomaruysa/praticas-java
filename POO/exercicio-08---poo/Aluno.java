public class Aluno
{
    int matricula;
    String nome;
    double nota1;
    double nota2;
    double media;
    
    
    double calcularmedia(double x, double y)
    {
      return media = (x+y)/2;
    }
    
    double maiornota(double x, double y)
    {
        double mn;
        
        if(x>y)
        {
            mn = x;
        }
        else
        {
            mn = y;
        }
        
        return mn;
    }   
    
    double maiormedia(Aluno x, Aluno y)
    {
        if(x.media > y.media)
        {
            return x.media;
        }
        else
        {
            return y.media;
        }
    }
    
    String maiormedia2(Aluno x, Aluno y)
    {
        if(x.media > y.media)
        {
            return x.nome;
        }
        else
        {
            return y.nome;
        }
    }
}