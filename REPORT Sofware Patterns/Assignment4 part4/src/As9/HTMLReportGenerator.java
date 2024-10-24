package As9;

public class HTMLReportGenerator extends ReportGenerator {
    @Override
    protected void formatHeader() {
        System.out.println("Formatting header for HTML report.");
    }

    @Override
    protected void formatBody() {
        System.out.println("Formatting body for HTML report.");
    }

    @Override
    protected void formatFooter() {
        System.out.println("Formatting footer for HTML report.");
    }
}
