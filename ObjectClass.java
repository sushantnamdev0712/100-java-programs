class Pen{
   String color;
    String type;
    public void print(){
        System.out.println(color);
        System.out.println(type);
    }
}
/*class Student{
    public void print2(){
        System.out.println(color);
    }
}*/
public class ObjectClass {
    public static void main(String[] args) {
        Pen pen1=new Pen();
        pen1.color="blue";
        pen1.type="gel";
        //pen1.print();
        Pen pen2=new Pen();
        pen2.color="black";
        pen2.type="djfgh";
        pen1.print();
        pen2.print();
    }
}
