package Marinos;

public class Pez extends Marinos {
    Pez(String sistemaDigestivo, String tiempoDeVida, boolean tieneAletas, Double temperatura, Double presión) {
        super(sistemaDigestivo, tiempoDeVida, tieneAletas, temperatura, presión);
    }

    public static void main(String[] args) {
       Pez Pez = new Pez("Herbivoro", "10 años", true, 70.0, 70.0);
    }
}