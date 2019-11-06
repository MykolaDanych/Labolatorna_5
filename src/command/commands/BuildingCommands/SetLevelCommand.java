package command.commands.BuildingCommands;

import buildings.Building;
import command.commands.BuildingCommand;

public class SetLevelCommand extends BuildingCommand {
    int level;
    public SetLevelCommand(Building building, int level) {
        super(building);
        this.level = level;
    }

    @Override
    public boolean execute() {
        return false;
    }
}
