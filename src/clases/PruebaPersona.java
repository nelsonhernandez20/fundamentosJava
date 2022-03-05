
package clases;


public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona();
        persona1.nombre="nelson";
        persona1.apellido="hernandez";
        persona1.desplegarInformacion();
        System.out.println("\n");
        Persona persona2 = new Persona();
        persona2.nombre = "alejandro";
        persona2.apellido= "Hernandez";
        persona2.desplegarInformacion();
                
    }
}
