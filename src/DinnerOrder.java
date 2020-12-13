public class DinnerOrder {
    private ICommand slot;

    public void setCommand(ICommand ICommand){slot = ICommand; }

    public void submitCommand(){slot.execute(); }

}
