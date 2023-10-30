public class Partido {
    private Equipo equipo_1;
    private Equipo equipo_2;
    private int gole1;
    private int gole2;


    public Partido(Equipo equipo_1, Equipo quipo_2) {
        this.equipo_1 = equipo_1;
        this.equipo_2 = quipo_2;
    }

    public Equipo getEquipo_1() {
        return equipo_1;
    }

    public void setEquipo_1(Equipo equipo_1) {
        this.equipo_1 = equipo_1;
    }

    public Equipo getEquipo_2() {
        return equipo_2;
    }

    public void setEquipo_2(Equipo equipo_2) {
        this.equipo_2 = equipo_2;
    }

    public int getGole1() {
        return gole1;
    }

    public void setGole1(int gole1) {
        this.gole1 = gole1;
    }

    public int getGole2() {
        return gole2;
    }

    public void setGole2(int gole2) {
        this.gole2 = gole2;
    }

    public void ImprimirPartido(int n){
        System.out.println("Partido numero "+n);
        System.out.println(equipo_1.getNombre_equipo()+" vs "+equipo_2.getNombre_equipo());
    }
}
