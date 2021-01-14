
import java.util.Calendar;

public class Carro extends Veiculo {
    public Carro(int ano_fab, String cor, String num_chassi, String tipo_combust, double valor_venda) {
        super(ano_fab, cor, num_chassi, tipo_combust, valor_venda);
    }
    
    private double IPVA;    
    Calendar cal = Calendar.getInstance();
    int year = cal.get(Calendar.YEAR);

    public double getIPVA() {
        return IPVA;
    }

    public void setIPVA(double IPVA) {
        this.IPVA = IPVA;
    }
    

    public int getYear() {
        return year;
    }
    
    @Override
    public void CalculaIpva() {
        if(CalculaAno(getAno_fab(),getYear())==true){
            switch (getTipo_combust().toUpperCase()){
                case "FLEX":
                    setIPVA(getValor_venda() * 0.03);
                    System.out.println("Valor do IPVA " + IPVA);
                break;
            
                case "GASOLINA":
                    setIPVA(getValor_venda() * 0.04);
                    System.out.println("Valor do IPVA " + IPVA);
                break;    
            
                case "ETANOL":
                    setIPVA(getValor_venda() * 0.02);
                    System.out.println("Valor do IPVA " + IPVA);
                break;
            
                case "GNV":
                    setIPVA(getValor_venda() * 0.01);
                    System.out.println("Valor do IPVA " + IPVA);
                break;
                default:
                    System.out.println("Tipo de Combustivel inválido para veiculo informado");
            }
        }else
            System.out.println("Veiculo não realiza pagamento de IPVA");
    }

    @Override
    public boolean CalculaAno(int ano_fab, int year) {
        return ((year-ano_fab)>0) && ((year-ano_fab)<15);
    }

    @Override
    public void MostraDetalhes() {
       System.out.println("\n-------------------------\n"
               + "Ano Fabricação: " + getAno_fab() + "\n"
               + "Cor: " + getCor() + "\n"
                    + "Chassi: " + getNum_chassi() + "\n"
                        + "Combustivel: " + getTipo_combust() + "\n"
                            + "Preço: " + getValor_venda() + "\n"
                                + "IPVA: " + getIPVA());
    } 
}
 