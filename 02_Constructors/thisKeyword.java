
public class thisKeyword {
    static class student{
        String name;
        int age;
        int rollNumber;
    
    student(String name,int age,int rollNumber){
        this.name=name;
        this.age=age;
        this.rollNumber=rollNumber;
    }
    student(){
    }
    public void print(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(rollNumber);
    }
    }
    public static void main(String[] args) {
        student s1=new student("Mohan",78,89);
        student s2=new student();
        student s3=new student("Ravi",34,56);
        s1.print();
        s2.print();
        s3.print();
    }
}
