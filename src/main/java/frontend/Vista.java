package frontend;
import java.util.Scanner;
import backend.*;


public class Vista {
    
    static Scanner input = new Scanner(System.in);
    static Circulo objCirculo = new Circulo();
    

    public static void main(String[] args) {
        
        VistaFiguraGeometrica();
    }

    private static void VistaFiguraGeometrica() {
        byte opcFiguraGeometrica;
        
        
        System.out.println("Ingrese la figura geométrica que desea crear teniendo en cuenta las siguientes opciones:");
        System.out.println("1) Circulo \n2) Rectángulo \n3) Triángulo \n4) Salir");
        opcFiguraGeometrica = input.nextByte();
        
        switch(opcFiguraGeometrica){
            
            case 1: vistaCirculo(); break; 
            
            case 2: vistaRectangulo(); break; 
            
            case 3: vistaTriangulo(); break;
            
            case 4: input.close(); break; 
            
            default: System.out.println("Opción no válida"); break;
        }

    }

    private static void vistaCirculo() {  
        String color, descripcion;
        boolean relleno;
        double radio;
        
        System.out.println("¿De que color deseas tu circulo?"); 
        color = input.next();
        objCirculo.setColor(color);
        
        System.out.println("¿Tu circulo esta relleno? true/false");  
        relleno = input.nextBoolean();
        objCirculo.setRelleno(relleno);
        
        System.out.println("¿Cuál es el radio de tu circulo?");
        radio = input.nextDouble();
        objCirculo.setRadio(radio);
        
        descripcion = objCirculo.toString();
        
        System.out.println(descripcion);
        System.out.println("Tu circulo fue creado en la siguiente fecha: " + objCirculo.getFechaCreacion()); 
    }

    
    
    private static void vistaRectangulo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    private static void vistaTriangulo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
