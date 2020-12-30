import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class Janitor implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        project.getTasks().create("javadocapply", ApplyJanitor.class);
    }
}
