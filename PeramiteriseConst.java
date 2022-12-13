class Student {
    int x,y;
    
    public void info()
    {
        System.out.println(x);
        System.out.println(y);
    }
    //===================================
 
}
public class PeramiteriseConst {
    public static void main(String[] args) {
        Student sr=new Student();
        sr.x=76;
        sr.y=65;
        sr.info();

    }
}
