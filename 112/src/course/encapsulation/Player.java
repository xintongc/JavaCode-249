package course.encapsulation;

/**
 * Created by zncu on 2017-02-19.
 */
public class Player {

    private int atk;
    private int def;
    private int dex;
    private int agl;
    private int hp;
    private String name;
    private Weapon weapon;

    public void trace(){
        System.out.println("atk:" +atk + " def:" + def);
    }


    public Player(int atk, int def, int dex, int agl, int hp, String name) {
        this.atk = atk;
        this.def = def;
        this.dex = dex;
        this.agl = agl;
        this.hp = hp;
        this.name = name;
    }

    public Player(){
        this(100, 100, 100,100,100, "defalut name");
    }

    public void attack(Player target){
        double currentDex = dex * (Math.random() * 0.4 - 0.2 + 1.0);
        double oppositeAgl = target.agl * (Math.random() * 0.4 - 0.2 + 1.0);
        double damage = atk - target.def;
        if (damage < 0){
            damage = 1;
        }
        int mode = 0;
        if (dex > target.agl * 1.5) {
            damage *= 2;
            mode = 2;
        } else if (dex < target.agl * 0.5) {
            damage = 0;
            mode = 0;
        } else {
            damage *= Math.random() * 0.2 - 0.1 + 1.0;
            mode = 1;
        }

        int damageInt = (int)damage;
        if (damage - damageInt > 0) {
            damageInt +=1;
        }

        if(hp - damageInt < 0){
            hp = 0;
        }
        else {
            hp -= damageInt;
        }


        if (mode == 0){
            System.out.print(name);
            System.out.print(" 攻击 ");
            System.out.print(target.name);
            System.out.print(", 攻击被闪避");
            System.out.println();
        } else if (mode == 1){
            System.out.print(name);
            System.out.print(" 攻击 ");
            System.out.print(target.name);
            System.out.print(" ");
            System.out.print(damageInt);
            System.out.print("点, ");
            System.out.print(target.name);
            System.out.print(" HP:");
            System.out.print(target.hp);
            System.out.println();
        } else if (mode == 2){
            System.out.print(name);
            System.out.print(" 暴击 ");
            System.out.print(target.name);
            System.out.print(" ");
            System.out.print(damageInt);
            System.out.print("点, ");
            System.out.print(target.name);
            System.out.print(" HP:");
            System.out.print(target.hp);
            System.out.println();
        }

        if(hp == 0){
            System.out.println("玩家" + target.name + " 胜利");
        }
        else if(target.hp == 0){
            System.out.println("玩家" + name + " 胜利");
        }

    }

    public int totalAtk(){
        int atk = this.atk;
        if(weapon != null){
            atk += weapon.getAtk();
        }
        return atk;
    }

    public int totalDef(){
        int def = this.def;
        if(weapon != null)
            def += weapon.getDef();
        return def;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
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

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getAgl() {
        return agl;
    }

    public void setAgl(int agl) {
        this.agl = agl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
