import java.util.ArrayList;

public class TownPeople {

    private int hitPoints;
    private String name;
    //private int heal;


    public TownPeople(String name,int hitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;

    }


    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public TownPeople(){

    }

    public void Heal(){
        System.out.println(name + " healed Hero to full Health.");
    }

    public int getHitPoints() {
        return hitPoints;
    }

    @Override
    public String toString() {
        return "TownPeople{" +
                "hitPoints=" + hitPoints +
                ", name='" + name + '\'' +
                '}';
    }
}