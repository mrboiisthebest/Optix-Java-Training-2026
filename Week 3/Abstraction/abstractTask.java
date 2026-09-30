public class abstractTask {
    public static void main(String[] args){
        T_Shirt myShirt = new T_Shirt("Green", "XS", 9.99);
        System.out.println(myShirt.GetDescription());

        Jacket myJacket = new Jacket("Black", 69.99, "Guccie");
        System.out.println(myJacket.GetDescription());


    }
}

abstract class Shirt{
    String color;

    Shirt(String color){
        this.color = color;
    }

    public String GetColor(){
        return this.color;
    }

    abstract String GetDescription();
}

class T_Shirt extends Shirt{
    String size;
    double cost;

    T_Shirt(String color, String size, double cost){
        super(color);
        this.size = size;
        this.cost = cost;
    }

    @Override
    String GetDescription(){
        return this.size + ", " + this.color + ", "+ this.cost;
    }
}

class Jacket extends Shirt{
    double price;
    String brand;

    Jacket(String color, double price, String brand){
        super(color);
        this.price = price;
        this.brand = brand;
    }

    @Override
    String GetDescription(){
        return this.price + ", " + this.brand + ", "+ this.color;
    }
}
