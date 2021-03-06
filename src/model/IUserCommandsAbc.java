package model;

import java.util.HashMap;

public abstract class IUserCommandsAbc implements IUserCommands {

    // Hashmap that holds all the created commands:
    protected HashMap<String, ICommand> commands;

    public IUserCommandsAbc() {
        this.commands = new HashMap<>();
    }

    public IUserCommandsAbc(HashMap<String, ICommand> commands) {
        this.commands = commands;
    }

    public void putCommand(String string, ICommand icommand) {
        commands.put(string, icommand);
    }

    public void clearCommands() {
        commands.clear();
    }

    public ICommand getCommand(String commandName) {
            return commands.get(commandName);
    }

    public String getAllCommandNames() {
        StringBuilder retStringBuilder = new StringBuilder();
        for (String str: commands.keySet()) {
            retStringBuilder.append(str).append("\n");
        }
        return retStringBuilder.toString();
    }

    public abstract String validateCommand(String[] inputBuf);
}
