package pe.edu.cibertec.app_service_contenido_pena.remoteservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "app-service-catalogo-pena")
public interface ServiceCatalogoClient {
    @GetMapping("/pelicula")
    String obtenerPelicula();
}
