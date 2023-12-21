public class Employee {
    String name;
    double salary;
    int workHour;
    int hireYear;


    public Employee(String name, int maas, int workHour, int hireYear) {
        this.name = name;
        this.salary = maas;
        this.workHour = workHour;
        this.hireYear = hireYear;
    }


    public double tax() {
        double tax = 0;
        if (this.salary < 1000) {
            return this.salary;

        } else {
           tax = this.salary * 0.03;
        }
        return tax;
    }

    public double bonus() {
        int extrahour = this.workHour - 40;
        double extrahourBonus = 0;
        if (this.workHour > 40) {
           extrahourBonus = (extrahour * 30);
        }
        return extrahourBonus;
    }


    public double raiseSalary() {
        int workyear = 2021 - this.hireYear;
        if(workyear < 10){
           return this.salary * 0.05;
        }else if(workyear > 9 && workyear < 20){
            return this.salary * 0.10;
        }else{
            return this.salary * 0.15;
        }

    }

    public String toString() {

        double extrahourBonus = bonus();
        double tax = tax();
        double raiseSalary = raiseSalary();
        double taxandbonusSalary = this.salary - tax + extrahourBonus;
double totalSalary = this.salary - tax + extrahourBonus + raiseSalary;

        return ("Adı : " + this.name + "\nMaaşı : " + this.salary + "\nÇalışma Saati : " + this.workHour + "\nBaşlangıç yılı : " + this.hireYear + "\nVergi : " + this.tax() + "\nBonus : " + this.bonus() + "\nMaaş artışı : " + this.raiseSalary() + "\nVergi ve Bonuslar ile birlikte maaş : " + taxandbonusSalary + "\nToplam maaş : " + totalSalary);
    }

}
