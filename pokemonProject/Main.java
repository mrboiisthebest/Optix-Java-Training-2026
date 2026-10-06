package pokemonProject;

public class Main {
    public static void main(String[] args){
        Charmander charchar = new Charmander("CharChar", "Fire", 100, 10);
        Bulbasour bulby = new Bulbasour("Bulby", "Water", 90, 12);

        charchar.Debug();
        bulby.Debug();


        while (true){
            bulby.Attack(charchar);
            charchar.Attack(bulby);

            if (bulby.GetHP() <= 0 || charchar.GetHP() <= 0){
                break;
            }
        }

    }
}
