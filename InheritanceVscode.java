
class Shape{
    String color;

}
class Triangle extends Shape{
    void show(){
        System.out.println(color);
    }
}
public class InheritanceVscode  {
    public static void main(String[] args) {
    Triangle ti=new Triangle();
    ti.color="blue";    
    ti.show();
    }
}
