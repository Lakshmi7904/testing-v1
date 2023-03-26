public class VowelsIndCount {

    public static void main(String[] args){

 String str = "ravikiran";
 int countA=0,countE = 0, countI = 0, countO = 0, countU = 0;
    for(int i=0;i<str.length();i++){
    char c = str.charAt(i);
    if(c== 'a'){
        countA++;
    }else if (c== 'e'){
        countE++;
    }
    else if (c=='i'){
        countI++;
    }
    else if(c=='o'){
        countO++;

    }
    else if(c=='u'){
        countU++;
    }
}
        System.out.println("a: " + countA);
        System.out.println("e: " + countE);
        System.out.println("i: " + countI);
        System.out.println("o: " + countO);
        System.out.println("u: " + countU);
    }
}
