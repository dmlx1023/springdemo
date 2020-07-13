import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;

@SpringBootConfiguration
public class Application implements ApplicationRunner {
    public void run(ApplicationArguments args) throws Exception {
    System.out.println("我是run########");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}
