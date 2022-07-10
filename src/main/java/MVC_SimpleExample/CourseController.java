package MVC_Pattern_Demo;

/*
 * Контроллер похож на интерфейс между моделью и представлением.
 * Он получает пользовательские запросы от уровня представления и обрабатывает их, включая необходимые проверки.
 * Затем запросы отправляются в модель для обработки данных. После обработки данные снова отправляются обратно
 * в контроллер, а затем отображаются в представлении.
 *
 * Источник: https://java-blog.ru/osnovy/arhitektura-mvc-java
 */

public class CourseController {
    private CourseModel model;
    private CourseView view;
    public CourseController(CourseModel model, CourseView view){
        this.model = model;
        this.view = view;
    }
    public void setCourseName(String name){
        model.setName(name);
    }
    public String getCourseName(){
        return model.getName();
    }
    public void setCourseId(String id){
        model.setId(id);
    }
    public String getCourseId(){
        return model.getId();
    }
    public void setCourseCategory(String category){
        model.setCategory(category);
    }
    public String getCourseCategory(){
        return model.getCategory();
    }
    public void updateView(){
        view.printCourseDetails(model.getName(), model.getId(), model.getCategory());
    }
}
