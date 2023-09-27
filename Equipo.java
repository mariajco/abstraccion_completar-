import java.util.ArrayList;
import java.util.List;
public class Equipo {
    private String nombreEquipo;
    private String paisEquipo;
    private static double sumaTiempos;
    private List<Ciclista> ciclistas = new ArrayList<>();
    public Equipo(String nombreEquipo, String paisEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.paisEquipo = paisEquipo;
    }
    public String getNombreEquipo() {
        return nombreEquipo;
    }
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    public String getPaisEquipo() {
        return paisEquipo;
    }
    public void setPaisEquipo(String paisEquipo) {
        this.paisEquipo = paisEquipo;
    }
    public static double getSumaTiempos() {
        return sumaTiempos;
    }
    public static void setSumaTiempos(double sumaTiempos) {
        Equipo.sumaTiempos = sumaTiempos;
    }
    protected void añadirCiclista(Ciclista ciclista) {
        ciclistas.add(ciclista);
    }
    
    
    protected void listarEquipo(){
            System.out.println("Nombre del equipo: " + nombreEquipo);
            System.out.println("País del equipo: " + paisEquipo);
            System.out.println("Integrantes del equipo:");
            for (Ciclista ciclista : ciclistas) {
                System.out.println(" - Nombre: " + ciclista.getNombre());
                System.out.println("   Tipo: " + ciclista.imprimirTipo());
            }
        }}
        
    

    

    

