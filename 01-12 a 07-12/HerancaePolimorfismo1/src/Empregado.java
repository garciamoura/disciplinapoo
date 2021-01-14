public class Empregado {
   private String primeiroNome;
   private String ultimoNome;
   private String cpf;
   private double salario;
   
   public Empregado(String primeiroNome, String ultimoNome, String cpf, double salario){
       this.primeiroNome=primeiroNome;
       this.ultimoNome=ultimoNome;
       this.cpf=cpf;
       this.salario=salario;
   }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void reajuste(double porcentagem){
        if(porcentagem>20){
            System.out.println("Limite de reajuste ultrapassado");
        }else{
            this.salario+=this.salario*(porcentagem/100);
        }
    }
    
    public void empregados(){
        System.out.println("Empregados\n--------------\n"
                + "Nome: " + this.getPrimeiroNome() + this.ultimoNome +"\n"
                        + "CPF: " + this.getCpf() + "\n"
                                + "Salario: " + this.getSalario()+ "\n---------------------\n");
    }
    
   
}
