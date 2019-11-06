package command;

import command.commands.Command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Command> doneCommands;
    private Command command;

    public Invoker() {
        doneCommands = new ArrayList<>();
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public boolean invoke(){
        doneCommands.add(command);
        return command.execute();
    }
}
