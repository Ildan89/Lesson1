import course.Course;
import team.Member;
import team.Team;

public class Lesson1App {
    public static void main(String[] args) {
        Team teamOfDream = new Team();
        teamOfDream.add(
                new Member("Петр", "Иванов", 85),
                new Member("Анна", "Соколова", 65),
                new Member("Дмитрий", "Бушуев", 70),
                new Member("Вероника", "Никитина", 80)
        );

        Course course = new Course(40, 50, 80, 70);
        teamOfDream.doIt(course);
        teamOfDream.showResult();
    }
}
