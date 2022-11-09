package PatikaPractice.inter;

public class BBankasi implements IBanka {
    private String bankaAdi;
    private String terminalId;
    private String password;

    public BBankasi(String bankaAdi,String terminalId,String password){
        this.bankaAdi = bankaAdi;
        this.terminalId = terminalId;
        this.password = password;
    }






    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean connect(String iPAddress) {
        System.out.println("Kullanici ip: " + iPAddress);
        System.out.println("Makina id: " + this.hostIpAddress);
        System.out.println(this.bankaAdi + "Baglanildi! ");
        return true;
    }

    @Override
    public boolean payment(double price, String cardnumber, String expireDate, String cvc) {
        // Banka odeme islemleri
        System.out.println("Bankadan veri bekleniyor !");
        System.out.println("Islem basarili oldu.");
        return true;
    }
}
