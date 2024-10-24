package As5;

public class Director extends Approver {
    @Override
    public void handleRequest(ExpenseRequest request) {
        if (request.getAmount() <= 10000) {
            System.out.println("Director approved the expense request for " + request.getAmount());
        } else if (nextApprover != null) {
            nextApprover.handleRequest(request);
        }
    }
}

