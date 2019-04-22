package JavaLevel1.Lesson7;

public class Lesson7 {
    public static void run() {
        Cat[] cats = {
                new Cat("Кот Барсик", 44),
                new Cat("Кот Маркиз", 33),
                new Cat("Кот Васька", 55),
        };
        Plate plate = new Plate(100);
        for (Cat itemCat : cats) {
            itemCat.eat(plate);
            itemCat.info();
        }


        //Допольнительное задание
        new MainWindow();
    }
}
