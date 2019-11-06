package command.commands;
import appliances.ElectricalAppliance;

public abstract class ApplianceCommand extends Command {
    private ElectricalAppliance apiliance;

    public ApplianceCommand(ElectricalAppliance apiliance) {

        this.apiliance = apiliance;
    }

    @Override
    public abstract boolean execute();

}
