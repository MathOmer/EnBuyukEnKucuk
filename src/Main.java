import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int Number,n;
        int max=1,min=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        Number = input.nextInt();

        for(int i=1;i<=Number;i++){
            Scanner scan = new Scanner(System.in);
            System.out.print(i+".sayıyı giriniz: ");
            n = scan.nextInt();

            if( i == 1){
                max = n;
                min = n;
            }else if (n>max){
                max = n;
            }else if(n<max){
                min = n;
            }

        }   System.out.println("En büyük sayı: "+max);
            System.out.println("En küçük sayı:" +min);

    }
}