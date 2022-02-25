public class Medico{
    
    private String CRM;
    private String nome;
    private int idade;
    private double salario;
    
    public Medico(String crm, String n, int i, double sal){
        this.CRM = crm;
        this.nome = n;
        this.idade = i;
        this.salario = sal;
    }
    
    public String getCRM(){
        return CRM;
    }
    public void setCRM(String crm){
        this.CRM = crm;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public double getSalario(){
        return salario;
    }
    public void setSalario(double sal){
        this.salario = sal;
    }
    
    public void medicoAposentado(){
        
        if(this.getIdade() - 55 == 1){ //Caso a pessoa já tenha 1 ano aposentada, para que não fique no plural eu criei este if para aparecer no singular
            System.out.println("Aposentado há 1 ano.");
        }
        else if(this.getIdade() > 54){
            System.out.println("Aposentado há "+(this.getIdade() - 55)+" anos.");
        }
        else if(55 - this.getIdade() == 1){ //Caso falte 1 ano para a pessoa aposentar, para que não fique no plural eu criei este if para aparecer no singular.
            System.out.println("Ativo, falta 1 ano para se aposentar.");
        }
        else{
            System.out.println("Ativo, faltam "+(55 - this.getIdade())+" anos para se aposentar.");
        }
    }
    
    public String valorAposentadoria(){
        if(this.getIdade() > 54){
            return Double.toString((this.getSalario() * 80) / 100);
        }
        else{
            return "Para receber este benefício você primeiro precisa se aposentar.";
        }
    }
    
    
    
} 