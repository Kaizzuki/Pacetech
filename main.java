import java.util.Scanner;

public class main {

    public static void main(String[] args) {
      
        Scanner leitor = new Scanner(System.in);
        float temperaturaC;
        float temperaturaF;
        char saidaPrograma = 's';
        int opcaoMenu;
        float qtdDolar;
        float qtdReal;
        
        
            
            System.out.println("insira a cotacao do dolar");
        float cotacaoDolar = leitor.nextFloat();
        
       while(saidaPrograma == 's' || saidaPrograma == 'S'){ 
        System.out.println("Escolha uma opcao");
        System.out.println("1 - Conversao de temperatura");
        System.out.println("2 - Conversao de moeda");
            opcaoMenu = leitor.nextInt();
        //Escolha de temperatura
        switch(opcaoMenu){
            case 1:
                System.out.println("Escolha");
                System.out.println("1 - Celsius para Fahrenheit");
                System.out.println("2 - Fahrenheit para Celsius");
                opcaoMenu = leitor.nextInt();
                switch(opcaoMenu){
                    //CELSIUS PARA FAHRENHEIT
                    case 1:
                        System.out.println("Insira a temperatura em celsius");
                        temperaturaC = leitor.nextFloat();
                        temperaturaF = (temperaturaC * 9/5) + 32;
                        System.out.println(temperaturaC + " celsius sao " +
                                temperaturaF+" fahrenheit");                    
                        break;
                    //FAHRENHEIT PARA CELSIUS
                    case 2:
                        System.out.println("Insira a temperatura em Fahrenheit");
                        temperaturaF = leitor.nextFloat();
                        temperaturaC = (temperaturaF - 32) * 5/9;
                        System.out.println(temperaturaF + " Fahrenheit sao "+
                                temperaturaC+" Celsius");
                        break;
                        
                }
                              
                break;
                
            //Escolha de moeda    
            case 2:
               System.out.println("Escolha");
               System.out.println("1 - Dolar para real");
               System.out.println("2 - Real para dolar");
               opcaoMenu = leitor.nextInt();
               switch(opcaoMenu){
               //Dolar para real
                   case 1:
                       System.out.println("Escreva a quantia em Dolares");
                       qtdDolar = leitor.nextFloat();
                       qtdReal = qtdDolar * cotacaoDolar;
                       System.out.println("US$" + qtdDolar + "equivale a R$"+
                               qtdReal);
                       
                                              
                       break;
                 //real para dolar
                   case 2:
                       System.out.println("Escreva a quantia em Reais");
                       qtdReal = leitor.nextFloat();
                       qtdDolar = qtdReal / cotacaoDolar;
                       System.out.println("R$" + qtdReal + " equivale a US$"+
                               qtdDolar);
                                                                    
                       
                       break;
               
               }
                                     
               
                break;
            
            default: 
                System.out.println("Opcao invalida");
                break;
        
        }
        System.out.println("Deseja continuar?");
        saidaPrograma = leitor.next().charAt(0);
     }   
    }
    
}
