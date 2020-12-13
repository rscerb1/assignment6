public class CreatOrderCommand implements ICommand{
    Order order;

    public CreatOrderCommand(Order order){this.order = order;}

    @Override
    public void execute() {

    }

    @Override
    public void unexecute() {

    }
}
