import java.util.Scanner;

public class prg3 {
    public static void main(String[] args) {
       
        StringBuffer sb =new StringBuffer("String");
        System.out.println("buffer before=" +sb);
      
        System.out.println("length =" +sb.length());
        System.out.println("capacity =" +sb.capacity());
        
        int Re=sb.length()-1;
        StringBuffer ob2=new StringBuffer();
        for( int i=Re;i>=0;i--){
            ob2.append(sb.charAt(i));

        }
        System.out.println("the text after reverse=" +ob2);
        String s=new String();
        s=ob2.toString();
        StringBuffer con=new StringBuffer(s);
        con.append(s.toUpperCase());
        System.out.println("the upper case is="+s.toUpperCase());
        System.out.println("enter the string to append");
        Scanner ap =new Scanner(System.in);
        s= ap.next();
        System.out.println("the string after appending"+con.append(s));
       

        


        


      
        
    }
   
       
        
    
   
}
