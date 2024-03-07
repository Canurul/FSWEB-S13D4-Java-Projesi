
public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon){
        this.name = name;
        this.weapon = weapon;
        if(healthPercentage>100){
            this.healthPercentage = 100;
        } else if (healthPercentage<0){

            this.healthPercentage = 0;
        }else{
            this.healthPercentage = healthPercentage;
        }
    }

    public String getName() {
        return name;
    }

    public int getHealthPercentage() {
        return healthPercentage;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealthPercentage(int healthPercentage) {
        this.healthPercentage = healthPercentage;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public int healthRemaining(){

        return this.healthPercentage;
    }
    public void loseHealth(int damage){

    }
}
