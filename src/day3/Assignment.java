package day3;

import java.util.Random;

public class Assignment {
//    họ đệm tên, địa chỉ, email, số điện thoại, mã sinh viên(cả chữ và số, ví dụ B22DCCN175).
    private String name;
    private String address;
    private String email;
    private String phone;
    private String studentID;

//    các hàm tạo có và không có tham số, các phương thức get/set.
    //Cóonstructor 1: no parameter
    Assignment(){
    }
    //Constructor 2: có parameter
    Assignment(String name, String address, String email, String phone){
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
//        this.studentID = studentID;
    }
    //setter
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
//    public void setID(String studentID){
//        this.studentID = studentID;
//    }
    //getter
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getEmail(){
        return email;
    }
    public String getPhone(){
        return phone;
    }
    public String getStudentID(){
        return studentID;
    }
    //dynamic
    public void showIn4(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
//        System.out.println("Email: "+email);
//        System.out.println("Phone: "+phone);
//        System.out.println("ID: "+studentID);
    }
    //static
    public static void showInfor(Assignment x){
        System.out.println("Name: "+x.name);
        System.out.println("Address: "+x.address);
//        System.out.println("Email: "+x.email);
//        System.out.println("Phone: "+x.phone);
//        System.out.println("ID: "+x.studentID);
    }
    public void genStudentID(){
        Random random = new Random();

        // Sinh số ngẫu nhiên từ 100 đến 999
        int randomNumber = 100 + random.nextInt(900);
        this.studentID = "ID-"+randomNumber;
    }

}
