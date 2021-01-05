// Создать класс Man (человек), с полями: имя, возраст, пол и вес. Определить методы задания имени, возраста и веса.
// Создать производный класс Student, имеющий поле года обучения.Определить методы задания и увеличения года обучения.

public class Man {

    String name;
    Integer age;
    Integer sex;
    Integer weight;


    public Man() {
    }

    public Man(String name, int age, Integer sex, Integer weight) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}

