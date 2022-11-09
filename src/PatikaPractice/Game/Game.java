package PatikaPractice.Game;

import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);


    public void start() {
        System.out.println("Macera oyununa hos geldiniz...");
        System.out.println("Lutfen bir isim giriniz: ");
        //String playerName = input.nextLine();

        Player player = new Player("Emirhan");
        System.out.println(player.getName() + " Hos geldiniz!");
        System.out.println("Lutfen bir karakter seciniz");
        player.selectChar();

        Location location = null;
        while (true) {
            player.printInfo();
            System.out.println();
            System.out.println("#############Bolgeler#########");
            System.out.println();
            System.out.println("Bolgeler");
            System.out.println("1- Guvenli Ev");
            System.out.println("2-Magaza");
            System.out.println("Lutfen gitmek istediginiz bolgeyi seciniz:");
            int selectLoc = input.nextInt();
            switch (selectLoc) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }

            if (!location.onLocation()){
                System.out.println("GAME OVER");
                break;
            }


        }
    }
}