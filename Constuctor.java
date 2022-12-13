class Student{
    String name;
    int age;
        public void Pernt(){
        System.out.println(this.name);
     System.out.println(this.age);
     } 
     Student(){
        System.out.println("print constructor");
        this.name=name;
        this.age=45;

     }
}
public class Constuctor {
    public static void main(String[] args) {
       Student st=new Student();
        st.Pernt();
    }    
}
