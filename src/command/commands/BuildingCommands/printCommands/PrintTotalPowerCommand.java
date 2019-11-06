package command.commands.BuildingCommands.printCommands;

import buildings.Building;
import command.commands.BuildingCommand;


public class PrintTotalPowerCommand extends BuildingCommand {
    public PrintTotalPowerCommand(Building building) {
        super(building);
    }

    @Override
    public boolean execute() {
        return false;
    }
}
