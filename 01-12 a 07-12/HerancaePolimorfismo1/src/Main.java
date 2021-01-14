public class Main {
    public static void main(String[] args) {
        //Empregado empregado = new Empregado("Gabriela","Garcia","12345678912",2000);
        //empregado.empregados();
        //empregado.reajuste(12);
        //empregado.empregados();
        //empregado.reajuste(25);
        //empregado.empregados();
        
        EmpregadoHorista horista = new EmpregadoHorista("Felippe","Torres","12345123456",3000);
        horista.empregados();
        horista.reajuste(1,65);
        horista.empregados();
        horista.reajuste(1,58);
        horista.empregados();
}
}
