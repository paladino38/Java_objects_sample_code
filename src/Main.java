import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        cpf meucpf = new cpf("019.350.870.29", false);
        bank itau = new bank();
        itau.setNumeroDaConta(2844890);
        itau.setBeneficiario(meucpf);


        ArrayList<cpf> lista_de_cpf = new ArrayList<cpf>();
        lista_de_cpf.add(meucpf);
        System.out.println(lista_de_cpf.get(0).getNumeroDoCpf());


        System.out.println("Numero do cpf = "+meucpf.getNumeroDoCpf()+ "cpf ta queimado? " + meucpf.isQueimado());
        System.out.println("\n");
        System.out.println(itau.getNumeroDoCpf() +" " + itau.isQueimado());
    }
}