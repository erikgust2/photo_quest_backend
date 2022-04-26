import org.springframework.boot.SpringApplication;

@SpringBootApplication
@RestController
public class BaseClass extends SpringBootServletInitializer{
    public static void main(String[] args) {
        SpringApplication.run(BaseClass.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

}
