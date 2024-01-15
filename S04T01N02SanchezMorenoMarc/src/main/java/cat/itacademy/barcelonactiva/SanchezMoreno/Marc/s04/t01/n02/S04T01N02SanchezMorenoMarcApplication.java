package cat.itacademy.barcelonactiva.SanchezMoreno.Marc.s04.t01.n02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"controllers"})
public class S04T01N02SanchezMorenoMarcApplication {

	public static void main(String[] args) {
		SpringApplication.run(S04T01N02SanchezMorenoMarcApplication.class, args);
	}

}
