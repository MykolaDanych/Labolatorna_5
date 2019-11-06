package command.commands.BuildingCommands.printCommands;

import buildings.Building;
import command.commands.BuildingCommand;

public class PrintApartmentListCommand extends BuildingCommand {
    public PrintApartmentListCommand(Building building) {
        super(building);
    }

    @Override
    public boolean execute() {
        return false;
    }
}
