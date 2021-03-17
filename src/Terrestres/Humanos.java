package Terrestres;

public class Humanos extends Terrestres{

    private String nombre;
    private String sexo;

    public Humanos (String sistemaDigestivo, String tiempoDeVida,String tipoDeRespiracion,boolean tienePatas,
    String nombre, String sexo){
        super (sistemaDigestivo, tiempoDeVida, tipoDeRespiracion, tienePatas);

        this.nombre = nombre;
        this.sexo = sexo;

    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

        public String getNombre (){
            return this.nombre;
        }
    
    public void setSexo (String sexo){
        this.sexo = sexo;
    }

        public String getSexo (){
            return this.sexo;
        }

    public void hablar (){
        System.out.println(this.nombre + "está hablando");
    }

}
