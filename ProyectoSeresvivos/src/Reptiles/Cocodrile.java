package Reptiles;


	public class Cocodrile extends Reptiles {
	    Cocodrile(String sistemaDigestivo, String tiempoDeVida, Double TemperaturaCorporal,  boolean tienecola) {
	        super(sistemaDigestivo, tiempoDeVida);
	    }
	    
	
	    
	

	    

		public static void main(String[] args) {
	       Cocodrile cocodrile = new Cocodrile("carnivoro", "70 a�os" , 50.0, true);
	       cocodrile.arrastrarse();
	       cocodrile.reproducirse();
	       cocodrile.respirar();
	       cocodrile.viviparo();
	    }


	    
	    public void arrastrarse(){
	        System.out.println("El cocodrilo se arrastra");
	    }
	    
	    
		private void viviparo() {
			
			System.out.println("El cocodrilo es viviparo");
	    }	
			
		}

		

