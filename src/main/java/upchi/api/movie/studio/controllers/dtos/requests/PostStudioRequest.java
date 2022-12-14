package upchi.api.movie.studio.controllers.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class PostStudioRequest {
    // Por Hacer:
    // - Agregar los atributos para este DTO

    // No es necesario agregar los métodos setter y getter para este método.

    // Este DTO es para mandar información para crear un nuevo registro
    // de la entidad Studio en la base de datos

    // Generar los DTOS necesarios para lo demás métodos si lo consideran necesario
    private String name;
    private String headquarters;
}
