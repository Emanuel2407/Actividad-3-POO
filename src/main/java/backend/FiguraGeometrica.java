package backend;
import java.util.Date;

public abstract class FiguraGeometrica {
    
    private String color = "Blanco";
    
    private boolean relleno = false;
    
    private Date fechaCreacion;
    
    
    public FiguraGeometrica(){ 
        
        this.fechaCreacion = new Date();
    }
    
    public FiguraGeometrica(String color, boolean relleno ){
        this.color = color;
        this.relleno = relleno;
    }
    
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    
    public boolean getRelleno(){
        return relleno;
    }
    public void setRelleno(boolean relleno){
        this.relleno = relleno;
    }
    
   public Date getFechaCreacion(){
       return fechaCreacion;
   }
    
    public abstract String toString();
}
