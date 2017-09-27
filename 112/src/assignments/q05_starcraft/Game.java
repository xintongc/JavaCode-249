package assignments.q05_starcraft;

import assignments.q01_fraction.*;

/**
 * Created by zncu on 2017-04-09.
 */
public class Game {

    public static void main(String[] args) {
        new Game().run();
    }
    public void run(){

        Map map = new Map();

        Stalker stalker = new Stalker();
        stalker.setLocatoin(new Point(1,1));
        map.addUnit(stalker);

        Observer observer = new Observer();
        observer.setLocatoin(new Point(3,3));
        map.addUnit(observer);

        PhotonCannon cannon = new PhotonCannon();
        cannon.setLocatoin(new Point(5,5));
        map.addUnit(cannon);

        WarpPrism prism = new WarpPrism();
        prism.setLocatoin(new Point(7,7));
        map.addUnit(prism);

        map.selectUnits(new Rectangle(new Point(0,0),6,6));
        map.selectedUnitsAttack(observer);

    }
}
