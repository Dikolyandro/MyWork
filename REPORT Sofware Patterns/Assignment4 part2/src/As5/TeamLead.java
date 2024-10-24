package As5;

public class TeamLead extends Approver {
    @Override
    public void handleRequest(ExpenseRequest request) {
        if (request.getAmount() <= 1000) {
            System.out.println("Team Lead approved the expense request for " + request.getAmount());
        } else if (nextApprover != null) {
            nextApprover.handleRequest(request);
        }
    }
}

