package frontend;
import java.util.Scanner;
import backend.*;


public class Vista {
    
    static Scanner input = new Scanner(System.in);
    static Circulo objCirculo = new Circulo();
    static Rectangulo objRectangulo = new Rectangulo();
    static Triangulo objTriangulo = new Triangulo();
    

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
        String color, descripcion, relleno;
        double radio;
        
        System.out.println("¿De que color deseas tu circulo?"); 
        color = input.next();
        objCirculo.setColor(color);
        
        do{
            System.out.println("¿Tu circulo está relleno? si/no");
            relleno = input.next();

        }while(!(relleno.equalsIgnoreCase("si")) && !(relleno.equalsIgnoreCase("no")));
        
        if(relleno.equalsIgnoreCase("si")){
            objCirculo.setRelleno(true);
            
        }else{
            objCirculo.setRelleno(false);
        }

        System.out.println("¿Cuál es el radio de tu circulo?");
        radio = input.nextDouble();
        objCirculo.setRadio(radio);
        
        descripcion = objCirculo.toString();
        
        System.out.println(descripcion);
        System.out.println("Tu circulo fue creado en la siguiente fecha: " + objCirculo.getFechaCreacion()); 
    }

    
    
    private static void vistaRectangulo() {
        String color, descripcion,relleno ;
        double base, altura;
        
        System.out.println("¿De que color deseas tu rectángulo?"); 
        color = input.next();
        objRectangulo.setColor(color);
        
        do{
            System.out.println("¿Tu rectángulo está relleno? si/no");
            relleno = input.next();

        }while(!(relleno.equalsIgnoreCase("si")) && !(relleno.equalsIgnoreCase("no")));
        
        if(relleno.equalsIgnoreCase("si")){
            objRectangulo.setRelleno(true);
            
        }else{
            objRectangulo.setRelleno(false);
        }
        
        System.out.println("¿Cuál es la base de tu rectángulo?");
        base = input.nextDouble();
        objRectangulo.setBase(base);
        
        System.out.println("¿Cuál es la altura de tu rectángulo?");
        altura = input.nextDouble();
        objRectangulo.setAltura(altura);
        
        
        descripcion = objRectangulo.toString();
        
        System.out.println(descripcion);
        System.out.println("Tu rectángulo fue creado en la siguiente fecha: " + objRectangulo.getFechaCreacion()); 
    }

    
    
    private static void vistaTriangulo() {
        String color, descripcion, relleno;
        double lado1, lado2, lado3;
        
        System.out.println("¿De que color deseas tu triángulo?"); 
        color = input.next();
        objTriangulo.setColor(color);
        
        do{
            System.out.println("¿Tu triángulo está relleno? si/no");
            relleno = input.next();

        }while(!(relleno.equalsIgnoreCase("si")) && !(relleno.equalsIgnoreCase("no")));
        
        if(relleno.equalsIgnoreCase("si")){
            objTriangulo.setRelleno(true);
            
        }else{
            objTriangulo.setRelleno(false);
        }
        
        System.out.println("¿Cuál es el primer lado de tu tiángulo?");
        lado1 = input.nextDouble();
        objTriangulo.setLado1(lado1);
        
        System.out.println("¿Cuál es el segundo lado de tu tiángulo?");
        lado2 = input.nextDouble();
        objTriangulo.setLado2(lado2);
        
        System.out.println("¿Cuál es el tercer lado de tu tiángulo?");
        lado3 = input.nextDouble();
        objTriangulo.setLado3(lado3);
        
        
        descripcion = objTriangulo.toString();
        
        System.out.println(descripcion);
        System.out.println("Tu rectángulo fue creado en la siguiente fecha: " + objTriangulo.getFechaCreacion()); 
    }

   
}
