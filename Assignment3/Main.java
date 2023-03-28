import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
abstract class GeometricObject{

}
class Triangle extends GeometricObject{
    private double side1;

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    private double side2;
    private double side3;
    private String color;
    private boolean filled;
    public double calculatePerimeter(){
        return side1+side2+side3;
    }
    public double calculateArea(){
        double s=(calculatePerimeter()/2);
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
        this.filled = filled;
    }
}
class GroceryList{
    private ArrayList<GroceryItemOrder> items = new ArrayList<GroceryItemOrder>();
    public GroceryList() {
    }
    public void add(GroceryItemOrder item){
        if(items.size()<10)
        items.add(item);
        size++;
    }
    public double getTotalCost(){
        double cost=0;
        for(GroceryItemOrder i:items){
            cost+=i.getCost();
        }
        return cost;
    }
    public String toString(){
        if(items==null||items.size()==0) return "Empty List";
        String s="";
        s+=String.format("%10s","Item Name") +"\t"+String.format("%8s","Quantity")+"\t"+String.format("%12s","Price / Unit")+"\t"+String.format("%4s","Cost")+"\n";
        for(GroceryItemOrder i:items){
            s+=String.format("%10s",i.getItemName()) +"\t"+String.format("%8s",i.getQuantity())+"\t"+String.format("%12s",i.getPricePerUnit())+"\t"+String.format("%4s",i.getCost())+"\n";
        }
        s+="Total: "+getTotalCost();
        return s;
    }
}
class GroceryItemOrder{
    private String itemName;
    private int quantity;
    private double pricePerUnit;

    public GroceryItemOrder(String itemName, int quantity, double pricePerUnit) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }
    public double getCost(){
        return quantity*pricePerUnit;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
}

public class Main {
    public static Integer max(ArrayList<Integer> list){
        if(list==null || list.size()==0) return 0;
        Integer max = list.get(0);
        for(Integer i:list){
            if(i>max)max=i;
        }
        return max;
    }
    public static void sort(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)>list.get(j)){
                    Integer temp = list.get(j);
                    list.set(j,list.get(i));
                    list.set(i,temp);

                }
            }
        }
    }
    //Q4 Main
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle(scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble(),scanner.next(),scanner.nextBoolean());
        System.out.println("Side1= " + triangle.getSide1()
        +"\nSide2 = "+triangle.getSide2()
        +"\nSide3 = "+triangle.getSide3()
        +"\nArea = "+triangle.calculateArea()
        +"\nPerimeter = "+triangle.calculatePerimeter()
        +"\nColor = "+triangle.getColor()
        +"\nFilled = "+triangle.isFilled());
    }*/
    //Q6 Main
    public static void main(String[] args){
        GroceryList list = new GroceryList();
        GroceryItemOrder a = new GroceryItemOrder("Cookies",4,2.3);
        GroceryItemOrder b = new GroceryItemOrder("Cheese",2,1.2);
        GroceryItemOrder c = new GroceryItemOrder("Apple",4,0.8);
        GroceryItemOrder d = new GroceryItemOrder("Bread",6,0.2);
        b.setQuantity(3);
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        System.out.println(list.toString());
    }
}