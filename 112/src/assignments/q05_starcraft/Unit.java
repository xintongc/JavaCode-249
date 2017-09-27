package assignments.q05_starcraft;
import assignments.q01_fraction.*;
/**
 * Created by zncu on 2017-04-09.
 */
public class Unit {
    protected String name;
    protected Point locatoin;
    private boolean selected;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getLocatoin() {
        return locatoin;
    }

    public void setLocatoin(Point locatoin) {
        this.locatoin = locatoin;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
        System.out.println(name + (selected? " 被选中 " : " 被取消选中 "));
    }
}
