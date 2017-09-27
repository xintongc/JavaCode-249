package assignments.q05_starcraft;

import assignments.q01_fraction.Point;

/**
 * Created by zncu on 2017-04-09.
 */
public class Observer extends Unit implements Moving {

    public Observer() {
        name = "Observer";
    }

    public void moveToLocation(Point target){
        System.out.println(name + " 从 " + locatoin + " 飞到 " + target);
        this.locatoin = target;
    }

}
