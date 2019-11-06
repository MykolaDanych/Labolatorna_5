package command.commands.BuildingCommands.printCommands;

import buildings.Building;
import command.commands.BuildingCommand;

public class PrintRoomListCommand extends BuildingCommand {
    public PrintRoomListCommand(Building building) {
        super(building);
    }

    @Override
    public boolean execute() {
        return false;
    }
}
