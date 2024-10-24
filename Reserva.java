public class Reserva {
    private Cliente cliente;
    private Quarto quarto;
    private int dias;

    public Reserva(Cliente cliente, Quarto quarto, int dias) {
        this.cliente = cliente;
        this.quarto = quarto;
        this.dias = dias;
    }

    public Cliente getCliente(Cliente cliente) {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Quarto getQuarto(Quarto quarto) {
        return quarto;
    }

    public void setQuarto(Quarto quarto){
        this.quarto = quarto;
    }

    public int getDias(int dias){
        return dias;
    }
    
    public void setDias(int dias){
        this.dias = dias;
    } 

    public double calcularValorTotal() {
        return quarto.getPrecoPorDiaria() * dias;
    }

    @Override
    public String toString() {
        return "Reserva: " + cliente.getNomeCompleto() + " reservou o quarto " + quarto.getNumero() + " por " + dias + " dias. Valor total: R$" + calcularValorTotal();
    }
}
