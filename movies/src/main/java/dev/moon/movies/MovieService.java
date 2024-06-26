package dev.moon.movies;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class MovieService {
  @Autowired
  private MovieRepository movieRepository;

  public List<Movie> allMovies() {
    return movieRepository.findAll();
  }

  public Optional<Movie> singleMovie(String imdbid) {
    return movieRepository.findMovieByImdbId(imdbid);
  }

}
