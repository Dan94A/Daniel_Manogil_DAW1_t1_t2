package data;
import java.util.Scanner;
public class Coche extends main.Entrada{
    //DEFINICIÓN DE ATRIBUTOS DEL OBJETO COCHE
    private String marca, modelo, matricula;
    private int cv,cc,kmRecorridos,velocidad;
    //CREACIÓN DEL CONSTRUCTOR
    public Coche (String marca, String modelo, String matricula, int cv, int cc, int velocidad, int kmRecorridos) {
        this.marca=marca;
        this.modelo=modelo;
        this.matricula=matricula;
        this.cv=cv;
        this.cc=cc;
        this.velocidad=velocidad;
        this.kmRecorridos=kmRecorridos;
    }
    //MÉTODOS GETTER
    public String getmarca() {
        return this.marca;
    }
    public String getmodelo() {
        return this.modelo;
    }
    public String getmatricula() {
        return this.matricula;
    }
    public int getcv() {
        return this.cv;
    }
    public int getcc() {
        return this.cc;
    }
    public int getvelocidad() {
        return this.velocidad;
    }
    public int getkmRecorridos() {
        return this.kmRecorridos;
    }
    //MÉTODOS SETTER
    public void setmarca(String marca) {
        this.marca=marca;
    }
    public void setmodelo(String modelo) {
        this.modelo=modelo;
    }
    public void setmatricula(String matricula) {
        this.matricula=matricula;
    }
    public void setcv(int cv) {
        this.cv=cv;
    }
    public void setcc(int cc) {
        this.cc=cc;
    }
    public void setvelocidad(int velocidad) {
        this.velocidad=velocidad;
    }
    public void setkmRecorridos(int kmRecorridos) {
        this.kmRecorridos=kmRecorridos;
    }
    //MÉTODO PARA MOSTRAR DATOS
    public void mostrardatos() {
        System.out.println("Mostrando datos de coche:");
        System.out.println("Marca: " + getmarca());
        System.out.println("Modelo " + getmodelo());
        System.out.println("Matricula " + getmatricula());
        System.out.println("CV: " + getcv() + " Caballos");
        System.out.println("Cilindrada " + getcc() + " centímetros cúbicos");
        System.out.println("Velocidad actual" + getvelocidad() + " km/h");
    }
    //MÉTODO PARA ACELERAR UN COCHE
    public void acelerar() {
        Scanner sc= new Scanner(System.in);
        System.out.println ("Su coche " + getmarca() + " " + getmodelo() + " tiene una velocidad de " + getvelocidad() + " km/h");
        System.out.println ("En cuántos kilometros desea incrementar su velocidad?");
        int rVelocidad= sc.nextInt();
        if (cv>100) {
            int aceleracion= (((int)(Math.random() * rVelocidad ) + 10));
            aceleracion=aceleracion/2;
            System.out.println("Ha conseguido recorrer " + aceleracion + " kilometros este turno");
            setvelocidad(velocidad + aceleracion);
            setkmRecorridos(kmRecorridos+aceleracion);
        }
        else
        {
            int aceleracion=(((int)(Math.random() * rVelocidad) +1));
            aceleracion=aceleracion/2;
            System.out.println("Ha conseguido recorrer " + aceleracion + " kilometros este turno");
            setvelocidad(velocidad + aceleracion);
            setkmRecorridos(kmRecorridos+aceleracion);
        }
        System.out.println(getmarca() + " Ha recorrido " + getkmRecorridos() + " Kilometros en total");
    }
}
