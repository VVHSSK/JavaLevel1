package JavaLevel1.Lesson5;

public class Employee {
    String surname, name, patronymic, position, email, tel;
    int earnings, age;

    Employee(String surname,
             String name,
             String patronymic,
             String position,
             String email,
             String tel,
             int earnings,
             int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.earnings = earnings;
        this.age = age;
    }

    void getFullInfo() {
        System.out.println("Фамилия: " + surname + " | Имя: " + name
                + " | Отчество: " + patronymic + " | Должность: " + position
                + " | E-mail: " + email + " | Телефон: " + tel + " | Оклад: " + earnings + " | Возраст: "
                + age);
    }

    int getAge() {
        return age;
    }
}
