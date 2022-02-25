public class PessoaJuridica extends Pessoa implements InterfaceImposto{
    
    private String CNPJ;
    
    public PessoaJuridica(String n, int i, double rB, String cnpj){
        super(n, i, rB);
        this.CNPJ = cnpj;
    }
    
    @Override
    public void Status(){
        System.out.println("Nome: "+this.getNome()+"  /  Idade: "+this.getIdade());  
        System.out.println("Renda Bruta: "+this.getRendaBrutra()+"  /  Renda Líquida: "+CalcularRendaLiquida()); 
        System.out.println("CNPJ: "+this.getCNPJ()+"  /  Imposto de Renda: "+CalcularImposto());
    }
    
    public String getCNPJ(){
        return CNPJ;
    }
    public void setCNPJ(String cnpj){
        this.CNPJ = cnpj;
    }
    
    @Override
    public double CalcularImposto(){
        return this.getRendaBrutra() * 0.10;
    }
    
    public double CalcularRendaLiquida(){
        return this.getRendaBrutra() - (this.getRendaBrutra() * 0.10);
    }
}