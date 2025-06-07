package day4;

public class XeDien extends Xe{
    private String pin;
    public XeDien(String hang, String mau, String pin){
        super(hang, mau);
        this.pin = pin;
    }

    @Override
    public void chay(){
        System.out.println("xe dien vinfast cua vuong mat loz dang chay");
    }

    public void sacPin(){
        System.out.println("Sac cmn pin"+pin);
    }
}
