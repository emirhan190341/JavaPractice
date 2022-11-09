package PatikaPractice.Patika;

public class Prelector extends Academist{
    private String doorNumber;

    public Prelector (String name, int phone, String eposta, String department,String title,String doorNumber){
        super(name,phone,eposta,department,title);
        this.doorNumber = doorNumber;

    }

    public String getDoorNumber(){
        return doorNumber;

    }

    public void setDoorNumber(String doorNumber){
        this.doorNumber = doorNumber;
    }

}
