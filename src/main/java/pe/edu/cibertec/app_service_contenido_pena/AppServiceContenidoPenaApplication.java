package pe.edu.cibertec.app_service_contenido_pena;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppServiceContenidoPenaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppServiceContenidoPenaApplication.class, args);
	}

}
