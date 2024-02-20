package data;
import java.util.Scanner;
//DEFINICIÓN DE CLASE Y ATRIBUTOS DE OBJETO
public class Carrera extends main.Entrada{
    private String matrGanadora;
    private  int kmTotales, numeroVueltas;
    private static int ganador=0;
    //CREAMOS CONSTRUCTOR
    public Carrera(int kmTotales, int numeroVueltas, String matrGanadora) {
        this.kmTotales=kmTotales;
        this.numeroVueltas=numeroVueltas;
        this.matrGanadora="";
    }
    //METODOS GETTER
    public int getkmTotales() {
        return this.kmTotales;
    }
    public  int getnumeroVueltas() {
        return this.numeroVueltas;
    }
    public  String getmatrGanadora() {
        return this.matrGanadora;
    }
    //METODOS SETTER
    public void setkmTotales(int kmTotales) {
        this.kmTotales=kmTotales;
    }
    public void setnumeroVueltas(int numeroVueltas) {
        this.numeroVueltas=numeroVueltas;
    }
    public void setmatrGanadora(String matrGanadora) {
        this.matrGanadora=matrGanadora;
    }
    public void datosCarrera() {
        System.out.println("La carrera tiene " + getkmTotales() + " km totales");
        System.out.println("La carrera tiene " + getnumeroVueltas() + " vueltas totales");
    }
    //MÉTODO DE DECLARACIÓN DE GANADOR
    public void ganador() {
        if(ganador==3) {
            System.out.println ("HA HABIDO UN EMPATE PORQUE LOS DOS COCHES HAN LLEGADO AL MISMO TIEMPO");
        }else
        {
            System.out.println("EL COCHE CON LA MATRICULA " + getmatrGanadora() + " HA GANADO");
        }
    }
    //METODO DE RASTREO DEL GANADOR
    public void racetracking(Coche cocheChevrolet, Coche cocheRenault) {
        if (cocheChevrolet.getkmRecorridos() >= getkmTotales()) {
            if(cocheRenault.getkmRecorridos() >= getkmTotales()) {
                ganador=3;
            }
            else
            {
                ganador=1;
                setmatrGanadora(cocheChevrolet.getmatricula());
            }
        }
        else
        {
            if (cocheRenault.getkmRecorridos() >= getkmTotales()) {
                ganador=2;
                setmatrGanadora(cocheRenault.getmatricula());
            }
        }
    }
    //MÉTODO DE CARRERA, AQUÍ TIENE LUGAR LA CARRERA, IMPORTAMOS LOS OBJETOS DE ENTRADA
    public  void racing(Coche cocheChevrolet, Coche cocheRenault) {
        //DATOS DE COCHES
        Scanner sc= new Scanner(System.in);
        System.out.println("Desea empezar la carrera con los datos introducidos? Si/No");
        String start = sc.next();
        if (start.equals("Si")){
            for (int i=0; ganador==0; i++) {
                System.out.println("Turno numero " + (i+1));
                System.out.println("Es el turno del coche " + cocheChevrolet.getmarca());
                cocheChevrolet.acelerar();
                System.out.println("_________________________________");
                System.out.println("Es el turno del coche " + cocheRenault.getmarca());
                cocheRenault.acelerar();
                racetracking(cocheChevrolet, cocheRenault);
            }
            ganador();
        }
    }
}
