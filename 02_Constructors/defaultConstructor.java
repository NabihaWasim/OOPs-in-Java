

public class defaultConstructor {
    static class Constructor{
        String name;
        int age;
        int rollNumber;
        Constructor(){
            name="varun";
            age=45;
            rollNumber=34;
        }
        public void print(){
            System.out.println("Name :"+name);
            System.out.println("Age :"+age);
            System.out.println("Roll Number:"+rollNumber);
        }
    }
    public static void main(String[] args) {
        Constructor d1=new Constructor();
        d1.print();
    }
}
 
    

