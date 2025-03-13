public class Main {
    public static void main(String[] args) {
        HumanIMB person = new HumanIMB(80, 1.52);
        System.out.println(person.getResult());
    }
}

class HumanIMB {
    private double weight; // Вага людини
    private double height; // Зріст людини

    public HumanIMB(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateIMB() {
        return weight / (height * height);
    }

    public String getResult() {
        double imb = calculateIMB();
        if (imb >= 18.5 && imb < 25) {
            return "Norm";
        } else if (imb >= 25 && imb < 30) {
            return "Warning!";
        } else if (imb >= 30) {
            return "Fat";
        } else {
            return "Deficit";
        }
    }
}
