package command.commands.BuildingCommands.printCommands;

import buildings.Building;
import command.commands.BuildingCommand;


public class PrintListCommand extends BuildingCommand {

    public PrintListCommand(Building building) {
        super(building);
    }

    @Override
    public boolean execute() {
        return false;
    }
}
