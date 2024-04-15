package javh5;

public class JPA506 {
    public static void main(String[] args) {
        System.out.println("圓形面積為: "+calCricle(5));
        System.out.println("三角形面積為: "+calTriangle(10,5));
        System.out.println("長方形面積為: "+calRectangle(5,10));
        double all = calCricle(5)+calTriangle(10,5)+calRectangle(5,10);
        System.out.println("此圖形面積為: "+all);
    }
    public static double calCricle(int a) {
        double PI = 3.1415926,sum=a*a*PI;
        return sum;
    }
    public static double calTriangle(int a,int b) {
        double sum=a*b/2;
        return sum;
    }
    public static int calRectangle(int a,int b) {
        int sum=a*b;
        return sum;
    }
}
