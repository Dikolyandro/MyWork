package As7;

import java.util.ArrayList;
import java.util.List;

public class VersionControl {
    private final List<DocumentVersion> versions = new ArrayList<>();

    public void saveVersion(Document document) {
        versions.add(document.save());
        System.out.println("Version saved: " + document.getContent());
    }

    public void listVersions() {
        System.out.println("Document Versions:");
        for (int i = 0; i < versions.size(); i++) {
            System.out.println("Version " + (i + 1) + ": " + versions.get(i).getContent());
        }
    }

    public void restoreVersion(Document document, int index) {
        if (index < 1 || index > versions.size()) {
            System.out.println("Invalid version number.");
            return;
        }
        document.restore(versions.get(index - 1));
        System.out.println("Restored to version " + index + ": " + document.getContent());
    }
}

