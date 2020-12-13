public class SubmitOrderCommand implements ICommand{

    Order order; // instance of order to call execute on

    public SubmitOrderCommand(Order order){this.order = order; }

    @Override
    public void execute() {
        order.submitOrder();
    }

    @Override
    public void unexecute() {

    }
}
