package shape;

public class triangle {
    double b;
    double h;
    
    public void getdata(double temp1,double temp2){
        
       this.b=temp1;
       this.h=temp2;
    }
    public double area(){
        return((1.0/2.0)*(h*b));
    }
    
}