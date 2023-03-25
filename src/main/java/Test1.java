public class Test1 {

    public static void main(String[] args) {
        InterfaceTest a = new PrintAwayMessage();
        a.printMessage();

        SampleClass sampleClass = new SampleClass();
         int c =sampleClass.sum(5,10);
       // System.out.println(sum);

        SampleClass sampleClass1 = new SampleClass(77,88);



        try{
            int k = 10/5;
        }catch(Exception e){
            System.out.println("Exception occured, pls correct");
        }finally {
            System.out.println("executred the code");
        }
    }

}
