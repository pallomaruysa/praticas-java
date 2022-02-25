public class Produto
{
    String nome;
    double preco;
    int quantidade;
    
    double valortotal()
    {
        return preco * quantidade;
         
    }
    
    void adicionar(int quant)
    {
        quantidade += quant;
    }
    
    void remover(int quant)
    {
        quantidade -= quant;
    }
    
}