
public class Empregado {
    
    private String primeiroNome;
    private String sobrenome;
    private float salarioMensal;
 
//construtor    
public Empregado(){
    primeiroNome = "joao";
    sobrenome = "souza";
    salarioMensal = 1000;
    
}
//metodos   

public float calcularSalarioAnual(){
    float salarioAnual = salarioMensal * 12;
      
    return salarioAnual;
}
public float aumentarSalario(){
    float aux = 10 * salarioMensal;
    float aumentoSalario = aux / 100;
    float novoSalario = salarioMensal + aumentoSalario;
    salarioMensal = novoSalario;
    return novoSalario;
}

//metodos getter e setter

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(float salarioMensal) {
        this.salarioMensal = salarioMensal;
        if (salarioMensal < 0) {
        this.salarioMensal = 0.0f;
        }
    }
    
    
}
