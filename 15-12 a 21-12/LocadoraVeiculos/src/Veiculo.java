public abstract class Veiculo {
    private int ano_fab;
    private String cor;
    private String num_chassi;
    private String tipo_combust;
    private double valor_venda;
    
    public Veiculo(int ano_fab, String cor, String num_chassi, String tipo_combust, double valor_venda){
     this.ano_fab=ano_fab;
     this.cor=cor;
     this.num_chassi=num_chassi;
     this.tipo_combust=tipo_combust;
     this.valor_venda=valor_venda;
    }

    public int getAno_fab() {
        return ano_fab;
    }

    public void setAno_fab(int ano_fab) {
        this.ano_fab = ano_fab;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNum_chassi() {
        return num_chassi;
    }

    public void setNum_chassi(String num_chassi) {
        this.num_chassi = num_chassi;
    }

    public String getTipo_combust() {
        return tipo_combust;
    }

    public void setTipo_combust(String tipo_combust) {
        this.tipo_combust = tipo_combust;
    }

    public double getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(double valor_venda) {
        this.valor_venda = valor_venda;
    }
    
    public abstract void CalculaIpva();
    public abstract boolean CalculaAno(int ano_fab, int year);
    public abstract void MostraDetalhes();
}