
public class demoClass{
    static class Students {
        String name;
        int rollNumber;
        char section;
        String schoolName;

        void MarkAttendance() {
            System.out.println(name + " is present.");
        }

        void Print() {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Section: " + section);
            System.out.println("School: " + schoolName);
        }
    }

    public static void main(String[] args) {
        Students s1=new Students();
        Students s2=new Students();
        s1.name="Harry";
        s1.rollNumber=22;
        s1.section='A';
        s1.schoolName="ABC public School";
        s2.name="Raavi";
        s2.rollNumber=45;
        s2.section='B';
        s2.schoolName="ABC Public School";

        s1.MarkAttendance();
        s2.MarkAttendance();
        s1.Print();
        s2.Print();
    }
}
 