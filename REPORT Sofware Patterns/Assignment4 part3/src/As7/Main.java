package As7;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        VersionControl versionControl = new VersionControl();

        document.setContent("Version 1: Initial content.");
        versionControl.saveVersion(document);

        document.setContent("Version 2: Added more content.");
        versionControl.saveVersion(document);

        document.setContent("Version 3: Final content.");
        versionControl.saveVersion(document);

        versionControl.listVersions();

        versionControl.restoreVersion(document, 2);
        versionControl.listVersions();
    }
}

