package javh5;
public class JPA505 {
    public static void main(String[] args) {
        System.out.println(add(2,3)+" "+add(5.2,4.3)+" "+add("I Love ","Java"));
    }
    public static int add(int i,int j) {
        System.out.println("Addind two Interger: "+i+" ,"+j);
        return i+j;
    }
    public static double add(double i,double j) {
        System.out.println("Addind two Double: "+i+" ,"+j);
        return i+j;
    }
    public static String add(String i,String j){
        System.out.println("Addind two String: "+i+","+j);
        return i+j;
    }
}
