package bw.ac.ub.cs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(
		exclude = SecurityAutoConfiguration.class, 
		scanBasePackages = {"bw.ac.ub.cs"}
)
public class CsprojectWSApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsprojectWSApplication.class, args);
	}

}
