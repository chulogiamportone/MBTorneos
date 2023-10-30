import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        Torneo t1= new Torneo(8,"Primer Torneo");
        ArrayList<Partido> p=new ArrayList<>();
        Equipo ganador=null;
        for (int i = 0; i <= t1.getCant_equipos()-1; i+=2) {
            Partido P=new Partido(t1.getList_equipos().get(i),t1.getList_equipos().get(i+1));
            p.add(P);
        }
        for (int j=0; j<=p.size()-1;j++){
            p.get(j).ImprimirPartido(j);

        }
        for (int j=0; j<=p.size()-1;j++){
            p.get(j).ImprimirPartido(j);
            String[] options = {"Ganó "+p.get(j).getEquipo_1().getNombre_equipo(), "Ganó "+p.get(j).getEquipo_2().getNombre_equipo()};
            int x = JOptionPane.showOptionDialog(null, "Cuál fue el resultado?",
                    "Click a button",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if (ganador==null){
                if (x==0){
                    ganador=p.get(j).getEquipo_1();
                }else{
                    ganador=p.get(j).getEquipo_2();
                }
            }else{
                if (x==0){
                    Partido P=new Partido(ganador,p.get(j).getEquipo_1());
                    p.add(P);
                }else{
                    Partido P=new Partido(ganador,p.get(j).getEquipo_2());
                    p.add(P);
                }
                ganador=null;


            }
            if(j== p.size()-1){
                JOptionPane.showMessageDialog(null, "El campeon es "+ganador.getNombre_equipo());
            }

        }

    }

}