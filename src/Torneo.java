import java.util.ArrayList;
import java.util.List;

public class Torneo {
    private int cant_equipos;
    private String nombre_id;
    private ArrayList<Equipo> list_equipos=new ArrayList<>();
    private List<String> e;
    private List<String> d;
    public Torneo(int cant_equipos, String nombre_id) {
        this.cant_equipos = cant_equipos;
        this.nombre_id = nombre_id;
        LDt();
        LEquipo();
        cargar_Equipos();
    }

    public void cargar_Equipos(){
        for (int i = 0; i <= cant_equipos-1; i++) {
            Persona dt=new Persona(d.get(i));
            Equipo equip=new Equipo(e.get(i),dt);
            list_equipos.add(equip);
        }

    };

    public int getCant_equipos() {
        return cant_equipos;
    }

    public void setCant_equipos(int cant_equipos) {
        this.cant_equipos = cant_equipos;
    }

    public String getNombre_id() {
        return nombre_id;
    }

    public void setNombre_id(String nombre_id) {
        this.nombre_id = nombre_id;
    }

    public ArrayList<Equipo> getList_equipos() {
        return list_equipos;
    }

    public void setList_equipos(ArrayList<Equipo> list_equipos) {
        this.list_equipos = list_equipos;
    }

    public void LEquipo(){
        e=new ArrayList<>();
        e.add("TitanFC");
        e.add("LosChanchitos");
        e.add("RealMandril");
        e.add("Bover");
        e.add("GarcalonaFc");
        e.add("ElFarsa");
        e.add("DepTachito");
        e.add("NoManchester");
        e.add("PapitasClub");
        e.add("SanDescenso");
        e.add("Indesingente");
    }
    public void LDt(){
        d=new ArrayList<>();
        d.add("Escaloni");
        d.add("MuñecaGallarda");
        d.add("TitalPalermo");
        d.add("PepeGuardalo");
        d.add("Brujita");
        d.add("Almidon");
        d.add("Demicheles");
        d.add("Cambiazo");
        d.add("Pochetini");
        d.add("Argento");
        d.add("Silvestre");
    }
}
