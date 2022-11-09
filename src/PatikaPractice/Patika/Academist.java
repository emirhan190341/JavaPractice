package PatikaPractice.Patika;

public class Academist extends Calisan {
    private String department;
    private String title;




    public Academist(String name, int phone, String eposta, String department,String title){
        super(name, phone,eposta);
        this.department = department;
        this.title  = title;


    }
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
