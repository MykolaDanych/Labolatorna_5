package command.commands;

import buildings.Building;

public abstract class BuildingCommand extends Command {
    private Building building;

    public BuildingCommand(Building building) {
        this.building = building;
    }
}
