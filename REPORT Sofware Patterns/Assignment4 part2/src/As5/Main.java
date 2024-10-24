package As5;

public class Main {
    public static void main(String[] args) {
        ApprovalChain approvalChain = new ApprovalChain();

        ExpenseRequest request1 = new ExpenseRequest(500, "Team lunch");
        approvalChain.processRequest(request1);

        ExpenseRequest request2 = new ExpenseRequest(3000, "Conference fees");
        approvalChain.processRequest(request2);

        ExpenseRequest request3 = new ExpenseRequest(7000, "New equipment");
        approvalChain.processRequest(request3);

        ExpenseRequest request4 = new ExpenseRequest(15000, "Company expansion");
        approvalChain.processRequest(request4);
    }
}

