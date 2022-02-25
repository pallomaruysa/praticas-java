public class DadosLocacao{
    
    private Cliente cliente;
    private String data;
    private int qntDiasLocacao;
    private Veiculo veiculo;
    
    DadosLocacao(Cliente cliente, String data, int qntDiasLocacao, Veiculo veiculo){
        this.cliente = cliente;
        this.data = data;
        this.qntDiasLocacao = qntDiasLocacao;
        this.veiculo = veiculo;
    }
    DadosLocacao(){
        
    }
    
    public Cliente getCliente(){
        return this.cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public String getData(){
        return this.data;
    }
    public void setData(String data){
        this.data = data;
    }
    
    public int getQntDiasLocacao(){
        return this.qntDiasLocacao;
    }
    public void setQntDiasLocacao(int qntDiasLocacao){
        this.qntDiasLocacao = qntDiasLocacao;
    }
    
    public Veiculo getVeiculo(){
        return this.veiculo;
    }
    public void setVeiculo(Veiculo veiculo){
        this.veiculo = veiculo;
    }
    
    public double ValorTotalLocacao(){
        return  this.getQntDiasLocacao() * this.getVeiculo().getValorDiaria();
    }
}