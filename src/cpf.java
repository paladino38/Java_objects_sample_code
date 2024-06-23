public class cpf {


    private String numeroDoCpf;
    private boolean queimado;

    public cpf(){

    }
    public cpf(String numeroDoCpf, boolean queimado) {
        this.numeroDoCpf = numeroDoCpf;
        this.queimado = queimado;
    }


    public boolean isQueimado() {
        return queimado;
    }

    public void setQueimado(boolean queimado) {
        this.queimado = queimado;
    }

    public String getNumeroDoCpf() {
        return numeroDoCpf;
    }

    public void setNumeroDoCpf(String numeroDoCpf) {
        this.numeroDoCpf = numeroDoCpf;
    }


}
