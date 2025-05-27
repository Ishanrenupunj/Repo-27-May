class Student{
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