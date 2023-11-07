import java.util.HashMap;
import java.util.Scanner;

public class AdventureModel {
    private Room rooms[];
    private Weapons weapons[];
    private Hero hero;
    private Clothing clothing[];
    private Monster monsters[];
    private Lava lava[];
    private Water waters[];
    private TownPeople townsPeople[];


    public AdventureModel() {
    }
    public void map_layout(){
        weapons = new Weapons[9];
        clothing = new Clothing[12];
        rooms = new Room[12];
        monsters = new Monster[4];
        lava = new Lava[1];
        waters = new Water[1];
        townsPeople = new TownPeople[13];



        clothing[9] = new Clothing("Light Clothing", "Cotton",5,5);
        clothing[10] = new Clothing("Leather Armor", "Bear Fur",10,5);
        clothing[11] = new Clothing("Chainmail Armor", "Like a Warrior",15,5);

        weapons[0] = new Weapons("Dagger","The weakest sword.",1,1,5);
        weapons[1] = new Weapons("Short Sword","Balanced sword",3,3,10);
        weapons[2] = new Weapons("Long Sword", "+9 Full Moon",5,5,20);
        weapons[3] = new Weapons("Small Axes", "Made by using stone and wood.",2,2,8);
        weapons[4] = new Weapons("Axes", "Just made by Dwarfs",5,5,15);
        weapons[5] = new Weapons("Broad Axes", "Looks like crafted by Vikings.",12,11,25);
        weapons[6] = new Weapons("Short Bow", "Noob's bow",7,20,15);
        weapons[7] = new Weapons("Long Bow", "Balanced bow",10,25,25);
        weapons[8] = new Weapons("Composite Bow", "Made by Legolas",12,32,30);


        monsters[0] = new Monster("Rat",15,3);
        monsters[1] = new Monster("Goblin",30,7);
        monsters[2] = new Monster("Phoenix",1000,100);
        monsters[3] = new Monster("Skeleton Knight", 50, 10);

        townsPeople[0] = new TownPeople("Şehirli Berkecan",1);
        townsPeople[1] = new TownPeople("Villager Mehmet",1);
        townsPeople[2] = new TownPeople("Villager Mahmut",1);
        townsPeople[3] = new TownPeople("Villager Ahmet",1);
        townsPeople[4] = new TownPeople("Villager Osman",1);
        townsPeople[5] = new TownPeople("Villager Can",1);
        townsPeople[6] = new TownPeople("Şehirli Meriç",1);
        townsPeople[7] = new TownPeople("Şehirli Keremcem",1);
        townsPeople[8] = new TownPeople("Villager Bilal",1);
        townsPeople[9] = new TownPeople("Villager Tefo",1);
        townsPeople[10] = new TownPeople("Villager Süleyman",1);
        townsPeople[11] = new TownPeople("Villager Abuzer",1);




        rooms[0] = new Room("Room 1 You can go R4,R8 directly but not recommended.");
        rooms[0].addMonster(monsters[0]);
        rooms[0].addTownsPeople(townsPeople[0]);
        rooms[0].addWeaponObject(weapons[1]);
        rooms[0].addClothingObject(clothing[9]);

        rooms[1] = new Room("Room 2 You can go room 7 from here.");
        rooms[1].addWeaponObject(weapons[3]);
        rooms[1].addMonster(monsters[0]);
        rooms[1].addTownsPeople(townsPeople[1]);


        rooms[2] = new Room("Room 3 You can go Room 4 or Room 2 from here.");
        rooms[2].addWeaponObject(weapons[6]);
        rooms[2].addMonster(monsters[1]);
        rooms[2].addTownsPeople(townsPeople[2]);

        rooms[3] = new Room("Room 4 You can go Room 3 or Room 5 from here.");
        rooms[3].addWeaponObject(weapons[5]);
        rooms[3].addMonster(monsters[1]);
        rooms[3].addTownsPeople(townsPeople[3]);

        rooms[4] = new Room("Room 5 You can go Room 12 from here.");
        rooms[4].addWeaponObject(weapons[4]);
        rooms[4].addMonster(monsters[1]);
        rooms[4].addTownsPeople(townsPeople[4]);

        rooms[5] = new Room("Room 6 You can go Room 5 or Room 7 from here.");
        rooms[5].addWeaponObject(weapons[2]);
        rooms[5].addMonster(monsters[3]);
        rooms[5].addTownsPeople(townsPeople[5]);

        rooms[6] = new Room("Room 7 You can go Room 2 or Room 8 from here.");
        rooms[6].addWeaponObject(weapons[7]);
        rooms[6].addClothingObject(clothing[10]);
        rooms[6].addMonster(monsters[3]);
        rooms[6].addTownsPeople(townsPeople[6]);

        rooms[7] = new Room("Room 8 You can go Room 7 from here.");
        rooms[7].addWeaponObject(weapons[8]);
        rooms[7].addMonster(monsters[3]);
        rooms[7].addTownsPeople(townsPeople[7]);

        rooms[8] = new Room("Room 9 You can go Room 10 from here.");
        rooms[8].addWeaponObject(weapons[5]);
        rooms[8].addMonster(monsters[2]);
        rooms[8].addTownsPeople(townsPeople[8]);

        rooms[9] = new Room("Room 10 You can go Room 9 or Room 11 from here.");
        rooms[9].addMonster(monsters[2]);
        rooms[9].addTownsPeople(townsPeople[9]);

        rooms[10] = new Room("Room 11 You can go Room 10 or Room 12 from here.");
        rooms[10].addMonster(monsters[2]);
        rooms[10].addTownsPeople(townsPeople[10]);

        rooms[11] = new Room("Room 12 You can go Room 11 from here.");
        rooms[11].addWeaponObject(weapons[7]);
        rooms[11].addClothingObject(clothing[11]);
        rooms[11].addMonster(monsters[2]);
        rooms[11].addTownsPeople(townsPeople[11]);




        //maping rooms direction
        rooms[0].addDirection("R2", rooms[1]);

        rooms[1].addDirection("R1",rooms[0]);
        rooms[1].addDirection("R3",rooms[2]);
        rooms[1].addDirection("R7",rooms[6]);

        rooms[2].addDirection("R2",rooms[1]);
        rooms[2].addDirection("R4",rooms[3]);
        rooms[2].addDirection("R4",waters[0]);

        rooms[3].addDirection("R3",rooms[2]);

        rooms[4].addDirection("R6",rooms[5]);
        rooms[4].addDirection("R12",rooms[11]);

        rooms[5].addDirection("R5",rooms[4]);
        rooms[5].addDirection("R7",rooms[6]);

        rooms[6].addDirection("R2",rooms[1]);
        rooms[6].addDirection("R6",rooms[5]);
        rooms[6].addDirection("R8",rooms[7]);

        rooms[7].addDirection("R7",rooms[6]);
        rooms[7].addDirection("R8",lava[0]);

        rooms[8].addDirection("R10",rooms[9]);

        rooms[9].addDirection("R9",rooms[8]);
        rooms[9].addDirection("R11",rooms[10]);

        rooms[10].addDirection("R10",rooms[9]);
        rooms[10].addDirection("R12",rooms[11]);

        rooms[11].addDirection("R5",rooms[4]);
        rooms[11].addDirection("R11",rooms[10]);

        hero = new Hero(rooms[0],null,weapons[0]);
    }

