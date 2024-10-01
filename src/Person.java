

public class Person {
    
    public static final int SIZE_NAME=30;
    public static final int SIZE_CIUDAD=20;
    String name;
    int age;
    String ciudad;
    
    

    public int SIZE(){
        return ((SIZE_NAME*2)+4+(SIZE_CIUDAD*2));
    }

    
}
