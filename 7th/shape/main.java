package shape;

public class main {
    public static void main(String[] args) {
        sqr sq =new sqr();
        triangle tr=new triangle();
        circle clr=new circle();
        sq.getdata((int)5);
        System.out.println("area of squar"+sq.area());
        tr.getdata((double)15.4,(double)5.4);
        System.out.println("area of triangle"+tr.area());
        clr.getdata((int)4);
        System.out.println("area of cirlce "+clr.area());
    }
    
}
