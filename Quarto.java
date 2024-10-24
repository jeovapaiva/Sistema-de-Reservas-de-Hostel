public class Quarto {
    private int numero;
    private int numeroDeCamas;
    private int camasOcupadas;
    private double precoPorDiaria;
    private boolean disponivel;
    private String senhaArmario;

    public Quarto(int numero, int numeroDeCamas, double precoPorDiaria) {
        this.numero = numero;
        this.numeroDeCamas = numeroDeCamas;
        this.camasOcupadas = 0;
        this.precoPorDiaria = precoPorDiaria;
        this.disponivel = true; // Quarto disponível por padrão
        this.senhaArmario = "";
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumeroDeCamas(int numeroDeCamas) {
        return numeroDeCamas;
    }

    public void setNumeroDeCamas(int numeroDeCamas) {
        this.numeroDeCamas = numeroDeCamas;
    }

    public int getCamasOcupadas() {
        return camasOcupadas;
    }

    public void setCamasOcupadas(int camasOcupadas) {
        this.camasOcupadas = camasOcupadas;
    }

    public double getPrecoPorDiaria() {
        return precoPorDiaria;
    }

    public void setPrecoPorDiaria(double precoPorDiaria) {
        this.precoPorDiaria = precoPorDiaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void reservar() {
        this.disponivel = false;
    }

    public String getSenhaArmario() {
        return senhaArmario;
    }

    public void setSenhaArmario(String senhaArmario) {
        this.senhaArmario = senhaArmario;
    }

    @Override
    public String toString() {
        return "Quarto " + numero + ": " + numeroDeCamas + " camas, Preço: " + precoPorDiaria + " por diaria, Disponível: " + disponivel;
    }
}
