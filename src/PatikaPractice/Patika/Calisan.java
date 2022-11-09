package PatikaPractice.Patika;

public class Calisan {
    private String name;
    private int phone;
    private String eposta;

    public Calisan(String name, int phone, String eposta){
        this.name = name;
        this.phone = phone;
        this.eposta = eposta;

    }

    public void entry(){
        System.out.println("Giris yapildi");
    }

    public void exit(){
        System.out.println("Cikis yapildi");
    }

    public void diningHall(){
        System.out.println("Yemekhaneye giris yapildi");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }
}
