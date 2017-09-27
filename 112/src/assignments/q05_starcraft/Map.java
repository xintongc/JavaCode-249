package assignments.q05_starcraft;

import assignments.q01_fraction.Point;
import assignments.q01_fraction.Rectangle;

import java.util.LinkedList;

/**
 * Created by zncu on 2017-04-09.
 */
public class Map {
    private LinkedList<Unit> units = new LinkedList<Unit>();

    public void addUnit(Unit unit){
        units.add(unit);
    }

    public void selectUnits(Rectangle area){
        for (Unit unit : units) {
            boolean in = area.hitTest(unit.getLocatoin());
            unit.setSelected(in);

        }
    }

    public void selectedUnitsMoveToLocation(Point targer){
        for (Unit unit : units) {
            if(unit.isSelected()){
//                if(unit instanceof Stalker){
//                    Stalker stalker = (Stalker) unit;
//                    stalker.moveToLocation(targer);
//
//                } else if (unit instanceof Observer){
//                    Observer observer = (Observer) unit;
//                    observer.moveToLocation(targer);
//
//                } else if(unit instanceof WarpPrism){
//                    WarpPrism warpPrism = (WarpPrism) unit;
//                    warpPrism.moveToLocation(targer);
//
//                }
                if(unit instanceof Moving){
                   Moving moving = (Moving) unit;
                   moving.moveToLocation(targer);
                }
            }

        }

    }

    public void selectedUnitsAttack(Unit target){
        for(Unit unit : units){
            if(unit.isSelected()){
                if(unit instanceof Attacking){
                    Attacking attacking = (Attacking) unit;
                    attacking.attack(target);
                }
            }
        }
    }
}
