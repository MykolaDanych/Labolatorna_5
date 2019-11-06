import buildings.Building;
import programMenu.WorkMenu;

public class Main {

    public static void main(String[] args) throws Exception{

        WorkMenu menu = new WorkMenu(new Building());
        menu.openMenu();

    }
}
