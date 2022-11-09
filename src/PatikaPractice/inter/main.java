package PatikaPractice.inter;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Tutar giriniz: ");
        double price = input.nextDouble();

        System.out.println("Kart no  giriniz: ");
        String cardNumber = input.next();

        System.out.println("Son kullanim tarihi giriniz: ");
        String  expireDate = input.next();

        System.out.println("Guvenlik kodu giriniz: ");
        String cvc= input.next();

        System.out.println("1. A Bankasi");
        System.out.println("2. B Bankasi");
        System.out.println("3. C Bankasi");
        System.out.println("Banka seciniz: ");
        int selectBank = input.nextInt();

        switch (selectBank){
            case 1:
                ABankasi aPos = new ABankasi("A bankasi","1234513241","12412412");
                aPos.connect("127.1.1.1");
                aPos.payment(price, cardNumber,expireDate,cvc);

                break;
            case 2:
                BBankasi bPos = new BBankasi("B bankasi","1234513241","12412412");
                bPos.connect("asdasda");
                bPos.payment(price,cardNumber,expireDate,cvc);
                break;
            default:
                System.out.println("Gecerli banka giriniz.");
        }

    }
}