    public void startGame(){
        map_layout();
        Scanner input = new Scanner(System.in);
        //Hero hero = new Hero();
        System.out.print("Please enter your character name: ");
        hero.setName(input.next());

        System.out.println(hero);

        String decision;
        Location currentLoc ,newLoc= null;
        int takeWeapon;
        int takeClothing;

        boolean b = false;
        do{
            currentLoc = hero.getLocation();
            showHelpMenu();
            decision = input.next();
            if(decision.equalsIgnoreCase("Go")){
                do {
                    System.out.println("Current Location : "+ currentLoc);
                    System.out.print("Choose direction:");
                    String direc = input.next();

                    b = checkPathExist(direc,currentLoc);
                    if(b) {
                        newLoc = adventurerNextLocation(direc,currentLoc);
                        hero.setLocation((Room) newLoc);
                    }
                    else if (direc.equals("R4")){
                        System.out.println("You have fallen into water and drowned.");
                        System.out.println("You died");
                        System.exit(0);
                    }
                    else if (direc.equals("R8")){
                        System.out.println("You have fallen into lava and burned to ashes.");
                        System.out.println("You died");
                        System.exit(0);
                    }
                    else {
                        System.out.println("There is no path exist.");
                    }
                }
                while(b==false);
            }
            else if (decision.equalsIgnoreCase("ShowI")){
                try {
                    hero.viewWeaponInventory();
                    hero.viewClothingInventory();
                }
                catch (Exception e){
                }

            }
            else if(decision.equalsIgnoreCase("Look")){
                try{
                    if(currentLoc instanceof Room)
                        ((Room) currentLoc).viewRoomContent();
                    //hero.getClothing();
                }
                catch (Exception e){
                    System.out.println("There is no item in this room");
                }

            }
            else if (decision.equalsIgnoreCase("Look")){
                try {
                    if(currentLoc instanceof Room)
                        ((Room) currentLoc).viewRoomContent();
                    //hero.getWeapons();
                }
                catch (Exception e){
                    System.out.println("There is no item in this room");
                }

            }
            else if (decision.equalsIgnoreCase("Take")) {
                try {

                        if (currentLoc instanceof Room) {
                            ((Room) currentLoc).viewRoomInventory();
                            System.out.println("Take the thing 0/1/2/3 .. from the room : ");
                            takeWeapon = Integer.parseInt(input.next());
                            Weapons w = ((Room) currentLoc).getRoomWeapon(takeWeapon);
                            hero.take(w);
                            hero.setCurrentDamage(w.getDamage());
                            hero.viewWeaponInventory();
                            System.out.println("Press 0 again for take the cloth.");
                            takeClothing = Integer.parseInt(input.next());
                            Clothing c = ((Room) currentLoc).getRoomClothing(takeClothing);
                            hero.take(c);
                            hero.viewClothingInventory();
                        }

                }
                catch (Exception e){
                    System.out.println("There is no item in this room");
                }
            }

            else if (decision.equalsIgnoreCase("Fight")){
                try {
                    if (hero.getLocation().equals(rooms[0])){
                        ratFight(hero, monsters);
                    }
                    else if (hero.getLocation().equals(rooms[1])){
                        ratFight(hero, monsters);
                    }
                    else if (hero.getLocation().equals(rooms[2])){
                        goblinFight(hero, monsters);
                    }
                    else if (hero.getLocation().equals(rooms[3])){
                        goblinFight(hero, monsters);
                    }
                    else if (hero.getLocation().equals(rooms[4])){
                        goblinFight(hero, monsters);
                    }
                    else if (hero.getLocation().equals(rooms[5])){
                        skeletonFight(hero, monsters);
                    }
                    else if (hero.getLocation().equals(rooms[6])){
                        skeletonFight(hero, monsters);
                    }
                    else if (hero.getLocation().equals(rooms[7])){
                        skeletonFight(hero, monsters);
                    }
                    else if (hero.getLocation().equals(rooms[8])){
                        phoenixFight(hero, monsters);
                    }
                    else if (hero.getLocation().equals(rooms[9])){
                        phoenixFight(hero, monsters);
                    }
                    else if (hero.getLocation().equals(rooms[10])){
                        phoenixFight(hero, monsters);
                    }
                    else if (hero.getLocation().equals(rooms[11])){
                        phoenixFight(hero, monsters);
                    }

                }
                catch (Exception e){
                    System.out.println("There is no item in this room");
                }

            }

            else if(decision.equalsIgnoreCase("Throww")){
                try {
                    hero.viewWeaponInventory();
                    System.out.println("Use the thing 0/1/2/3 .. from the Inventory : ");
                    takeWeapon = Integer.parseInt(input.next());
                    Weapons w =hero.getWeaponsItem(takeWeapon);
                    hero.drop(w);
                }
                catch (Exception e){
                    System.out.println("There is no item in this room");
                }

            }
            else if(decision.equalsIgnoreCase("Throwc")){
                try {
                    hero.viewClothingInventory();
                    System.out.println("Use the thing 0/1/2/3 .. from the Inventory : ");
                    takeClothing = Integer.parseInt(input.next());
                    Clothing c =hero.getClothingItem(takeClothing);
                    hero.drop(c);
                }
                catch (Exception e){
                    System.out.println("There is no item in this room");
                }

            }
            else if(decision.equalsIgnoreCase("Exit")){
                System.exit(0);
            }
            else{
                System.out.println("Invalid command");
            }

        }while(true);

    }
    public void showHelpMenu() {
        System.out.println("Choose Transaction:");
        System.out.println("ShowI:");
        System.out.println("Go:");
        System.out.println("Look");
        System.out.println("Take:");
        System.out.println("Throww:");
        System.out.println("Throwc");
        System.out.println("Fight:");
        System.out.println("Exit:");
        System.out.println();
    }

