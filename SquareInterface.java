interface Square{
    int cal(int x);
}
public class SquareInterface {
    int a=5;
    Square s=(int x)->x*x;
    int ans=s.cal(a);
    System.out.println("The Sqaure of"+a+"is"+ans);
}
