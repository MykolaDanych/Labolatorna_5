package command.commands.BuildingCommands;

import buildings.Building;
import command.commands.BuildingCommand;

public class SearchApplianceCommand extends BuildingCommand {
    public SearchApplianceCommand(Building building) {
        super(building);
    }

    @Override
    public boolean execute() {
        return false;
    }
}
