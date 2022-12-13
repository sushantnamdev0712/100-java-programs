class Student {

    int x,y;
    Student() {
 /// System.out.println(" firdstsdsdlkfhslkdhflksdhflk sdhflkshdflksh");
  this.x=x;
  this.y=y;
   }
    void show(){
        System.out.println(x);
        System.out.println(y);
    }
}
public class ParameterizedConst {
    public static void main(String[] args) {
        Student st=new Student(int);
        st.show();  
        Student st1=new Student(299,344);
        st1.show();
    }
}
