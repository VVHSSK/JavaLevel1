package JavaLevel1.Lesson7;

class Cat {
    private String name;
    private int appetite;
    private boolean fed;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate plate) {
        fed = plate.decreaseFood(appetite);
    }

    public void info() {
        System.out.println(name + " " + (fed ? " доволен и сыт =) " : " злой и голодный >:( "));
    }
}
