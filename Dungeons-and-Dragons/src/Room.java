import java.util.ArrayList;

public class Room extends Location {

    private String name;
    private ArrayList<Weapons> weapons;
    private ArrayList<Clothing> clothing;
    private ArrayList<Monster> monsters;
    private ArrayList<TownPeople> townsPeople;
    public Room() {
        weapons = new ArrayList<>();
        clothing = new ArrayList<>();
        monsters = new ArrayList<>();
        townsPeople = new ArrayList<>();
        setType("Room");
    }

    public Room(String name) {
        this.name = name;

        weapons = new ArrayList<>();
        clothing = new ArrayList<>();
        monsters = new ArrayList<>();
        townsPeople = new ArrayList<>();
        setType("Room");
    }

    public ArrayList<Weapons>  getWeapons() {
        return weapons;
    }

    public ArrayList<Clothing>  getClothing() {
        return clothing;
    }

    public ArrayList<Monster> getMonster(){
        return monsters;
    }

    public ArrayList<TownPeople> getTownPeople() {
        return townsPeople;
    }


    public void addMonster(Monster monster){
        monsters.add(monster);
    }

    public void addTownsPeople(TownPeople townPeople){
        townsPeople.add(townPeople);
    }

    public void addWeaponObject(Weapons item){
        weapons.add(item);
    }
    public void addClothingObject(Clothing item){
        clothing.add(item);
    }
    public void dropObject(Weapons item){
        weapons.remove(item);
    }
    public void dropObject(Clothing item){
        clothing.remove(item);
    }


    public void setWeapons(ArrayList<Weapons> weapons) {
        this.weapons = weapons;
    }
    public void setClothing(ArrayList<Clothing> clothing) {
        this.clothing = clothing;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String setLocationType() {
        return "Room";
    }


    public void viewRoomInventory(){
        if(weapons.size()==0){
            System.out.println("No Weapons in Room");
        }
        else {
            for(int i = 0 ; i < weapons.size(); i++)
                System.out.println(i + "  " + weapons.get(i));
        }
        System.out.println();

        if(clothing.size()==0){
            System.out.println("No Clothing in Room");
        }
        else {
            for(int i = 0 ; i < clothing.size(); i++)
                System.out.println(i + "  " + clothing.get(i));
        }
        System.out.println();
    }

    public void viewRoomContent() {
        System.out.println("Room Contents");
        System.out.println();


        if(monsters.size()==0){
            System.out.println("No Monster in Room");
        }
        else {
            for(int i = 0 ; i < monsters.size(); i++)
                System.out.println(i + "  " + monsters.get(i));
        }
        System.out.println();

        if(townsPeople.size()==0){
            System.out.println("No Townpeople in Room");
        }
        else {
            for(int i = 0 ; i < townsPeople.size(); i++)
                System.out.println(i + "  " + townsPeople.get(i));
        }
        System.out.println();

    }


    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", weapons=" + weapons +
                ", clothing=" + clothing +
                ", monsters=" + monsters +
                ", townsPeople=" + townsPeople +
                '}';
    }

    public Weapons getRoomWeapon(int takeWeapon) {
        Weapons w = weapons.get(takeWeapon);
        dropObject(w);
        return w;
    }
    public Clothing getRoomClothing(int takeClothing) {
        Clothing c = clothing.get(takeClothing);
        dropObject(c);
        return c;
    }
}
