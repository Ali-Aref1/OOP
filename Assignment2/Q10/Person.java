package Q10;
class Person {
    protected String name;
    private String address;
    private int phone;
    private String email;
    public String toString(){return "Person: "+name;}
}
class Student extends Person{
    private final String status="";
    public String toString(){return "Student: "+name;}
}
class Employee extends Person{
    private int office;
    private double salary;
    private java.util.Date dateHired;
    public String toString(){return "Employee: "+name;}
}
class Faculty extends Employee{
    private String hours;
    private String rank;
    public String toString(){return "Faculty: "+name;}
}
class Staff extends Employee{
    private String title;
    public String toString(){return "Staff: "+name;}
}
class Main{
    public static void main(String args[]){
        Person P1=new Person();
        Student P2=new Student();
        Employee P3=new Employee();
        Faculty P4=new Faculty();
        Staff P5=new Staff();
        Person[] people= {P1,P2,P3,P4,P5};
        for(Person P:people){
            System.out.println(P.toString());
        }
    }
}
