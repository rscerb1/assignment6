public class DisplayTabCommand implements ICommand{

    Tab tab;

    public DisplayTabCommand(Tab tab){this.tab = tab;}

    @Override
    public void execute(){tab.displayTab();}

    // there isn't an undo for printing
    @Override
    public void unexecute() {}
}
