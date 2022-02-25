import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
    //QUESTÃO 01
    
        int i, cont=0, cont2=0;
        
        for(i=0;i<10;i++)
        {
            System.out.println("Digite um número");
            int n = sc.nextInt();
            
            if(n%2==0)
            {
                cont++;
            }
            else
            {
                cont2++;
            }
        }
        
        System.out.println("Pares: "+cont+" e Ímpares: "+cont2);

    
    //QUESTÃO 02
      
        int i, soma=0, cont=0, soma2=0;
        double media=0;
        
        for(i=0;i<3;i++)
        {
            System.out.println("Digite um número");
            int n = sc.nextInt();
            
            if(n%2==1)
            {
                soma2 += n;
                
                cont++;
                
                media = soma2/cont;
            }
            
            // Tanto (soma2 += n) quanto (soma = n + soma) são a mesma coisa. Par recebendo o número + o próprio par (+=) 
            
            else
            {
                soma = n + soma;
            }
        }
        
        System.out.println("Soma dos valores Pares: "+soma+"\nMédia dos valores Ímpares: "+media);
   
    
    //QUESTÃO 03
 
        int i, soma=0,cont=0;
        
        for(i=0;i<50;i++)
        {
            System.out.println("Digite um número");
            int n = sc.nextInt();
            
            if(n>0)
            {
                soma += n;
            }
            else
            if(n<0)
            {
                cont++;
            }
            else
            {
                System.out.println("Número Neutro");
            }
        }
        
        System.out.println("Soma dos valores Positivos: "+soma+"\nQuantidade de valores Negativos: "+cont);
  
    
    //QUESTÃO 04
  
        int i, soma=0;
        
        for(i=0;i<10;i++)
        {
            System.out.println("Digite um número");
            int n = sc.nextInt();
            
            if(n%2==0 && n>85 && n<907)
            {
                soma += n;
                
            }
        }
        
        System.out.println("A soma dos valores pares digitados entre 85 e 907 é: "+soma);
   
    // OU ___________________________________________________________________________________________
        
        int i, soma=0;
        
        for(i=85;i<=907;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
                soma+=i;
            }
            
        }
        
        System.out.println("Soma dos Pares entre 85 e 907: "+soma);
    
    
    //QUESTÃO 05
    
        int i;
        double maior_a=0, maior_p=0;
        String nome_a=null, nome_p=null;
        
        for(i=0;i<2;i++)
        {
            System.out.println("Digite seu nome");
            String nome = sc.nextLine();
            
            System.out.println("Digite sua altura");
            double altura = Double.parseDouble(sc.nextLine());
            
            System.out.println("Digite seu peso");
            double peso = Double.parseDouble(sc.nextLine());
            
            if(altura>maior_a)
            {
                maior_a = altura;
                nome_a = nome;
            }
            
            if(peso>maior_p)
            {
                maior_p = peso;
                nome_p = nome;
            }
        }
        System.out.println("Nome do mais alto: "+nome_a+ " / Sua altura é de: "+maior_a);
        System.out.println("Nome do mais pesado: "+nome_p+ " / Seu peso é de: "+maior_p);
        
       
       
       
    sc.close();
      
    }
}




