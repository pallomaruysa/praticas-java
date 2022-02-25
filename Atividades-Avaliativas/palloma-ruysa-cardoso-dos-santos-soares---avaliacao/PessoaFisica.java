public class PessoaFisica extends Pessoa implements InterfaceImposto{
    
    private String CPF;
    
    public PessoaFisica(String n, int i, double rB, String cpf){
        super(n, i, rB);
        this.CPF = cpf;
    }
    
    @Override
    public void Status(){
        System.out.println("Nome: "+this.getNome()+"  /  Idade: "+this.getIdade());  
        System.out.println("Renda Bruta: "+this.getRendaBrutra()+"  /  Renda Líquida: "+CalcularRendaLiquida());  
        System.out.println("CPF: "+this.getCPF()+"  /  Imposto de Renda: "+CalcularImposto());
    }
    
    public String getCPF(){
        return CPF;
    }
    public void setCPF(String cpf){
        this.CPF = cpf;
    }
    
    @Override
    public double CalcularImposto(){
        if(this.getRendaBrutra()<=2000){
            return this.getRendaBrutra() * 0.10;
        }
        else{
            return this.getRendaBrutra() * 0.20;

        }
    }
    
    @Override
    public double CalcularRendaLiquida(){
         if(this.getRendaBrutra()<=2000){
            return this.getRendaBrutra() - (this.getRendaBrutra() * 0.10);
        }
        else{
            return this.getRendaBrutra() - (this.getRendaBrutra() * 0.20);

        }
    }
}