public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "9050000000", "TRH");
        Teacher t2=new Teacher("Einstein","48645654","FZK");
        Teacher t3=new Teacher("İdil Can","5445645645","OZL");
        Teacher t4=new Teacher("Yusuf Sayar","546545555","MAT");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik=new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);
        Course ozel=new Course("Özel Eğitim","103","OZL");
        ozel.addTeacher(t3);
        Course mat=new Course("Matematik","104","MAT");

        Student s1=new Student("Uğur","741","11",tarih,fizik,ozel,mat);
        s1.addBulkExamNote(19,91,85,100);
        s1.isPass();

    }
}