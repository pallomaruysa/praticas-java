import java.util.ArrayList;

public class Compra implements InterfaceCompra{
    
    private String nomeComprador;
    private ArrayList<Produtos>listaProdutos;
    private double valorTotal;
    private int i;
    public Compra(String nC, ArrayList<Produtos>listaProdutos, double vT){
        this.nomeComprador = nC;
        this.listaProdutos = listaProdutos;
        this.valorTotal = vT;
    }
    
    public String getNomeComprador(){
        return nomeComprador;
    }
    public void setNomeComprador(String nC){
        this.nomeComprador = nC;
    }
    
    public ArrayList<Produtos>getListaProdutos(){
        return listaProdutos;
    }
    public void setListaProdutos(ArrayList<Produtos>listaProdutos){
        this.listaProdutos = listaProdutos;
    }
    
    public double getValorTotal(){
        return valorTotal;
    }
    public void setValorTotal(double vT){
        this.valorTotal = vT;
    }
    
    @Override
    public double CalcularValorTotal(){
        return getValorTotal();
    }
    
    @Override
    public void Status(){
        for (i=0; i<2; i++){
            System.out.println("Nome do Produto: "+listaProdutos.get(i).getNome());
            System.out.println("Código do Produto: "+listaProdutos.get(i).getCodigo());
            System.out.println("");
        }
    }
}
