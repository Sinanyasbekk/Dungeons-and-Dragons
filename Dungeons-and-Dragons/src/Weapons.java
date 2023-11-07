public class Weapons {
    private String name;
    private String info;
    private int weight;
    private int range;
    private int damage;

    public Weapons(String name, String info, int weight, int range, int damage){
        this.name = name;
        this.weight = weight;
        this.info = info;
        this.range = range;
        this.damage = damage;
    }
    public Weapons() {

    }


    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String look() {
        return getInfo();
    }

    @Override
    public String toString() {
        return "Thing name=" + name + ", Description= " + info + ", Weight=" + weight + ", Range=" + range + ", Damage= " + damage ;
    }










}