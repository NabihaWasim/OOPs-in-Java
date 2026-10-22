

public class constructorOverload {
    //constructor class with properties
    static class Constructor{
        String name;
        int age;
        int rollNumber;
        //constructor with parameter
        Constructor(String n,int a,int rn){
            name=n;
            age=a;
            rollNumber=rn;
        }
        //constructor overload
        //default empty construtor
        Constructor(){
        }
        //behaviour of the class
        public void print(){
            System.out.println("Name :"+name);
            System.out.println("Age :"+age);
            System.out.println("Roll Number:"+rollNumber);
        }
    }
    //main class
    public static void main(String[] args) {
        Constructor d1=new Constructor("Ali",89,67);
        d1.print();
        Constructor d2=new Constructor();
        d2.print();
    }
    
}
