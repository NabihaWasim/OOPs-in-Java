public class callByreference {
    static class number{
        int x;
        int y;
        //constructor
        number(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    //java does not support call by reference so we have to pass the object and make changes inside
    //object then print object.
    static void addNum(number r){
        r.x=r.x+10;
        r.y=r.y+10;

    }
    //main class
    public static void main(String[] args) {
        number n1=new number(4,5);
        System.out.println(n1.x+","+n1.y);
        addNum(n1);
        System.out.println(n1.x+","+n1.y);
    }
    
}
