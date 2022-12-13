public class CopyConstructorVScode {
    int x;
    int y;
    CopyConstructorVScode(int x,int y){
        this.x=x;
        this.y=y;
    }void show(){
        System.out.println(x);
        System.out.println(y);
    }
    CopyConstructorVScode(CopyConstructorVScode z){
        this.x=z.x;
        this.y=z.y;
    }
    
public static void main(String[] args) {
    CopyConstructorVScode cp=new CopyConstructorVScode(10,20);
    cp.show();
    CopyConstructorVScode pc=new CopyConstructorVScode(cp);
    pc.show();
}    
}
