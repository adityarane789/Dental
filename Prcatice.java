import java.util.Scanner;

public class Prcatice {


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of nodes you want in ring");
        int n = sc.nextInt();

        System.out.println("The Ring is As Below:");

        for(int i=0;i<n;i++){

            System.out.print(i+" ");
        }

        System.out.println(0);

int choice = 0;

        do {

          System.out.println("Enter the Sneder");
            int sender = sc.nextInt();


            System.out.println("Enter the Reciever");
            int Reciever = sc.nextInt();


            System.out.println("Enter the Data");
            int data = sc.nextInt();

            int token =0;

            System.out.println("Token Passing:");
 
            for(int i=token;i<token;i++)
            {

                System.out.print(" "+i+"->");
                
            }

            System.out.println(sender);
            System.out.println("Sender: "+sender+" Sending Data: "+data);

            for(int i =sender; i!=Reciever5; i=(i+1)%n){

                System.out.println("Data: "+data+" Sended By "+sender);

            }

            System.out.println("Reciever: " +Reciever+" Recieves the data "+data);
        
            token = sender;

System.out.println("Do You Want continue, if Yes = 1 No=0 ");
 choice = sc.nextInt();


        }

while(choice==1);

    }
    
}
