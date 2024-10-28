package backend;


public class Triangulo extends FiguraGeometrica{
    
   private double lado1 = 1.0, lado2 = 1.0,lado3 = 1.0; ; 
   
   public Triangulo(){
       
   }
   
   public Triangulo(double lado1, double lado2, double lado3){
       
       this.lado1 = lado1;
       this.lado2 = lado2;
       this.lado3 = lado3;
   }
   
   public Triangulo(double lado1, double lado2, double lado3, String color, boolean relleno){  
       super(color, relleno);
       
       this.lado1 = lado1;
       this.lado2 = lado2;
       this.lado3 = lado3;
   }
   
   public double getLado1(){
       return lado1;
   }
   
   public void setLado1(double lado1){
       
       this.lado1 = lado1;
   }
   
      public double getLado2(){
       return lado2;
   }
   
   public void setLado2(double lado2){
       
       this.lado2 = lado2;
   }
   
      public double getLado3(){
       return lado3;
   }
   
   public void setLado3(double lado3){
       
       this.lado3 = lado3;
   }
   
   public double getArea(){
       double areaTriangulo, semiPerimetro;
       
       semiPerimetro = (lado1 + lado2 + lado3)/2;
       
       areaTriangulo = Math.sqrt((semiPerimetro * (semiPerimetro-lado1) * (semiPerimetro-lado2) * (semiPerimetro-lado3)));
       
       return areaTriangulo;
   }
   
   public double getPerimetro(){
       double perimetro;
       
       perimetro = (lado1 + lado2 + lado3);
       
       return perimetro;
   }

    public String toString(){
        String descripcionTriangulo;
        
        if(getRelleno()){
           descripcionTriangulo = "Este triángulo tiene un área de: " + this.getArea() + ", un perímetro de: " + this.getPerimetro() + 
                   ", es de color: " + getColor() + " y SÍ esta relleno";
       }else{
           descripcionTriangulo = "Este triángulo tiene un área de: " + this.getArea() + ", un perímetro de: " + this.getPerimetro() + 
                   ", es de color: " + getColor() + " y NO esta relleno";
       }
        return descripcionTriangulo;
    }
}
