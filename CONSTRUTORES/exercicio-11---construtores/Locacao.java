public class Locacao
{
    public String nome;
    public String data;
    public int quantdias;
    public String modelo;
    public double valordia;
    
    public Locacao(String nome, String data, int quantdias, String modelo)
    {
        this.nome = nome;
        this.data = data;
        this.quantdias = quantdias;
        this.modelo = modelo;
        this.valordia = 500.00;
    }
    
    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getData()
    {
        return data;
    }
    public void setData(String data)
    {
        this.data = data;
    }
    
    public int getQuantDias()
    {
        return quantdias;
    }
    public void setQuantDias(int quantdias)
    {
        this.quantdias = quantdias;
    }
    
    public String getModelo()
    {
        return modelo;
    }
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    
    public double getValorDia()
    {
        return valordia;
    }
    public void setValorDia(double valordia)
    {
        this.valordia = valordia;
    }
    
    public double calcular()
    {
        return getQuantDias() * getValorDia();
    }
}