    public boolean checkPathExist(String path , Location loc) {

        HashMap<String ,Location> hm = loc.getRoomDir();
        if(hm.containsKey(path)) {
            if(hm.get(path) instanceof Room)
                return true;
        }
        return false;
    }

    public Location adventurerNextLocation(String path , Location loc) {

        HashMap<String ,Location> hm = loc.getRoomDir();
        if(hm.containsKey(path)) {
            if(hm.get(path) instanceof Room)
                return hm.get(path);
        }
        return loc;

    }
    


    public void ratFight(Hero hero, Monster [] monsters){


        int monsterDamage = monsters[0].getCurrentDamage();
        int monsterHealth = monsters[0].getHitPoints();
        int heroDamage = hero.getCurrentDamage();
        int heroHealth = hero.getHitPoints();
        int currentRoomPeople = 0;
        int totalSaved = 0;
        int choice;
        Monster monster = new Monster();
        int blockedRatDamage = monsterDamage - 1;
        int blockHeroAttack = heroDamage - 3;
        Scanner scanner = new Scanner(System.in);
        boolean tk = false;

        System.out.println("You choose to fight rat");
        System.out.println(hero);
        System.out.println(monsters[0]);
        System.out.println();

        while (true) {
            System.out.println("What you want to do?");
            System.out.println("1- Attack");
            System.out.println("2- Block");
            int decision = scanner.nextInt();
            if (decision == 1) {
                hero.attack();
                monsterHealth -= heroDamage;
                System.out.println(hero.getName() + " hits for "+ heroDamage + " damage. " + monsters[0].getName() + " has " + monsterHealth + " health left.");
                if (monsterHealth > 0) {
                    monsters[0].attack();
                    heroHealth -= monsterDamage;
                    System.out.println(monsters[0].getName() + " hits for "+ monsterDamage + " damage. " + hero.getName() + " has " + heroHealth + " health left.");
                } else if (monsterHealth <= 0) {
                    System.out.println(hero.getName() + " has " + heroHealth + " HP left. " + hero.getName() + " Defeats " + monsters[0].getName() + ".");
                    hero.saveTownspeople();
                    currentRoomPeople = 2;
                    monster.setGoldDrop();
                    hero.setGold(monster.getGoldDrop());
                    hero.setGold(100);
                    totalSaved += currentRoomPeople;
                    System.out.println("You have saved total " + totalSaved + " Townspeople and gained " + monster.getGoldDrop() + " gold!");
                    townsPeople[0].Heal();
                    break;
                }
                else if (heroHealth <= 0) {
                    System.out.println(monsters[0].getName() + " Defeats " + hero.getName());
                    monsters[0].killTownspeople();
                    hero.deadTownspeople();
                    System.out.println("Game Over");
                    System.exit(0);
                }
            }

            else if (decision == 2) {
                monsters[0].attack();
                heroHealth -= blockedRatDamage;
                hero.block();
                System.out.println(monsters[0].getName() + " hits for "+ blockedRatDamage + " damage. " + hero.getName() + " has health " + heroHealth + " left.");
                hero.attack();
                monsterDamage -= blockHeroAttack;
                System.out.println(hero.getName() + " hits for "+ blockHeroAttack + " damage. " + monsters[0].getName() + " has health " + monsterHealth + " left.");

                if (monsterHealth <= 0) {
                    System.out.println(hero.getName() + " has " + heroHealth + " HP left. " + hero.getName() + " Defeats " + monsters[0].getName() + ".");
                    hero.saveTownspeople();
                    currentRoomPeople = 2;
                    monster.setGoldDrop();
                    hero.setGold(monster.getGoldDrop());
                    hero.setGold(100);
                    totalSaved += currentRoomPeople;
                    System.out.println("You have saved total " + totalSaved + " Townspeople and gained " + monster.getGoldDrop() + " gold!");
                    break;
                }
                else if (heroHealth <= 0) {
                    System.out.println(monsters[0].getName() + " Defeats " + hero.getName());
                    monsters[0].killTownspeople();
                    hero.deadTownspeople();
                    System.out.println("Game Over");
                    System.exit(0);
                }
                break; }
        }
    }

