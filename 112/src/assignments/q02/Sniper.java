package assignments.q02;

import java.util.Random;

/**
 * Created by zncu on 2017-03-29.
 */
public class Sniper extends Player {

    private double oneShotRate;

    public Sniper(int atk, int def, int dex, int agl, int hp, String name, double oneShotRate) {
        super(atk, def, dex, agl, hp, name);
        this.oneShotRate = oneShotRate;
    }

    public Sniper() {
    }

    public void attack(Player target){
        Random rand = new Random();
        int number = rand.nextInt(11);
        if(number * oneShotRate == 1){
            target.setHp(0);
        }
        else{
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
    }

    public double getOneShotRate() {
        return oneShotRate;
    }

    public void setOneShotRate(double oneShotRate) {
        this.oneShotRate = oneShotRate;
    }
}
