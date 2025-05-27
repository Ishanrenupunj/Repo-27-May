public class Student{
    public int rollno;
    public String name;
    public int age;
    public String city;
    public int m1,m2,m3
    public int Average(){
        return (m1+m2+m3)/3;
    }
    public String grade(){
        if (Average()>60){
            return "A";
        }
        if (Average()<60){
            return "B";
        }
    }
}
class StudentTest{
    
    public static void main(String[] args) {
        Student s=new Student();
        s.city="Sundernagar";
        s.m1=80;
        s.m2=90;
        s.m3=89;
        System.out.println("The student lives in "+ s.city);
        System.out.println("Average is "+s.Average());
        System.out.println("Grade is"+s.grade());

    

    }
}