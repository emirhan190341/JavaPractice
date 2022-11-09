package PatikaPractice.Patika;

public class Officer extends Calisan {
    private String departmant;
    private String watch;

    public Officer(String name, int phone, String eposta,String departmant,String watch){
        super(name,phone,eposta);
        this.departmant = departmant;
        this.watch = watch;

    }

    public String getDepartmant(){
        return departmant;
    }

    public void setDepartmant(String departmant){
        this.departmant = departmant;
    }

    public String getWatch(){
        return watch;
    }

    public void setWatch(String watch){
        this.watch = watch;

    }

    public void work(){
        System.out.println(this.getName() + " officer has started to work");
    }

}
