public class DisplayMenuCommand implements ICommand{

    // run displayMenu for the menu object
    @Override
    public void execute() {Menu.getInstance().displayMenu(); }

    // there isn't an undo for printing
    @Override
    public void unexecute() {}
}
