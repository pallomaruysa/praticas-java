public class Pessoa
{
    String nome;
    int idade;
    
    Pessoa m_idade(Pessoa x, Pessoa y)
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