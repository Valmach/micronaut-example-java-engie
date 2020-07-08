package micronaut.example.java.engie;

 import io.micronaut.http.annotation.*;

@Controller("/hello")
public class HelloController {

    @Get("/message")
    public String message() {
        return "Welcome to Java Engie";

    }

    @Get("/employee")
    public Employee getEmployee() {
        return new Employee();
    }
}
