 class prg1_const {
    double l,b,h;
    prg1_const(double len)
 {
     this.l=h=b=len;
 }
    prg1_const(double len,double b,double h){
     this.l=len;
     this.b=b;
     this.h=h;
    }
    double volume()
    {
        return l*b*h;
    }
   void print(){
    System.out.println("Constructor overloading and method overloading");
   }
   void print(double v){
    System.out.println("Volume ="+v);
   }
    public class conster{
        public static void main(String[] args) {
            prg1_const ob1=new prg1_const(10);
            double v1=ob1.volume();
            ob1.print();
            ob1.print(v1);
            prg1_const ob2=new prg1_const(10,20,30);
            double v2=ob2.volume();
            ob2.print();
            ob2.print(v2);
        }

    }
    
}
