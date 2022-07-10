package MVC_Pattern_Demo;

/*
 * Приведенный ниже класс извлекает данные CourseModel из функции, используя которую пользователь вводит набор значений.
 * Затем он помещает эти значения в модель Course. Затем он инициализирует представление,
 * которое мы создали ранее в статье. Кроме того, он также вызывает класс CourseController
 * и связывает его с классом Course и классом CourseView. Затем метод updateView(), являющийся частью контроллера,
 * обновляет сведения о курсе на консоли.
 *
 * Источник: https://java-blog.ru/osnovy/arhitektura-mvc-java
 */

public class MVCPatternDemo {
    public static void main(String[] args) {
        //fetch student record based on his roll no from the database
        CourseModel model  = retrieveCourseFromDatabase();
        //Create a view : to write course details on console
        CourseView view = new CourseView();
        CourseController controller = new CourseController(model, view);
        controller.updateView();
        //update model data
        controller.setCourseName("Python");
        System.out.println("\nAfter updating, Course Details are as follows:\n");
        controller.updateView();
    }
    private static CourseModel retrieveCourseFromDatabase(){
        CourseModel course = new CourseModel();
        course.setName("Java");
        course.setId("01");
        course.setCategory("Programming");
        return course;
    }
}
