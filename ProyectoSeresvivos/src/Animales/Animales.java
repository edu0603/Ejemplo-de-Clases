package Animales;

public abstract class Animales {
    public abstract void respirar();
    public abstract void reproducirse();

    public String sistemaDigestivo;
    public String tiempoDeVida;

    public Animales(String sistemaDigestivo, String tiempoDeVida){
        this.sistemaDigestivo = sistemaDigestivo;
        this.tiempoDeVida = tiempoDeVida;
    }

    public void setSistemaDigestivo(String sistema){
        this.sistemaDigestivo = sistema;
    }

    public String getSistemaDigestivo(){
        return this.sistemaDigestivo;
    }

    public void setTiempoDeVida(String tiempo){
        this.tiempoDeVida = tiempo;
    }

    public String getTiempoDeVida(){
        return this.tiempoDeVida;
    }

}