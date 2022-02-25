public class Pessoa{
    
    public String nome;
    public String sobrenome;
    public int anonascimento;
    public int anoatual;
    public int fcm_valor;
    
    
    public Pessoa(String n, String s, int an){
        this.nome = n;
        this.sobrenome = s;
        this. anonascimento = an;
        this. anoatual = 2021;
        this. fcm_valor = 220;
    }
    public Pessoa(){
        this. anoatual = 2021;
        this. fcm_valor = 220;
    }
    
    
    public String getNome(){
        return nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }
    public void setSobrenome(String s){
        this.sobrenome = s;
    }
    
    public int getAnoNascimento(){
        return anonascimento;
    }
    public void setAnoNascimento(int an){
        this.anonascimento = an;
    }
    
    public int getAnoAtual(){
        return anoatual;
    }
    public void setAnoAtual(int at){
        this.anoatual = at;
    }
    
    public int getFcm_valor(){
        return fcm_valor;
    }
    public void setFcm_valor(int valor){
        this.fcm_valor = valor;
    }
    
    public int Idade(){
        return this.getAnoAtual() - this.getAnoNascimento();
    }
    
    public int Fcard_max(){
        return getFcm_valor() - Idade();
    }
    
    public void Fcard_alvo(){
        int x = (Fcard_max() * 50)/100;
        int y = (Fcard_max()* 85)/100;
        
        System.out.println("Sua frequência cardíaca alvo está entre "+x+ " e "+y);
    }
}