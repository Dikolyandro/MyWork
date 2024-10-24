package As9;

public class PDFReportGenerator extends ReportGenerator {
    @Override
    protected void formatHeader() {
        System.out.println("Formatting header for PDF report.");
    }

    @Override
    protected void formatBody() {
        System.out.println("Formatting body for PDF report.");
    }

    @Override
    protected void formatFooter() {
        System.out.println("Formatting footer for PDF report.");
    }
}
