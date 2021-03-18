package Reptiles;
import javax.print.DocFlavor.STRING;

import Animales.*;



class Reptiles extends Animales {

    protected boolean viviparo;
    private double temperaturaCorporal;
    private boolean tienecola;

    public void reproducirse() {
        System.out.println("Un reptil se está reproduciendo");
    }

    public void respirar() {
        System.out.println("Un reptil se está reproduciendo");
    }

    public void arrastrarse() {
        System.out.println("Esta arrastrandose");
    };

  
    
    

    protected void setTemperaturaCorporal(Double temperatura) {
        this.temperaturaCorporal = temperatura;
    }

    protected void getTemperaturaCorporal(Double temperatura) {
        this.temperaturaCorporal = temperatura;
    }


    public Reptiles(String sistemaDigestivo, String tiempoDeVida){
        super(sistemaDigestivo, tiempoDeVida);
        this.setTemperaturaCorporal(temperaturaCorporal);
        
    }

	protected void getTienecola(boolean tienecola) {
		this.tienecola = tienecola;
	}

	protected void settienecola(boolean tienecola) {
		this.tienecola = tienecola;
	}

	
}
