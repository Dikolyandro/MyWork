public class library {
    public String FullName;
    public int[] card = new int[2];
    public String[] faculty = new String[3];
    public String birth;
    public String number;
    public library(String FullName, int[] card, String[] faculty, String birth, String number) {
        this.FullName = FullName;
        this.card = card;
        this.faculty = faculty;
        this.birth = birth;
        this.number = number;
    }
    public void takeBook(String FullName, int[] card) {
        System.out.println(FullName + " took " + card[1] + " books");
    }

    public void takeBook(String FullName, String[] faculty) {
        System.out.print(FullName + " took books: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(faculty[i] + " ");
        }
        System.out.println(" ");
    }

    public void returnBook(String FullName, int[] card) {
        System.out.println(FullName + " returned " + card[1] + " books");
    }

    public void returnBook(String FullName, String[] faculty) {
        System.out.print(FullName + " returned the books: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(faculty[i] + " ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int[] cardnum = {555, 9};
        String[] faculties = {"Adventures", "Dictionary", "Encyclopedia"};
        library reader1 = new library("Aleksey", cardnum, faculties, "09.01.1999", "89991090808");
        library reader2 = new library("Mikhail", cardnum, faculties, "23.12.2015", "87778889911");
        reader1.takeBook(reader1.FullName, reader1.card);
        reader1.takeBook(reader1.FullName, reader1.faculty);
        reader1.returnBook(reader1.FullName, reader1.card);
        reader1.returnBook(reader1.FullName, reader1.faculty);

        reader2.takeBook(reader2.FullName, reader2.card);
        reader2.takeBook(reader2.FullName, reader2.faculty);
        reader2.returnBook(reader2.FullName, reader2.card);
        reader2.returnBook(reader2.FullName, reader2.faculty);
    }


}
