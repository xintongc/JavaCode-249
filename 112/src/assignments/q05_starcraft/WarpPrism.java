package assignments.q05_starcraft;

import assignments.q01_fraction.*;

/**
 * Created by zncu on 2017-04-09.
 */
public class WarpPrism extends Unit implements Moving{

    public WarpPrism() {
        name = "WarpPrism";
    }

    public void moveToLocation(Point target){
        System.out.println(name + " 从 " + locatoin + " 飞到 " + target);
        this.locatoin = target;
    }
}
