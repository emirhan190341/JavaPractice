package PatikaPractice.Game;

public class ToolStore extends NormalLoc {
    public ToolStore(Player player) {
        super(player, "Magaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Magazaya hos geldiniz!");
        System.out.println("1-Silahlar");
        System.out.println("2-Zirhlar");
        System.out.println("3-Cikis yap");
        System.out.println("Seciminiz: ");
        int selectCase = input.nextInt();
        while (selectCase < 1 || selectCase > 3) {
            System.out.println("Gecersiz deger, tekrar giriniz");
            selectCase = input.nextInt();
        }
        switch (selectCase){
            case 1:
                printWeapon();
                buyWeapon();
                break;
            case 2:
                printArmor();
                break;
            case 3:
                System.out.println("Bir daha bekleriz!");
                return true;
        }

        return true;
    }

    public void printWeapon(){
        System.out.println("---------Silahlar---------");
        System.out.println();

        for(Weapon w : Weapon.weapons()){
            System.out.println(w.getId() + "-" +  w.getName() + "<Para :" + w.getPrice() + " , Hasar: " + w.getDamage() + ">");
        }



    }

    public void buyWeapon(){
        System.out.println("Bir silah secciniz: ");
        int selectWeaponID = input.nextInt();
        while (selectWeaponID < 1 || selectWeaponID > Weapon.weapons().length ) {
            System.out.println("Gecersiz deger, tekrar giriniz");
            selectWeaponID = input.nextInt();
        }
        Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponID);
        if ( selectedWeapon != null){
            if(selectedWeapon.getPrice() > this.getPlayer().getMoney()){
                System.out.println("Yeterli paraniz bulunmamaktadir.");
            }else{

                System.out.println(selectedWeapon.getName() + " silahini satin aldiniz!");
                int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Kalan paraniz: " + this.getPlayer().getMoney());

                System.out.println("Onceki silahiniz:" + this.getPlayer().getInventory().getWeapon().getName());
                this.getPlayer().getInventory().setWeapon(selectedWeapon);
                System.out.println("Yeni silahiniz:" + this.getPlayer().getInventory().getWeapon().getName());

            }

        }
    }



    public void printArmor(){
        System.out.println("Zirhlar");
        System.out.println();

    }

}
