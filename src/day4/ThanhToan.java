package day4;

public interface ThanhToan {
    public void traTien(int soTien);
    public default void quitTien(String ten){
        System.out.println("dm thang "+ten+" di an deo tra tien");
    }
}
