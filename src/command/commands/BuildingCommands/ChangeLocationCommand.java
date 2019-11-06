package command.commands.BuildingCommands;

import buildings.Building;
import command.commands.BuildingCommand;

public class ChangeLocationCommand extends BuildingCommand {
    int id;

    public ChangeLocationCommand(Building building,int id) {
        super(building);
        this.id = id;
    }

    @Override
    public boolean execute() {
        return false;
    }
}
