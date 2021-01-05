// Создать класс Man (человек), с полями: имя, возраст, пол и вес. Определить методы задания имени, возраста и веса.
// Создать производный класс Student, имеющий поле года обучения.Определить методы задания и увеличения года обучения.


public class Student extends Man {

    int courseyear;

    public Student(String name, int age, int sex, int weight, int courseyear) {
        super(name, age, sex, weight);
        this.courseyear = courseyear;
    }

    public int getCourseyear() {
        return courseyear;
    }

    public void setCourseyear(int courseyear) {
        this.courseyear = courseyear;
    }

    public void incCourseyear () {
        this.courseyear++;
    }
}
