package PatikaPractice.GenericYapilar;

public class Main {
    public static void main(String[] args) {

//        Integer a = 12;
//        String str = "abc";
//        GenericYapilar<String> n = new GenericYapilar<String>(str);
//        n.run();
//

        Integer a = 10;
        String b = "patika";
        Double d = 3.14;

        Test<Integer,String,Double> t = new Test(a,b,d);
        t.showInfo();

    }
}
