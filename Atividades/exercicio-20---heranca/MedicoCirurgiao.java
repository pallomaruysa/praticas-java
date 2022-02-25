public class MedicoCirurgiao extends Medico{
    
    public MedicoCirurgiao(String crm, String n, int i, double sal){
        super(crm, n, i, sal);
    }
    
    @Override
    public void medicoAposentado(){
        
        if(super.getIdade() - 50 == 1){ //Caso a pessoa já tenha 1 ano aposentada, para que não fique no plural eu criei este if para aparecer no singular
            System.out.println("Aposentado há 1 ano.");
        }
        else if(super.getIdade() > 49){
            System.out.println("Aposentado há "+(super.getIdade() - 50)+" anos.");
        }
        else if(50 - super.getIdade() == 1){ //Caso falte 1 ano para a pessoa aposentar, para que não fique no plural eu criei este if para aparecer no singular.
            System.out.println("Ativo, falta 1 ano para se aposentar.");
        }
        else{
            System.out.println("Ativo, faltam "+(50 - super.getIdade())+" anos para se aposentar.");
        }
    }
    
    @Override
    public String valorAposentadoria(){
        if(this.getIdade() > 49){
            return Double.toString(((super.getSalario() * 80) / 100) + 800);
        }
        else{
            return "Para receber este benefício você primeiro precisa se aposentar.";
        }
    }
    
}