package backend;

public class Circulo extends FiguraGeometrica{
    
    private double radio;
    
    public Circulo(){
        
    }
    
    public Circulo(double radio){
        
        this.radio = radio;
   }
   
   public Circulo(double radio,String color, boolean relleno){
       super(color, relleno);
       
       this.radio = radio;
   }
   
   public double getRadio(){
       return radio;
   }
   
   public void setRadio(double radio){
       this.radio = radio;
   }
   
   public double getArea(){
       double areaCirculo;
       
       areaCirculo = (Math.PI)*(Math.pow(radio, 2));
       
       return areaCirculo;
   }
   
   public double getPerimetro(){
       double perimetroCirculo;
       
       perimetroCirculo = 2 * (Math.PI) * radio;
       
       return perimetroCirculo;
   }
   
   public double getDiametro(){
       double diametroCirculo;
       
       diametroCirculo = 2 * radio;
       
       return diametroCirculo;
   }
   
   public String toString(){
       String descripcionCirculo;
       
       if(getRelleno()){
           descripcionCirculo = "Este circulo tiene un área de: " + this.getArea() + ", un perímetro de: " + getPerimetro() + 
                   ", es de color: " + getColor() + " y sí esta relleno";
       }else{
           descripcionCirculo = "Este circulo tiene un área de: " + getArea() + ", un perímetro de: " + getPerimetro() + 
                   ", es de color: " + getColor() + " y no esta relleno";
       }
       
       return descripcionCirculo;
   }
   

   
   
   

   
    
}
