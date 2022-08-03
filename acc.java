import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class user{
    String name;
    user(String name){
        this.name=name;
    }
  class account{
    int ac_no;
    Double balance;
    account(int ac_no,double balance){
        this.ac_no=ac_no;
        this.balance=balance;
     }
  }
   account[] a=new account[2];
    

   void deposite(int acc_no,double amt){
    int found=0,k=-1,i;
    for(i=0;i<2;i++){
        if(a[i].ac_no==acc_no){
            k=i;
            found=1;
            break;
        }
        
    }
     if(found==1){
        a[k].balance+=amt;
        System.out.println("balance:"+a[i].balance);
     }
     else
     {
        System.out.println("Enter the valid account number");
     }

   }

   void withdraw(int acc_no,double amt){
    int found=0,k=-1,i;
    for(i=0;i<2;i++){
        if(a[i].ac_no==acc_no){
            k=i;
            found=1;
            break;

        }
        if(found==1){
             if(a[k].balance>=amt || a[k].balance>=500)
             {
            a[k].balance-=amt;
            System.out.println("balance:"+a[i].balance);
             }
             else
             {
                System.out.println("insufficient balance");

             }
            }
        else
        {
            System.out.println("Enter the valid account number");
        }

        
        }
    }

    void create_accont()
    {
        Scanner sc=new  Scanner(System.in);
        int ac_no;
        double amt;
        for(int i=0;i<2;i++)
        {
            System.out.println("Enter the account number:");
            ac_no=sc.nextInt();
            System.out.println("Enter the amount:");
            amt=sc.nextDouble();
            a[i]=new account(ac_no,amt);
        }

    }



   }


public class acc {
    public static void main(String[] args) {
         String name;
         int ac_no,ch;
         double amt;
         boolean op=true;
         Scanner sc=new  Scanner(System.in);
         System.out.println("Enter the user name:");
         name=sc.next();
         user u=new user(name);
         u.create_accont();
         while(op){
            System.out.println("1.Deposite\n2.withdraw");
            System.out.println("Enter your choice:");
            ch=sc.nextInt();
            switch(ch){
                case 1: System.out.println("Enter the Account number");
                ac_no=sc.nextInt();
                System.out.println("Enter the amount:");
                amt=sc.nextDouble();
                u.deposite(ac_no,amt);
                break;
                case 2: System.out.println("Enter the Account number");
                ac_no=sc.nextInt();
                System.out.println("Enter the amount:");
                amt=sc.nextDouble();
                u.withdraw(ac_no,amt);
                break;
                default: System.out.println("Enter valid choice");
                break;
                 
                
            }
            System.out.println("Do you want to continue\n true for yes \n false for no");
             op=sc.nextBoolean();
         }

    }
    
}
