package command.commands.BuildingCommands.sortCommands;

import buildings.Building;
import command.commands.BuildingCommand;


public class SortListByConditionCommand extends BuildingCommand {

    public SortListByConditionCommand(Building building) {
        super(building);
    }

    @Override
    public boolean execute() {
        return false;
    }
}
