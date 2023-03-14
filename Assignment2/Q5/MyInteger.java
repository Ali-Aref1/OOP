package Q5;


public class MyInteger{
    private int n;
    public MyInteger(int a){
        n=a;
    }
    public boolean isEven(){
        if(n%2==0) return true;
        else return false;
    }
    public boolean isOdd(){
        return !isEven();
    }
    public boolean isPrime(){
        if(n<=1) return false;
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static boolean isEven(int n){
        if(n%2==0) return true;
        else return false;
    }
    public static boolean isOdd(int n){
        return !isEven(n);
    }
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public boolean equals(int a){
        if(n==a) return true;
        return false;
    }
    public boolean equals(MyInteger a){
        if(n==a.n) return true;
        return false;
    }
    

    
}
class Main{
    public static void main(String args[]){
        MyInteger a = new MyInteger(77171);
        System.out.println(a.isEven());
        System.out.println(a.isOdd());
        System.out.println(a.isPrime());
        System.out.println(MyInteger.isEven(77171));
        System.out.println(MyInteger.isOdd(77171));
        System.out.println(MyInteger.isPrime(77171));
        System.out.println(a.equals(77171));
        System.out.println(a.equals(92934));
        MyInteger b = new MyInteger(92934);
        System.out.println(a.equals(a));
        System.out.println(a.equals(b));
    }
    }