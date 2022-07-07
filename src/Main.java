public class Main {
    public static void main(String[] args) {

        System.out.println("La suma es :" + suma(10,20,30));

        Coche miCoche = new Coche();
        miCoche.AumentarPuerta();
        System.out.println("El número de puertas es : " + miCoche.puertas);
    }
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}


class Coche {
    public int puertas = 0;

    public void AumentarPuerta() {
        this.puertas++;
    }
}
