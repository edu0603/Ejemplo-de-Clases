package Marinos;

import Animales.*;

class Marinos extends Animales {

    protected boolean tieneAletas;
    protected double temperaturaCorporal;
    protected double presiónAgua;

    public Marinos(String sistemaDigestivo, String tiempoDeVida, boolean tieneAletas, Double temperatura,
            Double presión) {
        super(sistemaDigestivo, tiempoDeVida);
        this.tieneAletas = tieneAletas;
        this.temperaturaCorporal = temperatura;
        this.presiónAgua = presión;
    }

    public void reproducirse() {
        System.out.println("Un Animal marino se está reproduciendo");
    }

    public void respirar() {
        System.out.println("Un Animal marino se está reproduciendo");
    }

    public void Nadar() {
        System.out.println(".°.. ><(((((° Nadando");
    };

    protected void setTieneAletas(boolean tiene) {
        this.tieneAletas = tiene;
    }

    protected boolean getTieneAletas() {
        return this.tieneAletas;
    }

    protected void setTemperaturaCorporal(Double temperatura) {
        this.temperaturaCorporal = temperatura;
    }

    protected Double getTemperaturaCorporal() {
        return this.temperaturaCorporal;
    }

    protected void setPresiónAgua(Double presión) {
        this.presiónAgua = presión;
    }

    protected Double getPresiónAgua() {
        return this.presiónAgua;
    }
}