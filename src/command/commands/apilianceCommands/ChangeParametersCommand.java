package command.commands.apilianceCommands;

import appliances.ElectricalAppliance;
import command.commands.ApplianceCommand;

public class ChangeParametersCommand extends ApplianceCommand {

    public ChangeParametersCommand(ElectricalAppliance apiliance) {
        super(apiliance);
    }

    @Override
    public boolean execute() {
        return false;
    }
}
