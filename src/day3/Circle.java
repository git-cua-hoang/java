package day3;

public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void chuvi() {
        System.out.println("Chu vi hinh trong la "+2*Math.PI*radius);

    }

    static void chuVi2(Circle x){
        System.out.println("Chu vi cach 2 la "+2*Math.PI*x.radius);
    }
}
