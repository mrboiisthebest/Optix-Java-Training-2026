package pokemonProject;

public class Bulbasour extends Pokemon {

    // \\Constructers // \\

    Bulbasour(){
        super("Bulbasour", "Water", 90, 12);
    }

    Bulbasour(String name, String type, double maxHp, double damage){
        super(name, type, maxHp, damage);
    }

    // \\Methods // \\

    @Override
    public void Attack(Pokemon target){
        if (this.GetHP() <= 0){
            return;
        }

        System.out.println("Attacking...");
        if (!target.fainted){
             target.TakeDamage(this.GetDamage(), this.Type);
        }
    }
}
    
