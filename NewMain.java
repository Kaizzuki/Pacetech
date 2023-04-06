
import java.util.HashSet;


public class NewMain {

    public static void main(String[] args) {
    
        Empregado empregadoUm = new Empregado();
        Empregado empregadoDois = new Empregado();     
        
        empregadoUm.setPrimeiroNome("Geraldo");
        empregadoUm.setSobrenome("Sousa");
        empregadoUm.setSalarioMensal(2440);
        
        empregadoDois.setPrimeiroNome("Rafael");
        empregadoDois.setSobrenome("Dias");
        empregadoDois.setSalarioMensal(2343);       
        
               
        
    System.out.println("Primeiro empregado");
    System.out.println("Nome: " + empregadoUm.getPrimeiroNome() + " "
            + empregadoUm.getSobrenome());
    System.out.println("Salario mensal: R$:" + empregadoUm.getSalarioMensal());
    System.out.println("Salario Anual: R$" + empregadoUm.calcularSalarioAnual());
    System.out.println("Salario com 10% de aumento: R$" + empregadoUm.aumentarSalario());
    System.out.println("Novo salario Anual: R$"+ empregadoUm.calcularSalarioAnual());
    
    System.out.println("");
    System.out.println(" =============== ");
    System.out.println("");
    
    
    System.out.println("Segundo empregado");
    System.out.println("Nome: " + empregadoDois.getPrimeiroNome() + " "
            + empregadoDois.getSobrenome());
    System.out.println("Salario mensal: R$" + empregadoDois.getSalarioMensal());
    System.out.println("Salario Anual: R$" + empregadoDois.calcularSalarioAnual());
    System.out.println("Salario com 10% de aumento: R$" + empregadoDois.aumentarSalario());
    System.out.println("Novo salario Anual: R$"+ empregadoDois.calcularSalarioAnual());
        
    }
               
        
        
}
       

