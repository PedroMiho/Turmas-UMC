public class estruturada {
    public static void main(String[] args) {
        double mesJaneiroAgua = 200;
        double mesJaneiroEnergia = 150;
        double mesJaneiroAlimentacao = 600;

        double gastoTotalJaneiro = mesJaneiroAgua + mesJaneiroAlimentacao + mesJaneiroEnergia;
        System.out.println("Gasto total: " + gastoTotalJaneiro);

        double mesFevereiroAgua = 300;
        double mesFevereiroEnergia = 100;
        double mesFevereiroAlimentacao = 800;

        double gastoTotalFevereiro = mesFevereiroAgua + mesFevereiroAlimentacao + mesFevereiroEnergia;
        System.out.println("Gasto total: " + gastoTotalFevereiro);

    }
}
