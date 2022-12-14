package upchi.api.movie.film.services.interfaces;

import java.util.List;

import upchi.api.movie.film.controllers.dtos.requests.PostFilmRequest;
import upchi.api.movie.film.controllers.dtos.requests.UpdateFilmRequest;
import upchi.api.movie.film.controllers.dtos.responses.GetFilmResponse;
import upchi.api.movie.film.controllers.dtos.responses.PostFilmResponse;

public interface IFilmService {

    public List<GetFilmResponse> list ();
    public GetFilmResponse get(Long id);

    public PostFilmResponse create(PostFilmRequest request);

    public void delete(Long id);

    public GetFilmResponse update(Long id, UpdateFilmRequest request);

}
