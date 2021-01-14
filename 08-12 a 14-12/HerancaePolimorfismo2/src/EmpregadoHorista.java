public class EmpregadoHorista extends Empregado {
    
    public EmpregadoHorista(String primeiroNome, String ultimoNome, String cpf, double salario) {
        super(primeiroNome, ultimoNome, cpf, salario);
    }
    
    @Override
    public void reajuste(double porcentagem){
        if(porcentagem>10){
            System.out.println("Limite de reajuste ultrapassado");
        }else{
            double valor = this.getSalario()*(porcentagem/100);
            this.setSalario(this.getSalario()+valor);
        }
    }
    
    public void reajuste(double porcentagem, int idade){
        if(porcentagem>10){
            System.out.println("Limite de reajuste ultrapassado");
        }else{
            if(idade >= 60){
            this.setSalario(this.getSalario()+500);
            double valor = this.getSalario()*(porcentagem/100);
            this.setSalario(this.getSalario()+valor);
            }else{
                double valor = this.getSalario()*(porcentagem/100);
                this.setSalario(this.getSalario()+valor);
            }
        }
    }
}
