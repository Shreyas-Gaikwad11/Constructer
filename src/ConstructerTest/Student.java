package ConstructerTest;

public class Student {
    int rollno;
    String sname;
    public Student(int rno, String name){
        rollno = rno;
        sname   = name;

    }

    public static void main(String[] args) {

        Student obj = new Student(11, "Shreyas");
        obj.printstudent();
    }
        void printstudent(){
            System.out.println("MY ROLL NO IS : "+rollno);
            System.out.println("MY NAME IS    : "+sname);
        }

}
