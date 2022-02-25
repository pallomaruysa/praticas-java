public class CasaVelha{
    private String cor;
    private int numero;
    private int quant_portas;
    private int quant_janelas;
    private boolean aberta;
    
    public CasaVelha (String cor, int num, int qntportas, int qntjanelas){
        this.cor = cor;
        this.numero = num;
        this.quant_portas = qntportas;
        this.quant_janelas = qntjanelas;
        this.aberta = false;
    }
    
    public void status(){
        System.out.println("A cor da casa é: " + this.getCor());
        System.out.println("O numero da casa é: " + this.getNumero());
        System.out.println("A quantidade de portas da casa é: " + this.getQuant_portas());
        System.out.println("A quantidade de janelas da casa é: " + this.getQuant_janelas());
        System.out.println((this.inAberta())? "Casa aberta! \n" : "Casa fechada! \n");


    }
    
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public int getNumero(){
        return numero;
    }
    public void setNumero(int num){
        this.numero = num;
    }
    
    public int getQuant_portas(){
        return quant_portas;
    }
    public void setQuant_portas(int qntportas){
        this.quant_portas = qntportas;
    }
    
    public int getQuant_janelas(){
        return quant_janelas;
    }
    public void setQuant_janelas(int qntjanelas){
        this.quant_janelas = qntjanelas;
    }
    
    public boolean inAberta(){
        return aberta;
    }
    public void setAberta(boolean aberta){
        this.aberta = aberta;
    }
    
    public void abrirCasa(){
        this.setAberta(true);
        System.out.println("Abrindo a porta. \n");
    }
    
    public void fecharCasa(){
        this.setAberta(false);
        System.out.println("Fechando a porta da casa. \n");
    }
     
    public void pintarCasa(String novacor){
        this.setCor(novacor);
    }
    
    public void entrar(){
        
        if (this.inAberta()){
            System.out.println("Seja bem-vindo!! \n");
        }
        else{
          System.out.println("Abra a porta primeiro para poder entrar. \n");
        }
        
    }
    
    public void addportas(int valor){
        this.setQuant_portas(this.getQuant_portas() + valor);
    }
    
    public void addjanelas(int valor){
        this.setQuant_janelas(this.getQuant_janelas() + valor);
    }
}