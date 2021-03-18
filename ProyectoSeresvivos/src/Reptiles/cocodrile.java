package Reptiles;


	public class cocodrile extends reptiles {
	    cocodrile(String sistemaDigestivo, String tiempoDeVida, Double TemperaturaCorporal,  boolean tienecola) {
	        super(sistemaDigestivo, tiempoDeVida);
	    }
	    
	
	    
	

	    

		public static void main(String[] args) {
	       cocodrile cocodrile = new cocodrile("carnivoro", "70 años" , 50.0, true);
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

		

