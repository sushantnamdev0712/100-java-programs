import java.nio.channels.ClosedSelectorException;

class Loop {
    /**
     * @param args
     */
    public static void main(String[] args) {
        /*/====================================
        //for Loop
        for(int i=1;i<=100;i++){
        System.out.println(i);}
        for(int j=100;j>=1;j--){
            System.out.println(j);
    //}
    //=======================================
    //while Loop
    int k=100;
    while(k>=1){
        System.out.println(k);
        k--;
    }
    //============================
    //do while Loop
    int o=100;
    do{
        System.out.println(o);
        o--;
    }while(o>=1);*/
    //===============================
    // break & continue
    int i=0;
    while(true){
        if(i==3){
            i=i+1;
            continue;
        }
        System.out.println(i);
        i=i+1;
        if(i>5){
            break;
        }
    }
    }

}
