

public class Conditionals {
    static void main(String[] args) {
        int salary = 2000;
        if (salary < 15000 && salary > 10000) {
            salary = salary + 2000;
        }
        else if (salary > 15000) {
            salary = salary + 2000;
        }
        else salary = salary + 1000;
        System.out.println(salary);
    }
}