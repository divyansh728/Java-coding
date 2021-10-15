import java.util.*;
;public class prime_java {
    public static void main(String args[])
    {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int in = sc.nextInt();
        for(int i = 1;i<=in;i++)
        {
            if(in%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
        sc.close();
    }
}
