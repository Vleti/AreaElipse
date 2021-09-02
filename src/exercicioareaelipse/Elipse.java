package exercicioareaelipse;

public class Elipse {
    double a,b;
    
    public void setA(double x){
        this.a=x;
    }
    
    public void setB(double x){
        this.b=x;
    }
    
    public double getAreaElipse(){
        if(a<0 || b<0){
            return 0;
        }
        double areaElipse = (Math.PI*a*b)/4;
        return areaElipse;
    }   
}
