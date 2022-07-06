import java.util.Scanner;

class student{
    private int Usn;
    private String Name;
    student(int u,String N)
     {
        this.Usn=u;
        this.Name=N;
    }
    public void printData()
    {
        System.out.println(Usn+"\t"+Name);
    }
}
    



public class cons_demo {

    public static void main(String[] args) {
        int i;
        student [] s=new student [3];
        Scanner obj=new Scanner(System.in);
        for(i=0;i<3;i++)
        {
            int u=obj.nextInt();
            String n=obj.next();
            s[i]=new student(u,n);

        }
        for(i=0;i<3;i++)
        {
            s[i].printData();
        }
        
    }
    
}
