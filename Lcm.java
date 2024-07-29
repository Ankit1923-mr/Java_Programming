import java.util.Scanner;
public class Lcm {
    public static int gcd(int n1,int n2){
        int diff=0;
        while(n1%n2!=0){
            diff=n1%n2;
            n1=n2;
            n2=diff;
        }
        return n2;
    }
    public static void main(String[] args) {
        int n1;
        int n2;
        int max,min;
        int lcm;
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        n1=scn.nextInt();
        System.out.println("Enter 2nd number: ");
        n2=scn.nextInt();
        max=Math.max(n1,n2);
        min=Math.min(n1,n2);

        lcm=(n1*n2)/gcd(max, min);

        System.out.println("The Lcm of "+n1+" and "+n2+" is: "+lcm);
     

    }
}
