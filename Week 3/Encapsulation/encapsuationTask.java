public class encapsuationTask {
    public static void main(String[] args){
        Information info = new Information("Joe", 18, "Male");
        Information info2 = new Information("Bob", 22, "Male");

        System.out.println(info.IsOver21());
        System.out.println(info2.IsOver21());
    }
}


class Information{
    private String name;
    private int age;
    private String gender;

    public Information(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String GetName(){
        return this.name;
    }

    public int GetAge(){
        return this.age;
    }

    public String GetGender(){
        return this.gender;
    }

    public boolean IsOver21(){
        return age > 21;
    }
}
