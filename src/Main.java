import java.util.Scanner;
public class Main{
    public static void main(String[]args) throws InterruptedException {
        Scanner scanner=new Scanner(System.in);

        int countDown;

        System.out.println("ENTER THE NO OF SECONDS YOU WANT TO COUNTDOWN FROM:");
        countDown=scanner.nextInt();

        for(int i=countDown;i>0;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("HAPPY BIRTHDAY");

    }

}

