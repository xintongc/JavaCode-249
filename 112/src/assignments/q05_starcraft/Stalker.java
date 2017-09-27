package assignments.q05_starcraft;
import assignments.q01_fraction.*;
/**
 * Created by zncu on 2017-04-09.
 */
public class Stalker extends Unit implements Moving, Attacking {

    public Stalker() {
        name = "Stalker";
    }

    public void moveToLocation(Point target){
        System.out.println(name + " 从 " + locatoin + " 走到 " + target);
        this.locatoin = target;
    }

    public void attack(Unit target){
        System.out.println(name + " 正在用毒液攻击 " + target.getName());
    }

}
