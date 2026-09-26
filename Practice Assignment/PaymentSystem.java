import java.util.*;

 public class PaymentSystem{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        double total =0;

        for(int i=0; i<n; i++){
            String type= sc.next();
            double amount= sc.nextDouble();
            double fee;

            if(type.equals("CARD"))
                fee =amount * 0.02;
            else if(type.equals("WALLET"))
                fee =amount *0.01;
            else{
                fee=0;
            }
        
        double finalAmount=amount + fee;
        System.out.printf("%s: %.2f%n",type, finalAmount);
        total +=finalAmount;
        }

        System.out.printf("Total: %.2f",total);
    }
}