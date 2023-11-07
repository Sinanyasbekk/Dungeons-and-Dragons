import java.util.ArrayList;
import java.util.Random;

public class Monster {
    private String name;
    private int hitPoints;
    private int currentDamage;
    private ArrayList<Weapons> weapons;
    private ArrayList<Clothing> clothing;
    private int goldDrop;

    public Monster(String name, int hitPoints, int currentDamage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.currentDamage = currentDamage;
        weapons = new ArrayList<>();
        clothing = new ArrayList<>();
    }

    public Monster(){

    }
    public ArrayList<Weapons>  getWeapons() {
        return weapons;
    }
    public ArrayList<Clothing>  getClothing() {
        return clothing;
    }

    public void addObject(Weapons item){
        weapons.add(item);
    }
    public void addObject(Clothing item){
        clothing.add(item);
    }

    public void dropObject(Weapons item){
        weapons.remove(item);
    }
    public void dropObject(Clothing item){
        clothing.remove(item);
    }

    public int getCurrentDamage() {
        return currentDamage;
    }


    public void setCurrentDamage(int currentDamage) {
        this.currentDamage = currentDamage;
    }

    public void setGoldDrop() {
        Random rand = new Random();
        goldDrop = rand.nextInt(10) + 20;
    }


    public int getGoldDrop() {
        return goldDrop;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }



    public int getHitPoints() {
        return hitPoints;
    }


    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void attack() {

        System.out.println(name + " attacks.");
    }

    public void killTownspeople(){
        System.out.println(name + " kills Townspeople.");
    }

    @Override
    public String toString() {
        String monsterInfo;
        monsterInfo = "Name: " + name + ", Hit Points: " + hitPoints + " , Damage: " + currentDamage ;
        return monsterInfo;
    }
}
