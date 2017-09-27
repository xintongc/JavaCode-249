package course.encapsulation;

/**
 * Created by zncu on 2017-02-26.
 */
public class Weapon {
    private String name;
    private int atk;
    private int def;

    public Weapon(String name, int atk, int def) {
        this.name = name;
        this.atk = atk;
        this.def = def;
    }

    public Weapon() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
