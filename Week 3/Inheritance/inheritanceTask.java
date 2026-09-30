public class inheritanceTask{
    public static void main(String[] args){
        Child timmy = new Child("Timmy", "Timothy", "Blue");
        System.out.println(timmy.GetFullName());
        System.out.println(timmy.GetEyeColor());
    }
}



abstract class Parent{
    private String last_name;
    private String eye_color;

    public Parent(String last_name, String eye_color){
        this.last_name = last_name;
        this.eye_color = eye_color;
    }

    public String GetLastName(){
        return this.last_name;
    }

    public String GetEyeColor(){
        return this.eye_color;
    }
}

class Child extends Parent{
    private String first_name;

    public Child(String first_name, String last_name, String eye_color){
        super(last_name, eye_color);
        this.first_name = first_name;
    }

    public String GetFullName(){
        String last_name = this.GetLastName();
        return this.first_name + " " + last_name;

    }
}