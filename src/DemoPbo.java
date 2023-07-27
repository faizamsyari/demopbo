
// Akses private tidak akan diwariskan
// Encapsulation : private, protected, dan public (Diberikan pada atribute / method)
// override / overriding (Decorator)

class Parent {
    public int x ;
    int p = 2;
    int y;
    private int z;
  
    void print () {
        System.out.println("Print Parent");
        System.out.println(p);
    }

    void print (String nama, String nim ) {
        System.out.println(nama);
        System.out.println(nim);
    }
    void print (String nama, int umur) {
        System.out.println("Print");
        System.out.println(p);
    }
    void print (String umur,String nama, String nim) {
        System.out.println(nama + " " + nim + " " +umur);
        // System.out.println(p);
    }
    
}


class A extends Parent {
    // @Override
    // void print(){
    //     System.out.println("Print A");
    // }
    // int p = 3;
    // void coba (){
    //     System.out.println(x);
    // }
    @Override
    void print() {
        System.out.println("Print A");
        System.out.println(p);
        // System.out.println(z); -> Akan Error karena int z diberi modifier private
    }
    
  
}

class B extends A {
   void print() {
        System.out.println("Print B");
        System.out.println("INI DARI CLASS B:" + p );
   }
}


abstract class Peminjaman {
    void denda() {
    }
    void pengembalian(){}
}

class PBO extends Peminjaman {
    @Override
    void denda(){
        System.out.println("DENDA PBO");
    }
}

public class DemoPbo extends Parent {

    // void print(){
    //     // System.out.println(x);// x error karena x diberi modifier private di class yang berbeda
    //     System.out.println(y);// y merupakan warisan dari class parent 
    //     System.out.println(z);// z merupakan warisan dari class parent 
       
    // }

    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Parent parent = new Parent();
        parent.print();
        parent.print("20", "Faiz Amsyari", "1102210012");
        parent.print("Faiz Amsyari Rustam", "1102210012");
        parent.print("Faiz", 20);

        A a = new A();
        a.print();;
        // a.coba();
        
        B b = new B();
        b.print();

        PBO pbo = new PBO();
        pbo.denda();
        //Peminjaman peminjaman = new Peminjaman(); ->Error karena abstract class tidak bisa dibuat objeknya
    }
}


