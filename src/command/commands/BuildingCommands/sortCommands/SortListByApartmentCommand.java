package command.commands.BuildingCommands.sortCommands;

import buildings.Building;
import command.commands.BuildingCommand;


public class SortListByApartmentCommand extends BuildingCommand {
    public SortListByApartmentCommand(Building building) {
        super(building);
    }

    @Override
    public boolean execute() {
        return false;
    }
}
