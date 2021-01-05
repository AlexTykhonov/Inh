// Создать класс Man (человек), с полями: имя, возраст, пол и вес. Определить методы задания имени, возраста и веса.
// Создать производный класс Student, имеющий поле года обучения.Определить методы задания и увеличения года обучения.

public class RunManStudentClasses {
    public static void main(String[] args) {
        Student student = new Student("Натали", 21, 2, 65, 4);

        System.out.println("Познакомьтесь с нашим студентом, это " + student.name + ", чей возраст " + student.age + " лет.");
        if (student.sex == 1) {
            System.out.println(" Он парень и его вес " + student.weight + ", а учится он на " + student.courseyear + " курсе");
            System.out.println();
            student.incCourseyear();
            System.out.println("Через год он будет учиться на " + student.courseyear+" курсе. Пожелаем ему хорошей учёбы!");
        } else {
            System.out.println(" Она девушка и её вес " + student.weight + ", а учится она на " + student.courseyear + " курсе");
            System.out.println();
            student.incCourseyear();
            System.out.println("Через год она будет учиться на " + student.courseyear+" курсе. Пожелаем ей хорошей учёбы!");
        }

        student.incCourseyear();
    }

}
