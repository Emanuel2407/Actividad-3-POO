
package backend;

public class Rectangulo extends FiguraGeometrica{
    
    private double base;
    private double altura;
    
    public Rectangulo(){
        
    }
    
    public Rectangulo(double base, double altura){
        
        this.base = base;
        this.altura = altura;
    }
    
    public Rectangulo(double base, double altura, String color, boolean relleno){
        super(color, relleno);
        
        this.base = base;
        this.altura = altura;
    }
    
    
    public double getBase(){
        return base;
    }
    
    public void setBase(double base){
        
        this.base = base;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double altura){
        
        this.altura = altura;
    }
    
    public double getArea(){
        double area;
        
        area = (base * altura);
        
        return area;
    }
    
    public double getPerimetro(){
        double perimetro;
        
        perimetro = 2 * (base + altura);
        
        return perimetro;
    }
    
    
    public String toString(){
        String descripcionRectangulo;
        
        if(getRelleno()){
           descripcionRectangulo = "Este rectángulo tiene un área de: " + this.getArea() + ", un perímetro de: " + this.getPerimetro() + 
                   ", es de color: " + getColor() + " y SÍ esta relleno.";
       }else{
           descripcionRectangulo = "Este rectángulo tiene un área de: " + this.getArea() + ", un perímetro de: " + this.getPerimetro() + 
                   ", es de color: " + getColor() + " y NO esta relleno.";
       }
        
        return descripcionRectangulo;
    }
}
