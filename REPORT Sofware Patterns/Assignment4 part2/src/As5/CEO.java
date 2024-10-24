package As5;

public class CEO extends Approver {
    @Override
    public void handleRequest(ExpenseRequest request) {
        System.out.println("CEO approved the expense request for " + request.getAmount());
    }
}

