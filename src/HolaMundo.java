
import java.util.Scanner;

// mi clase en java
public class HolaMundo {

    public static void main(String args[]) {
        /*int miVariableEntera = 10;
        System.out.println("el valor de mi variable es " + miVariableEntera);
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        String miVariableCadena = "esto es un string";
        System.out.println(miVariableCadena);
        var miVariableEntera2 = 20;
        System.out.println(miVariableEntera2);
        var usuario = "nelson";
        var titulo = "ingeniero";
        var union = titulo+" "+usuario;
        System.out.println("union = " + union);
        var nombre= "nelson";
        System.out.println("este es mi nombre: \n\n"+nombre);
        System.out.println("tabulador \t"+nombre);
        System.out.println("retroceso:  \b"+nombre);
        System.out.println("comillas simples \'"+nombre+"\'");
        System.out.println("comillas dobles \""+nombre+"\"");
        
        System.out.println("Escriba su nombre");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine();
        System.out.println("Escriba el titulo\n");
        var titulo = consola.nextLine();
        System.out.println("titulo = " + titulo+" "+usuario);

        
        float numeroF = (float)3.4028235E38;
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(numeroF);
        var numero = 10;
        System.out.println("numero = " + numero);
        boolean edad = 10 > 2;
        if (edad) {
            System.out.println("es verdadero");
        } else {

            System.out.println("no es verdadero");
        }*/

        //convertir un tipo string a un tipo int
//        String numero = "20";
//        int numeroConvertido = Integer.parseInt(numero);
//        System.out.println("numeroConvertido = " + (numeroConvertido + 2));
//        double valorPI = Double.parseDouble("3.1416");
//        System.out.println("valorPI = " + valorPI);
        //pedir un valor 
//        System.out.println("pasar un valor");
//        Scanner consola = new Scanner(System.in);
//        String valor1 = consola.nextLine();
//        int num1 = Integer.parseInt(valor1);
//        System.out.println("num1 = " + (num1 + 4));
//        
//      
//        int e = 3;
//        int f = e++;
//        System.out.println("e = " + e);
//        System.out.println("f = " + f);
//        System.out.println("f = " + f);
//var resultado = (3>2) ? "verdadero" : "falso";
//        System.out.println("resultado = " + resultado);
//        int numero = 5;
//        resultado = (numero%2 == 0)? "es par" : "es impar";
//        System.out.println("resultado = " + resultado);
//        int x = 6;
//        int y = 4;
//        int z = ++x + y--;
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);
//        System.out.println("z = " + z);
        int numero = 3;
        String valorTexto = "valor desconocido";

        switch (numero) {
            case 1:
                valorTexto = "numero1";
                break;
            case 2:
                valorTexto = "numero2";
                break;
            case 3:
                valorTexto = "numero3";
                break;
            case 4:
                valorTexto = "numero4";
                break;
            default:
                valorTexto = "numero no encontrado";
        }
        System.out.println("valorTexto = " + valorTexto);
    }
}
