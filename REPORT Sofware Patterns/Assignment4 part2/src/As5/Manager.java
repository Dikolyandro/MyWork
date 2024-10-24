package As5;

public class Manager extends Approver {
    @Override
    public void handleRequest(ExpenseRequest request) {
        if (request.getAmount() <= 5000) {
            System.out.println("Manager approved the expense request for " + request.getAmount());
        } else if (nextApprover != null) {
            nextApprover.handleRequest(request);
        }
    }
}

