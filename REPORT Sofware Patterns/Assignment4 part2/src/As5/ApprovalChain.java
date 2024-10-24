package As5;

public class ApprovalChain {
    private Approver firstApprover;

    public ApprovalChain() {
        TeamLead teamLead = new TeamLead();
        Manager manager = new Manager();
        Director director = new Director();
        CEO ceo = new CEO();

        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        firstApprover = teamLead;
    }

    public void processRequest(ExpenseRequest request) {
        firstApprover.handleRequest(request);
    }
}
