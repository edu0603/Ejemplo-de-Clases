package Reptiles;


	public class Lagartija extends Reptiles {
	    Lagartija(String sistemaDigestivo, String tiempoDeVida, Double TemperaturaCorporal,  boolean tienecola) {
	        super(sistemaDigestivo, tiempoDeVida);
	    }
	    
	
	    
	

	    

		public static void main(String[] args) {
	       Lagartija lagartija = new Lagartija("carnivoro", "20 a�os" , 25.0, true);
	       lagartija.arrastrarse();
	       lagartija.reproducirse();
	       lagartija.respirar();
	       lagartija.viviparo();
	    }


	    
	    public void deslizarse(){
	        System.out.println("La lagartija se desliza");
	    }
	    
	    
		private void viviparo() {
			
			System.out.println("La lagartija es viviparo");
	    }	
			
		}

		

