public class bank extends cpf {
    private int numeroDaConta;
    private cpf beneficiario;//composition

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public cpf getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(cpf beneficiario) {
        this.beneficiario = beneficiario;
    }

    public bank(){

    }


}
