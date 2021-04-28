package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

import javax.swing.text.html.Option;
import java.util.Optional;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) { SpringApplication.run(HelloSpringApplication.class, args); }
}
