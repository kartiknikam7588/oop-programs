

class calculator {

int add(int a,int b) {
    return a+b;
}
int add(int a,int b,int c){
    return a + b +c;
}
double add(double a,double b){
    return  a + b;
}
}
class Student {
    String name;
    int age;
    Student(){
        name = "chaitanya";
        age = 40;
    }
    Student(String n,int a){
        name = n;
        age =a;
    }
    Student(Student s){
        this.name =s.name;
        this.age=s.age;
    }
    void display(){
        System.out.println("Name:"+name+",age:"+age);
    }
    Student getStudent(){
        return this;
    }
    
}
public class functionDemo {
     public static void main(String[] args){
        calculator calc =new calculator();
        System.out.println("Add two intergers:"+calc.add(6,19));
        System.out.println("Add three intergers:"+calc.add(3,4,6));
        System.out.println("Add two double:"+calc.add(4.5,5.5));
        Student s1 = new Student();
        Student s2 = new Student("ram",21);
         Student s3 = new Student(s2);

         s1.display();
         s2.display();
         s3.display();
         Student s4 = s2.getStudent();
         System.out.println("Student s4 details(referance to s2):");
         s4.display();
     }

    


         
         

         



        





     }
 

