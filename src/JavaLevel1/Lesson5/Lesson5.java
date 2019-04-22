package JavaLevel1.Lesson5;


public class Lesson5 {
    public static void run() {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов", "Николай", "Петрович",
                "Директор", "IvanovNP@post.su", "+79778531263",250000, 53 );
        employees[1] = new Employee("Ефимов", "Евгений", "Иванович", "Зам. директора",
                "EfimovEI@post.su", "+79002356312",120000, 44);
        employees[2] = new Employee("Петров", "Константин", "Дмитриевич",
                "Менеджер", "PetrovKD@post.su", "+79168635363",70000, 29);
        employees[3] = new Employee("Крамер", "Георгий", "Николаевич",
                "Менеджер", "KramerGN@post.su", "+79192123135",65000, 41);
        employees[4] = new Employee("Котов", "Антон", "Васильевич",
                "Менеджер", "KotovAV@post.su", "+79856667936",35000, 24);

        for (Employee e : employees) if (e.getAge() > 40) e.getFullInfo();
    }
}