    public void goblinFight(Hero hero, Monster [] monsters){


        int monsterDamage = monsters[1].getCurrentDamage();
        int monsterHealth = monsters[1].getHitPoints();
        int heroDamage = hero.getCurrentDamage();
        int heroHealth = hero.getHitPoints();
        int currentRoomPeople = 0;
        int totalSaved = 0;
        int choice;
        Monster monster = new Monster();
        int blockedRatDamage = monsterDamage - 3;
        int blockHeroAttack = heroDamage - 3;
        Scanner scanner = new Scanner(System.in);
        boolean tk = false;

        System.out.println("You choose to fight Goblin");
        System.out.println(hero);
        System.out.println(monsters[1]);
        System.out.println();

        while (true) {
            System.out.println("What you want to do?");
            System.out.println("1- Attack");
            System.out.println("2- Block");
            int decision = scanner.nextInt();
            if (decision == 1) {
                hero.attack();
                monsterHealth -= heroDamage;
                System.out.println(hero.getName() + " hits for "+ heroDamage + " damage. " + monsters[1].getName() + " has " + monsterHealth + " health left.");
                if (monsterHealth > 0) {
                    monsters[1].attack();
                    heroHealth -= monsterDamage;
                    System.out.println(monsters[1].getName() + " hits for "+ monsterDamage + " damage. " + hero.getName() + " has " + heroHealth + " health left.");
                } else if (monsterHealth <= 0) {
                    System.out.println(hero.getName() + " has " + heroHealth + " HP left. " + hero.getName() + " Defeats " + monsters[1].getName() + ".");
                    hero.saveTownspeople();
                    currentRoomPeople = 5;
                    monster.setGoldDrop();
                    hero.setGold(monster.getGoldDrop());
                    hero.setGold(100);
                    totalSaved += currentRoomPeople;
                    System.out.println("You have saved total " + totalSaved + " Townspeople and gained " + monster.getGoldDrop() + " gold!");
                    townsPeople[1].Heal();
                    break;
                }
                else if (heroHealth <= 0) {
                    System.out.println(monsters[1].getName() + " Defeats " + hero.getName());
                    monsters[1].killTownspeople();
                    hero.deadTownspeople();
                    System.out.println("Game Over");
                    System.exit(0);
                }
            }

            else if (decision == 2) {
                monsters[1].attack();
                heroHealth -= blockedRatDamage;
                hero.block();
                System.out.println(monsters[1].getName() + " hits for "+ blockedRatDamage + " damage. " + hero.getName() + " has health " + heroHealth + " left.");
                hero.attack();
                monsterDamage -= blockHeroAttack;
                System.out.println(hero.getName() + " hits for "+ blockHeroAttack + " damage. " + monsters[1].getName() + " has health " + monsterHealth + " left.");

                if (monsterHealth <= 0) {
                    System.out.println(hero.getName() + " has " + heroHealth + " HP left. " + hero.getName() + " Defeats " + monsters[1].getName() + ".");
                    hero.saveTownspeople();
                    currentRoomPeople = 5;
                    monster.setGoldDrop();
                    hero.setGold(monster.getGoldDrop());
                    hero.setGold(100);
                    totalSaved += currentRoomPeople;
                    System.out.println("You have saved total " + totalSaved + " Townspeople and gained " + monster.getGoldDrop() + " gold!");
                    break;
                }
                else if (heroHealth <= 0) {
                    System.out.println(monsters[1].getName() + " Defeats " + hero.getName());
                    monsters[1].killTownspeople();
                    hero.deadTownspeople();
                    System.out.println("Game Over");
                    System.exit(0);
                }
                break; }
        }
    }
    public void skeletonFight(Hero hero, Monster [] monsters){


        int monsterDamage = monsters[3].getCurrentDamage();
        int monsterHealth = monsters[3].getHitPoints();
        int heroDamage = hero.getCurrentDamage();
        int heroHealth = hero.getHitPoints();
        int currentRoomPeople = 0;
        int totalSaved = 0;
        Monster monster = new Monster();
        int blockedRatDamage = monsterDamage - 10;
        int blockHeroAttack = heroDamage - 3;
        Scanner scanner = new Scanner(System.in);
        boolean tk = false;

        System.out.println("You choose to fight Skeleton Knight");
        System.out.println(hero);
        System.out.println(monsters[3]);
        System.out.println();

        while (true) {
            System.out.println("What you want to do?");
            System.out.println("1- Attack");
            System.out.println("2- Block");
            int decision = scanner.nextInt();
            if (decision == 1) {
                hero.attack();
                monsterHealth -= heroDamage;
                System.out.println(hero.getName() + " hits for "+ heroDamage + " damage. " + monsters[3].getName() + " has " + monsterHealth + " health left.");
                if (monsterHealth > 0) {
                    monsters[3].attack();
                    heroHealth -= monsterDamage;
                    System.out.println(monsters[3].getName() + " hits for "+ monsterDamage + " damage. " + hero.getName() + " has " + heroHealth + " health left.");
                    if (heroHealth <= 0) {
                        System.out.println(monsters[3].getName() + " Defeats " + hero.getName());
                        monsters[3].killTownspeople();
                        hero.deadTownspeople();
                        System.out.println("Game Over");
                        System.exit(0);
                    }
                }
                else {
                    System.out.println(hero.getName() + " has " + heroHealth + " HP left. " + hero.getName() + " Defeats " + monsters[3].getName() + ".");
                    hero.saveTownspeople();
                    currentRoomPeople = 10;
                    totalSaved += currentRoomPeople;
                    System.out.println("You have saved total " + totalSaved + " Townspeople and gained " + monster.getGoldDrop() + " gold!");
                    townsPeople[2].Heal();
                    break;
                }
            }

            else if (decision == 2) {
                monsters[3].attack();
                heroHealth -= blockedRatDamage;
                hero.block();
                System.out.println(monsters[3].getName() + " hits for "+ blockedRatDamage + " damage. " + hero.getName() + " has health " + heroHealth + " left.");
                hero.attack();
                monsterDamage -= blockHeroAttack;
                System.out.println(hero.getName() + " hits for "+ blockHeroAttack + " damage. " + monsters[3].getName() + " has health " + monsterHealth + " left.");

                if (monsterHealth <= 0) {
                    System.out.println(hero.getName() + " has " + heroHealth + " HP left. " + hero.getName() + " Defeats " + monsters[3].getName() + ".");
                    hero.saveTownspeople();
                    currentRoomPeople = 10;
                    monster.setGoldDrop();
                    hero.setGold(monster.getGoldDrop());
                    hero.setGold(100);
                    totalSaved += currentRoomPeople;
                    System.out.println("You have saved total " + totalSaved + " Townspeople and gained " + monster.getGoldDrop() + " gold!");
                    break;
                }
                else if (heroHealth <= 0) {
                    System.out.println(monsters[3].getName() + " Defeats " + hero.getName());
                    monsters[3].killTownspeople();
                    hero.deadTownspeople();
                    System.out.println("Game Over");
                    System.exit(0);
                }
                break; }
        }
    }
    public void phoenixFight(Hero hero, Monster [] monsters){


        int monsterDamage = monsters[2].getCurrentDamage();
        int monsterHealth = monsters[2].getHitPoints();
        int heroDamage = hero.getCurrentDamage();
        int heroHealth = hero.getHitPoints();
        int currentRoomPeople = 0;
        int totalSaved = 0;
        int choice;
        int blockedRatDamage = monsterDamage - 10;
        int blockHeroAttack = heroDamage - 3;
        Scanner scanner = new Scanner(System.in);
        boolean tk = false;
        Monster monster = new Monster();


        System.out.println("You choose to fight Phoenix");
        System.out.println(hero);
        System.out.println(monsters[2]);
        System.out.println();

        while (true) {
            System.out.println("What you want to do?");
            System.out.println("1- Attack");
            System.out.println("2- Block");
            int decision = scanner.nextInt();
            if (decision == 1) {
                hero.attack();
                monsterHealth -= heroDamage;
                System.out.println(hero.getName() + " hits for "+ heroDamage + " damage. " + monsters[2].getName() + " has " + monsterHealth + " health left.");
                if (monsterHealth > 0) {
                    monsters[2].attack();
                    heroHealth -= monsterDamage;
                    System.out.println(monsters[2].getName() + " hits for "+ monsterDamage + " damage. " + hero.getName() + " has " + heroHealth + " health left.");
                    if (heroHealth <= 0) {
                        System.out.println(monsters[2].getName() + " Defeats " + hero.getName());
                        monsters[2].killTownspeople();
                        hero.deadTownspeople();
                        System.out.println("Game Over");
                        System.exit(0);
                    }
                }
                else {
                    System.out.println(hero.getName() + " has " + heroHealth + " HP left. " + hero.getName() + " Defeats " + monsters[2].getName() + ".");
                    hero.saveTownspeople();
                    currentRoomPeople = 10;
                    totalSaved += currentRoomPeople;
                    System.out.println("You have saved total " + totalSaved + " Townspeople and gained " + monster.getGoldDrop() + " gold!");
                    townsPeople[3].Heal();
                    break;
                }
            }

            else if (decision == 2) {
                monsters[2].attack();
                heroHealth -= blockedRatDamage;
                hero.block();
                System.out.println(monsters[2].getName() + " hits for "+ blockedRatDamage + " damage. " + hero.getName() + " has health " + heroHealth + " left.");
                hero.attack();
                monsterDamage -= blockHeroAttack;
                System.out.println(hero.getName() + " hits for "+ blockHeroAttack + " damage. " + monsters[2].getName() + " has health " + monsterHealth + " left.");

                if (monsterHealth <= 0) {
                    System.out.println(hero.getName() + " has " + heroHealth + " HP left. " + hero.getName() + " Defeats " + monsters[2].getName() + ".");
                    hero.saveTownspeople();
                    currentRoomPeople = 10;
                    monster.setGoldDrop();
                    hero.setGold(monster.getGoldDrop());
                    hero.setGold(100);
                    totalSaved += currentRoomPeople;
                    System.out.println("You have saved total " + totalSaved + " Townspeople and gained " + monster.getGoldDrop() + " gold!");
                    break;
                }
                else if (heroHealth <= 0) {
                    System.out.println(monsters[2].getName() + " Defeats " + hero.getName());
                    monsters[2].killTownspeople();
                    hero.deadTownspeople();
                    System.out.println("Game Over");
                    System.exit(0);
                }
                break; }
        }
    }
}




