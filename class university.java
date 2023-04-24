import java.util.Scanner;

class University {
    private int registrationNumber;

    public University() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter registration number: ");
        registrationNumber = scanner.nextInt();
    }

    public void print() {
        System.out.println("Registration number: " + registrationNumber);
    }
}

class Details extends University {
    private String name;
    private char grade;

    public Details(int regNum, String name, char grade) {
        super();
        this.name = name;
        this.grade = grade;
    }

    public void print() {
        super.print();
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
}

public class Main {
    public static void main(String[] args) {
        Details details = new Details(0, "John Doe", 'A');
        details.print();
    }
}