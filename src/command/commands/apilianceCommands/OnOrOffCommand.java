package command.commands.apilianceCommands;

import appliances.ElectricalAppliance;
import command.commands.ApplianceCommand;

public class OnOrOffCommand extends ApplianceCommand {

    public OnOrOffCommand(ElectricalAppliance apiliance) {

        super(apiliance);
    }

    @Override
    public boolean execute() {
        return false;
    }
}
