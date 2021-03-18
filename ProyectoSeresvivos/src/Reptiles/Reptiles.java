package Reptiles;
import javax.print.DocFlavor.STRING;

import Animales.*;



class reptiles extends Animales {

    private boolean viviparo;
    private double temperaturaCorporal;
    private boolean exoesqueleto;
    private STRING texturadepiel;
	private boolean oviparo;

    public void reproducirse() {
        System.out.println("Un reptil se está reproduciendo");
    }

    public void respirar() {
        System.out.println("Un reptil se está reproduciendo");
    }

    public void arrastrarse() {
        System.out.println("Esta arrastrandose");
    };

    public void setviviparo(boolean tiene) {
        this.viviparo = tiene;
    }

    public boolean getviviparo() {
        return this.viviparo;
    }
    
    public void setoviparo(boolean tiene) {
        this.oviparo = tiene;
    }

    public boolean getoviparo() {
        return this.oviparo;
    }
    
    

    protected void setTemperaturaCorporal(Double temperatura) {
        this.temperaturaCorporal = temperatura;
    }

    protected void getTemperaturaCorporal(Double temperatura) {
        this.temperaturaCorporal = temperatura;
    }

 public void reptil() {
    	
    	if (this.exoesqueleto) {
    		System.out.println("Esta animal tiene exoesqueleto");
    	}
    	
    	else {
    		System.out.println("Este animal no es de hueso exoesqueleto");
    	}
 }

    public reptiles(String sistemaDigestivo, String tiempoDeVida, boolean viviparo, Double temperatura, boolean exoesqueleto){
        super(sistemaDigestivo, tiempoDeVida);
        this.viviparo = viviparo;
        this.temperaturaCorporal = temperatura;
        this.exoesqueleto = exoesqueleto;
    }

}
