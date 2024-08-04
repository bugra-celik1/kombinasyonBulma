import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n,r;
        double kombinasyon,x=1,y=1,z=1;
        Scanner scan = new Scanner(System.in);
        System.out.print("kombinasyonu alınacak n sayınısı giriniz:");
        n =scan.nextInt();
        System.out.print("kombinasyonu alınacak r sayınısı giriniz:");
        r =scan.nextInt();
        for(int i = 1;i<=n;i++){
            x *= i;
        }
        for(int i = 1;i<=r;i++){
            y *= i;
        }
        for(int i = 1;i<=(n-r);i++){
            z *= i;
        }

        kombinasyon = x / ( y * z);

        System.out.println("C(" + n +"," +r +") kombinasyonu:" +kombinasyon);

    }
}