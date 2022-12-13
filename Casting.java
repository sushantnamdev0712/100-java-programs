class Casting{
    public static void main(String[] args) {
        // Impicit Casting (wideing)
        double price=100.00;
        double Fp=price+18;
        System.out.println(Fp);
        
        //explicit casting(narrowing)
        int p=100;
       // int firstp=p+18.00;===error
        int firstp=p+(int)18.00;
        System.out.println(firstp);

    }
}