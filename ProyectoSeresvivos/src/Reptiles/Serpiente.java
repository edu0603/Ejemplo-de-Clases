package Reptiles;


	public class Serpiente extends Reptiles {
	    Serpiente(String sistemaDigestivo, String tiempoDeVida, Double TemperaturaCorporal,  boolean tienecola) {
	        super(sistemaDigestivo, tiempoDeVida);
	    }
	    
	
	    
	

	    

		public static void main(String[] args) {
	       Serpiente serpiente = new Serpiente("carnivoro", "25 a�os" , 38.0, true);
	       serpiente.arrastrarse();
	       serpiente.reproducirse();
	       serpiente.respirar();
	       serpiente.viviparo();
	    }


	    
	    public void arrastrarse(){
	        System.out.println("La serpiente se esta arrastrando");
	    }
	    
	    
		private void viviparo() {
			
			System.out.println("la serpiente es vivipara");
	    }	
			
		}

		

