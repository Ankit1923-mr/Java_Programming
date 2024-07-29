import java.util.Scanner;


public class armstrong {

    public static void main(String args[]){
        int n1;
        int n2;
        String buff;
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter First Number: ");
        n1=scn.nextInt();
        System.out.println("Enter the second Number: ");
        n2=scn.nextInt();
        
        // System.out.println(buff.length());
        System.out.println("Armstrong Numbers between "+n1+" and  "+n2+" are: ");
        for(int i=n1;i<=n2;i++){
            buff=Integer.toString(i);
            int arm=0;
            int d=i;
            for(int j=0;j<buff.length();j++){
                int k=d%10;
                // System.out.println(k);
                arm+=(int)Math.pow(k,buff.length());
                d=d/10;
                // System.out.println(arm);
            }
            if (arm==i){
                System.out.println(i);
            }
        }

    }
}
