public class Produto
{
    public String nome;
    public double preco;
    public int quantidade;
    public double valortotal;
    
    public String getNome()
    {
        return nome;
    }
    public void setNome(String n)
    {
        this.nome = n;
    }
    
    public double getPreco()
    {
        return preco;
    }
    public void setPreco(double x)
    {
         this.preco = x;
    }
    
    public int getQuantidade()
    {
        return quantidade;
    }
    public void setQuantidade(int y)
    {
        this.quantidade = y;
    }
    
    public double getValorTotal()
    {
        return valortotal;
    }
    public void setValorTotal(double x, int y)
    {
        this.valortotal = getPreco() * getQuantidade();
    }
    
    
    void adicionar(int quant)
    {
        this.setQuantidade(this.getQuantidade() + quant) ;
    }
    
    void remover(int quant)
    {
        this.setQuantidade(this.getQuantidade() - quant);
    }
    
}