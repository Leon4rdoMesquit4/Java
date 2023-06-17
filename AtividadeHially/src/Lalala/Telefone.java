package Lalala;

public class Telefone {
    private String tipo;
    private String ddd;
    private String numero;

    public Telefone(String tipo, String ddd, String numero) {
        this.tipo = tipo;
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void imprimirTelefone(){
        System.out.println("Telefone { " +
                "tipo = '" + tipo + '\'' +
                ", ddd = '" + ddd + '\'' +
                ", numero = '" + numero + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "tipo='" + tipo + '\'' +
                ", ddd='" + ddd + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
