package PatikaPractice.inter;

public interface IBanka {

    final String hostIpAddress = "127.0.0.1"; // final keywordu hicbir sekilde degistirilemeyen sabitler icin kullanilir. Interfacelerde sadece deger verilerek tanim yapilir.



    boolean connect(String idAddress); //interfacelerde method yazarken suslu parantez seklinde kullanim yapilamaz.
    boolean payment(double price,String cardnumber,String expireDate,String cvc);


}
