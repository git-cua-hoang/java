package day4;

public class Xe {
    String hang;
    String mau;

    public Xe(String hang, String mau){
            this.hang= hang;
            this.mau = mau;
    }


    public void chay() {
        System.out.println("Xe "+hang+ " mau "+mau+" dang chay!");
    }
}
