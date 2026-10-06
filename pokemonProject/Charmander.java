package pokemonProject;

public class Charmander extends Pokemon {

// \\Constructers // \\

    Charmander(){
        super("Charmander", "Fire", 100, 10);
    }

    
    Charmander(String name, String type, double maxHp, double damage){
        super(name, type, maxHp, damage);
    }

// \\ Methods // \\

    // Main Attack Function
    @Override
    public void Attack(Pokemon target){
        // Check If Can Attack
        if (this.GetHP() <= 0){
            return;
        }

        // Send Attack
        System.out.println(this.name + " Is Attacking: " + target.name );
        if (!target.fainted){
             target.TakeDamage(this.GetDamage(), this.Type);
        }
    }
}
    
