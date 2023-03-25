public class SampleClass {

    int a=5;
    int b=6;
    final int K = 10;

    public  SampleClass(){
        System.out.println("This is a default constructor, and an object has been instantiated");
    }

    public SampleClass(int u, int v){
        System.out.println(u+v);
    }

    //default constructor
    //parametrized constructor

    public int sum(int c,int d){
        System.out.println(c+d);
         return c+d;
    }
}
