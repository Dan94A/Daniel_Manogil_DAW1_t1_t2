package main;
import data.Coche;
import data.Carrera;
import java.util.Scanner;
//METODO MAIN, AQUI SE CREAN LOS OBJETOS COCHES Y CARRERA, AL ESTAR DEFINIDOS EN MÉTODOS ESTÁTICOS SE ENVÍAN A LAS CLASES QUE NO LO SON REFERENCIANDO LOS OBJETOS EN EL METODO
public class Entrada {
    public static void  main(String[] args) {
        //INPUT DE COCHES
        Coche cocheChevrolet=new Coche("Chevrolet","Cruze","7201JDC",150,2400,0,0);
        Coche cocheRenault=new Coche("Renault","Megane","6025HVR",90,1500,0,0);
        Scanner sc= new Scanner(System.in);
        //INPUT DE CARRERA
        System.out.println("BIEVENIDOS A LA CARRERA! ");
        System.out.println("Por favor indique cuántos kilometros quiere que tenga su carrera");
        int respuestakilometros=sc.nextInt();
        System.out.println("Por favor indique cuántas vueltas quiere que tenga su carrera");
        int respuestavueltas=sc.nextInt();
        Carrera carrera=new Carrera(respuestakilometros,respuestavueltas,"");
        System.out.println("A CONTINUACIÓN SE MOSTRARÁN LOS DATOS DE LOS COCHES QUE ESTÁN DISPONIBLES PARA COMPETIR");
        cocheChevrolet.mostrardatos();
        System.out.println("_________________________________");
        cocheRenault.mostrardatos();
        System.out.println("_________________________________");
        //EJECUCIÓN CARRERA
        carrera.racing(cocheChevrolet, cocheRenault);
    }
}
