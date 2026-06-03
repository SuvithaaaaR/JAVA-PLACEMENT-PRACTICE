class Student {
    String name;
    int age;
    Student(){
  name="zayn";
  age=22;
    }

    Student(String name,int age){
 this.name=name;
 this.age=age;
    }
    Student(Student s){
        this.name=s.name;
        this.age=s.age;
    }
    // Student() {
    //     this("Suvitha");
    //     System.out.println("Default");
    // }

    Student(String name) {
        System.out.println(name);
    }
    void display(){
        System.out.println(name+" ' "+age);
    }
} 
public class Constructor{ 
public static void main(String [] args){

Student s1= new Student("Tara",22);
Student s2=new Student();
Student s3 = new Student("Kowshi",50);
Student s4= new Student(s2);
s1.display();
s2.display();
s3.display();
s4.display();
}
}