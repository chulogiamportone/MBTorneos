public class Jugador extends Persona{
    private int numero_jugador;
    private int tarjetas_a;
    private int tarjetas_r;
    private int goles;
    public Jugador() {

    }

    public Jugador(String nombre, int numero_jugador) {
        super(nombre);
        this.numero_jugador = numero_jugador;
    }

    public int getNumero_jugador() {
        return numero_jugador;
    }

    public void setNumero_jugador(int numero_jugador) {
        this.numero_jugador = numero_jugador;
    }

    public int getTarjetas_a() {
        return tarjetas_a;
    }

    public void setTarjetas_a(int tarjetas_a) {
        this.tarjetas_a = tarjetas_a;
    }

    public int getTarjetas_r() {
        return tarjetas_r;
    }

    public void setTarjetas_r(int tarjetas_r) {
        this.tarjetas_r = tarjetas_r;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
}
