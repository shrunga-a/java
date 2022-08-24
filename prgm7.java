import java.util.*;
class QueueException extends Exception{
    public void Error(){
        System.out.println("queue is full");
    }
}
class Queue{
    int front;
    int rear;
    int q[];
    Queue(int n){
        q=new int[n];
    }

    void insert(int ele)throws QueueException{
        if(rear==q.length){
            throw new QueueException();

        }
           if(front==-1)
           front=0;
           q[rear++]=ele;
        
    }
       int delete()
        {
        int ele;
        if(front==-1)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        if(front==rear){
            ele=q[front];
            rear=front=-1;
        }
        else{
            ele=q[front++];
        }
        return ele;
    }
    void display(){
        int i;
        if(front==-1){
            System.out.println("queue is empty");
            return;
        }
        for(i=front;i<rear;i++)
        System.out.println("the present queue is");
        System.out.println(+q[i]+"\n");


    }
}

public class prgm7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the size");
        int size =sc.nextInt();
        Queue que=new Queue(size);
        try{
            while(true){
                System.out.println("\n 1.Insert \n 2.delete \n 3. display");
                System.out.println(" enter the choice");
                int choice =sc.nextInt();
                switch(choice){
                    case 1:System.out.println("\n enter the elements to be instered");
                    que.insert(sc.nextInt());
                    break;
                    case 2:System.out.println("delete"+que.delete());
                    break;
                    case 3:que.display();
                    break;
                    default:System.out.println("wrong choice");
                    break;
                }
            }
        }
        catch(QueueException e){
            e.Error();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("queue is empty");

        }
    }
    
}
