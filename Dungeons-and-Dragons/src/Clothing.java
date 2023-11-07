public class Clothing {

    private String name;
    private String info;
    private int weight;
    private int value;


    public Clothing(String name, String info, int weight, int value) {
        this.name = name;
        this.weight = weight;
        this.value = value;
        this.info = info;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Thing name=" + name + ", Description= " + info + ", Armor value= " + value + ", Weight=" + weight ;
    }
}
