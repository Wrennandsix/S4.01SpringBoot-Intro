package cat.itacademy.barcelonactiva.SanchezMoreno.Marc.s04.t01.n01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"controllers"})
public class S04T01N01SanchezMorenoMarcApplication {

	public static void main(String[] args) {
		SpringApplication.run(S04T01N01SanchezMorenoMarcApplication.class, args);
	}

}
