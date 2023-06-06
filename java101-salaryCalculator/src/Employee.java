public class Employee {
    String name;

    int workHours;
    int hireYear;
    int tax;
    int bonus;
    int year = 2021;
    int raise;
    int firstSalary;
    int salary=firstSalary;

    Employee(String name, int firstSalary, int workHours, int hireYear) {
        this.name = name;
        this.firstSalary = firstSalary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.tax = tax;
        this.bonus = bonus;
        this.year = year;
        this.raise = raise;
        this.salary=firstSalary;
    }

    void tax() {
        if (firstSalary >= 1000) {
            tax = (firstSalary * 3 / 100);
            salary -= tax;
        }
    }

    void bonus() {
        if (workHours > 40) {
            bonus = (workHours - 40) * 30;
            salary += bonus;
        }
    }

    void raiseSalary() {
        if ((year - hireYear) < 10) {
            raise = firstSalary * 5 / 100;
            salary += raise;
        } else if ((year - hireYear) >= 10 && (year - hireYear) < 20) {
            raise = firstSalary * 10 / 100;
            salary += raise;
        } else if ((year - hireYear) > 19) {
            raise = firstSalary * 15 / 100;
            salary += raise;
        }
    }

    void toStringPrint(){
        tax();
        raiseSalary();
        bonus();

        System.out.println("Adı: "+this.name);
        System.out.println("Maaşı: "+this.firstSalary);
        System.out.println("Çalışma Saati: "+this.workHours);
        System.out.println("Başlangıç Yılı: "+this.hireYear);
        System.out.println("Vergi: "+this.tax);
        System.out.println("Bonus: "+this.bonus);
        System.out.println("Maaş Artışı: "+this.raise);
        System.out.println("Vergiler ve Bonuslarla Maaş: "+(firstSalary-tax+bonus));
        System.out.println("Toplam maaş: "+this.salary);

    }
}
