package command.commands.BuildingCommands.printCommands;

import buildings.Building;
import command.commands.BuildingCommand;


public class PrinPriceOfEnergyCommand extends BuildingCommand {
    double days;
    public PrinPriceOfEnergyCommand(Building building, double days) {
        super(building);
        this.days = days;
    }

    @Override
    public boolean execute() {
        return false;
    }
}
