public class classTask {
    public static void main(String[] args){
        Me myself = new Me("Joe", 87);
        System.out.println(myself.name + ", " + myself.age);
    }
}

class Me{
    String name;
    int age;


    public Me(String name, int age){
        this.name = name;
        this.age = age;
    }
}
