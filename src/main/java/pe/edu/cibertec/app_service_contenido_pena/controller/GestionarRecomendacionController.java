package pe.edu.cibertec.app_service_contenido_pena.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.app_service_contenido_pena.remoteservice.ServiceCatalogoClient;
import pe.edu.cibertec.app_service_contenido_pena.remoteservice.ServiceSuscripcionClient;

@RequiredArgsConstructor
@RestController
public class GestionarRecomendacionController {

    private final ServiceCatalogoClient serviceCatalogoClient;
    private final ServiceSuscripcionClient serviceSuscripcionClient;

    @GetMapping("/contenido")
    public String reproducirContenido() {
        return "Reproduciendo Contenido";
    }

    @GetMapping("/recomendacion")
    public String recomendarContenido() {
        return "Contenido recomendado";
    }

    //Interoperaciones entre función obtenerPelicula del Microservicio Catalogo
    // con función RecomendarContenido del Microservicio Contenido
    @GetMapping("/pelicula-recomendacion")
    public String obtenerPeliculasParaRecomendar(){
        String catalogo = serviceCatalogoClient.obtenerPelicula();
        return "Recomendaciones obtenidas: " + catalogo;
    }

    //Interoperaciones entre función gestionarSuscripcion del Microservicio Suscripcion
    // con función reproducirContenido  del Microservicio Contenido
    @GetMapping("/suscripcion-contenido")
    public String verificarSuscricionParaVerContenido(){
        String suscripcion = serviceSuscripcionClient.gestionarSuscripcion();
        return "Obtener informacion de suscripción: " +suscripcion;
    }
}
