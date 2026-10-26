public class callByValue {
    public static void main(String[] args) {
        int x=4;
        int y=10;
        System.out.println(x+","+y);
        addNum(x,y);
        System.out.println(x+","+y);
    }
    //values will not channge because java does not support Call by reference.
    public static void addNum(int a,int b){
        a=a+10;
        b=b+10;  
    } 
}

