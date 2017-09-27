package assignments.q05_starcraft;
import assignments.q01_fraction.*;

/**
 * Created by zncu on 2017-04-09.
 */
public class PhotonCannon extends Unit implements Attacking {

    public PhotonCannon() {
        name = "PhotonCannon";
    }

    public void attack(Unit target){
        System.out.println(name + " 正在用光子炮攻击 " + target.getName());
    }
}
