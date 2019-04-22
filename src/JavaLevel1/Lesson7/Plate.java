package JavaLevel1.Lesson7;

class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public boolean decreaseFood(int appetite) {
        if (food - appetite < 0) {
            return false;
        } else {
            food -= appetite;
            return true;
        }
    }

    public void info() {
        System.out.println("plate " + food);
    }

    public void addFood(int food) {
        this.food += food;
    }

}