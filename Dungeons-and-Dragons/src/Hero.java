import java.util.ArrayList;

public class Hero {

    private Room location;
    private Room moveFrom;
    private String name;
    private int hitPoints;
    private int currentDamage;
    private ArrayList<Weapons> weapons;
    private ArrayList<Clothing> clothing;
    private ArrayList<Weapons> inventory1;
    private ArrayList<Clothing> inventory2;
    private Weapons weapon;
    private int gold;

    public Hero(Room location, Room moveFrom, Weapons weapon) {

        this.name = "";
        this.hitPoints = 100;
        this.currentDamage = weapon.getDamage() ;
        this.location = location;
        this.moveFrom = moveFrom;
        weapons = new ArrayList<>();
        clothing = new ArrayList<>();
        inventory1 = new ArrayList<Weapons>();
        inventory2 = new ArrayList<Clothing>();
    }

    public Hero(){
        location = null;
        moveFrom = null;
        this.gold = 0;
    }

    public ArrayList<Weapons>  getWeapons() {
        return weapons;
    }
    public ArrayList<Clothing>  getClothing() {
        return clothing;
    }

    public int getCurrentDamage() {
        return currentDamage;
    }

    public void setGold(int gold) {
        this.gold += gold;
    }

    public int getGold() {
        return gold;
    }

    public void block(){

        System.out.println(name + " blocks attack.");
    }

    public void setCurrentDamage(int currentDamage) {
        this.currentDamage = currentDamage;
    }

    public void take(Weapons item){
        inventory1.add(item);
    }

    public void drop(Weapons item){
        inventory1.remove(item);
    }

    public void viewWeaponInventory() {
        System.out.println("Weapon Inventory");
        System.out.println();
        if(inventory1.size()==0)
            System.out.println("No Item in Inventory");
        else {
            for(int i = 0 ; i < inventory1.size(); i++)
                System.out.println(i + "  " + inventory1.get(i));
        }
        System.out.println();
    }

    public void viewClothingInventory() {
        System.out.println("Clothing Inventory");
        System.out.println();
        if(inventory2.size()==0)
            System.out.println("No Item in Inventory");
        else {
            for(int i = 0 ; i < inventory2.size(); i++)
                System.out.println(i + "  " + inventory2.get(i));
        }
        System.out.println();
    }

    public Room getLocation() {
        return location;
    }
    public void setLocation(Room location) {
        this.location = location;
    }

    public Room getMoveFrom() {
        return moveFrom;
    }
    public void setMoveFrom(Room moveFrom) {
        this.moveFrom = moveFrom;
    }

    public void take(Clothing item){
        inventory2.add(item);
    }

    public void drop(Clothing item){
        inventory2.remove(item);
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

        System.out.println(name + " attacks. Hits Monster for " + currentDamage + " damage.");
    }

    public Weapons getWeaponsItem(int takeWeapons) {
        Weapons w = inventory1.get(takeWeapons);
        drop(w);
        return w;
    }

    public Clothing getClothingItem(int takeClothing) {
        Clothing c = inventory2.get(takeClothing);
        drop(c);
        return c;
    }

    @Override
    public String toString() {
        String playerInfo;
        playerInfo = "Name: " + name + ", Hit Points: " + hitPoints + " , Damage: " + currentDamage;
        return playerInfo;
    }
    public void saveTownspeople() {
        System.out.println(name + " saved the townspeople...");
    }
    public void deadTownspeople() {
        System.out.println(name + " failed to save the townspeople. Townspeople are dead.");
    }

}
