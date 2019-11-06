package programMenu;

import buildings.Building;
import command.Invoker;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class Menu {
    static Invoker invoker = new Invoker();
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Building house;
    int level; // 1 - House; 2 - Apartment; 3 - Room

    public Menu(Building house) {
        this.house = house;
        level = 1;
    }
}
