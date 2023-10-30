import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private Persona DT;
    private List<Jugador> list_jugadores=new ArrayList<>();

    private String nombre_equipo;



    private List<String> j;

    public Equipo() {

    }

    public Equipo(String nombre_equipo,Persona Dt) {
        this.DT = Dt;
        this.nombre_equipo = nombre_equipo;
        LJugador();
        cargar_Jugadores();
    }
    public void cargar_Jugadores(){
        for (int i = 0; i <= 6; i++) {
            Jugador jug= new Jugador(j.get(i),i);
            list_jugadores.add(jug);
        }

    };

    public Persona getDT() {
        return DT;
    }

    public void setDT(Persona DT) {
        this.DT = DT;
    }

    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public void setNombre_equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }



    public void LJugador(){
        j=new ArrayList<>();
        j.add("SifonRodriguez");
        j.add("ElMantecaMartinez");
        j.add("TeclaMontolla");
        j.add("CalecitaGimenez");
        j.add("Marambona");
        j.add("LeonardoMessirve");
        j.add("HernanCastolo");

    }
}
