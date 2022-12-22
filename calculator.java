import java.util.Scanner;

/**
 * q
 */
public class q {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int a,b,c,d;
        System.out.println("Birinci sayi :");
        Scanner scn= new Scanner(System.in);
        a=scn.nextInt();
        System.out.println("ikinci sayi : ");
        b=scn.nextInt();

        System.out.println("toplama için 1,\nçikarma işlemi için 2,\nçarpma işlemi için 3,\nbölme işlemi için 4 e basin.");
        c=scn.nextInt();

        switch (c) {
            case 1:
                d=a+b;
                System.out.println("Sonuç : "+d);
                break;
            case 2:
                d=a-b;
                System.out.println("Sonuç : "+d);
                break;
            case 3:
                d=a*b;
                System.out.println("Sonuç : "+d);
                break;
            case 4:
                d=a/b;
                System.out.println("Sonuç : "+d);
                break;
            default:
                System.out.println("yanliş değer girdiniz");
                break;
        }

        
       
    }
}