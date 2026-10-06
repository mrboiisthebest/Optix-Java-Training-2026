package pokemonProject;


abstract public class Pokemon {
    // \\ Class Values // \\

    public String name;
    public String Type;
    private double maxHp;
    private double hp;
    private double damage;
    public boolean fainted;

    final String[][] Rivals = {
        {"Water", "Fire"},
        {"Earth", "Grass"},
    };

    Pokemon(){
        // Defaults
        this.name = "generic_pokemon";
        this.Type = "water";
        this.maxHp = 100;
        this.hp = this.maxHp;
        this.fainted = false;
    }

    Pokemon(String name, String type, double maxHp, double damage){
        // Defaults
        this.name = name;
        this.Type = type;
        this.maxHp = maxHp;
        this.hp = this.maxHp;
        this.damage = damage;
        this.fainted = false;
    }

    // \\ Class Getters // \\

    public double GetHP(){
        return this.hp;
    }

    public double GetMaxHP(){
        return this.maxHp;
    }

    public double GetDamage(){
        return this.damage;
    }

    //prints out values
    public void Debug(){
        System.out.println(this.name + this.Type + this.maxHp + this.hp + this.fainted + this.damage);
    }
    // \\ Helper Methods // \\


    // Used to see if a type is a rival of another
    private boolean isRival(String target){
        for (String[] match : Rivals){
            for (String type : match){
                if (type == this.Type){
                    for (String type2 : match){
                        if (type2 == this.Type){
                            continue;
                        }
                        if (type2 == target){
                            return true;
                        }
                    }
                    return false;
                }
            }
        }

        return false;
    }

    // \\ Class Methods // \\

    public void TakeDamage(double damage, String damgeType){
        // Make Sure Damage Is Valid
        if (damage <= 0){
            System.out.println("Invalid Damage Number!");
            return;
        }

        // Take Damage
        if (this.hp > 0){
            if (isRival(damgeType)){
                damage *= 1.2;
                damage = Math.floor(damage);
                System.out.println("Damage Amplified!");
            }

            this.hp -= damage;

            // this will print negative numbers but true values will stayabove or 0
            System.out.println(this.name + " Took " + damage + " damage!");
            System.out.println("HP:" + this.hp);
        }

        // Dont allow hp to drop below 0
        if (this.hp < 0) {
            this.hp = 0;
            this.fainted = true;
            System.out.println(this.name + " Fainted!");

        } else {
            // redundent check in case fainted is triggerded falsley
            this.fainted = false;
        }
    }

    abstract void Attack(Pokemon target);
}


