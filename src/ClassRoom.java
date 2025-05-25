public class ClassRoom {
    //ten si so, thong tin cua student
    String name;
    int noOfStud;
    Student[] students;
    //viet constructor
    ClassRoom(String name, int noOfStud) {
        this.name = name;
        this.noOfStud = noOfStud;
        this.students = new Student[noOfStud];
    }
    //viet ham them hoc sinh - them ten, tuoi
    public void addNewStudent( Student[] student ){
        students = student;
    }

    void addStudent(Student student) {
        for(int  i = 0; i < noOfStud; i++) {
            if(students[i] == null) {
                students[i] = student;
                return;
            }
        }
    }

    //viet ham in ra danh sach hoc sinh
    public void printStudent(){
        for(int i =0;i<noOfStud;i++){
            System.out.println("the "+i+"th student is "+students[i].name+", "+students[i].age+" years old.");
        }
    }
}
