public class Pessoa
{
    public String nome;
    public int idade;
    
    
    public String getNome()
    {
        return nome;
    }
    public void setNome(String n)
    {
        this.nome = n;
    }
    
    public int getIdade()
    {
        return idade;
    }
    public void setIdade(int i)
    {
        this.idade = i;
    }
    
    
    public Pessoa MaiorIdade(Pessoa x, Pessoa y)
    {
        if(x.idade > y.idade)
        {
            return x;   
        }
        else
        {
            return y;
        }
    }
}