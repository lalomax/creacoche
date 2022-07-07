public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();

        miCoche.AumentarPuerta();
        System.out.println("El número de puertas es : " + miCoche.puertas);
    }
}


class Coche {
    public int puertas = 0;

    public void AumentarPuerta() {
        this.puertas++;
    }
}
