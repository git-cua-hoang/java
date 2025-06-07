package day4;

public class XeXang extends Xe{
    String binhXang;
    public XeXang(String hang, String mau, String binhXang){
        super(hang, mau);
        this.binhXang = binhXang;
    }

    public void doXang(){
        System.out.println("do xang "+binhXang+" lit.");
    }

}
