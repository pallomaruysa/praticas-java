public class Aluno
{
    public int matricula;
    public String nome;
    public double nota1;
    public double nota2;
    public double media;
    
    public int getMatricula()
    {
        return matricula;
    }
    public void setMatricula(int mat)
    {
        this.matricula = mat;
    }
    
    public String getNome()
    {
        return nome;
    }
    public void setNome(String n)
    {
        this.nome = n;
    }
    
    public double getNota1()
    {
        return nota1;
    }
    public void setNota1(double n1)
    {
        this.nota1 = n1;
    }
    
    public double getNota2()
    {
        return nota2;
    }
    public void setNota2(double n2)
    {
        this.nota2 = n2;
    }
    
    public double getMedia()
    {
        return media;
    }
    public void setCalcularMedia(double x, double y)
    {
        this.media = (x+y)/2;
    }
    
    public double maiornota(double x, double y)
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
    
    public double maiormedia(Aluno x, Aluno y)
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
    
    public String maiormedia2(Aluno x, Aluno y)
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