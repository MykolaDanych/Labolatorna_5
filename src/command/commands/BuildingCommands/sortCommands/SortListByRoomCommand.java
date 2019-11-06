package command.commands.BuildingCommands.sortCommands;

import buildings.Building;
import command.commands.BuildingCommand;

public class SortListByRoomCommand extends BuildingCommand {
    public SortListByRoomCommand(Building building) {
        super(building);
    }

    @Override
    public boolean execute() {
        return false;
    }
}
