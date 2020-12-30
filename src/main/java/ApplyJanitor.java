import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class ApplyJanitor extends DefaultTask {
    @TaskAction
    public void myTask() {
        System.out.println("Hello World");
    }
}
