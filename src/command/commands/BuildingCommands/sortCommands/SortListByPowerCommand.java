package command.commands.BuildingCommands.sortCommands;

import buildings.Building;
import command.commands.BuildingCommand;


public class SortListByPowerCommand extends BuildingCommand {
    public SortListByPowerCommand(Building building) {
        super(building);
    }

    @Override
    public boolean execute() {
        return false;
    }
}
