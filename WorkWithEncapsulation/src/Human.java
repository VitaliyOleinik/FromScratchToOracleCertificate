public class Human {
    final String sex;
    Human(String sex){
        this.sex = sex;
    }
    private StringBuilder name;

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    public void setName(StringBuilder name) {
        this.name = name;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0){
            this.age = age;
        }
    }

    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight > 0){
            this.weight = weight;
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}

class Test{
    public static void main(String[] args) {
        Human h = new Human("male");
        h.setName(new StringBuilder("Kolya"));
        h.getName().append("!!!!");
        System.out.println(h.getName());
        h.setWeight(50);
        h.setAge(15);
        System.out.println(h.toString());
    }
}
