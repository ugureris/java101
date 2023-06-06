public class Student {
    Course c1;
    Course c2;
    Course c3;
    Course c4;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3, Course c4) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3, int note4) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
        if (note4 >= 0 && note4 <= 100) {
            this.c4.note = note4;
        }
    }

    void isPass() {
        this.avarage = (this.c1.note + this.c2.note + this.c3.note + this.c4.note) / 4.0;
        if (this.avarage > 55) {
            System.out.println("Tebrikler sınıfı geçtiniz.");
        } else {
            System.out.println("Kaldınız");
        }


        printNote();
    }

    void printNote() {
        System.out.println(this.c1.name + " Notu\t: " + this.c1.note);
        System.out.println(this.c2.name + " Notu\t: " + this.c2.note);
        System.out.println(this.c3.name + " Notu\t: " + this.c3.note);
        System.out.println(this.c4.name + " Notu\t: " + this.c4.note);
        System.out.println("Ortalamanız: " + this.avarage);

    }

}
