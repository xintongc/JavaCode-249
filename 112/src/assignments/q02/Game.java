package assignments.q02;

/**
 * Created by zncu on 2017-02-19.
 */
public class Game {
    public static void main(String[] args) {
        new Game().run();
    }

    public void run(){
//        Player player1 = new Player();
//        Weapon weapon = new Weapon();
//        player1.setWeapon(weapon);
//        player1.setAtk(10);
//        weapon.setAtk(2);
//
//        //player1.getWeapon().setAtk(2); //高级内存
//
//        System.out.println(player1.totalAtk());
//        System.out.println(player1.totalDef());

        Player player2 = new Player(100,200,90,50,800, "player2");
        Player player3 = new Player(150,80,100,20,1300, "player3");
        Sniper sniper = new Sniper(100,200,90,50,800,"sniper",0.3);
//        do{
//            player2.attack(player3);
//            player3.attack(player2);
//        }while ( player2.getHp() > 0 && player3.getHp() > 0);

        do{
            sniper.attack(player2);
            player2.attack(sniper);
        }while ( player2.getHp() > 0 && sniper.getHp() > 0);







    }
}