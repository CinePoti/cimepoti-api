package br.com.cinepoti.cinepoti_api.mapper;

import br.com.cinepoti.cinepoti_api.model.Genre;
import br.com.cinepoti.cinepoti_api.model.Movie;
import br.com.cinepoti.cinepoti_api.model.MovieGenre;
import br.com.cinepoti.cinepoti_api.dto.request.MovieGenreRequestDTO;
import br.com.cinepoti.cinepoti_api.dto.response.MovieGenreResponseDTO;

public class MovieGenreMapper {

    // Converts MovieGenreRequestDTO to MovieGenre entity
    public static MovieGenre toEntity(MovieGenreRequestDTO movieGenreRequestDTO, Movie movie, Genre genre) {
        if (movieGenreRequestDTO == null) {
            return null;
        }

        return new MovieGenre(
                null, // ID will be generated by the database
                genre,
                movie
        );
    }

    // Converts MovieGenre entity to MovieGenreResponseDTO
    public static MovieGenreResponseDTO toResponseDTO(MovieGenre movieGenre) {
        if (movieGenre == null) {
            return null;
        }

        return new MovieGenreResponseDTO(
                movieGenre.getId(),
                movieGenre.getMovie().getId(),
                movieGenre.getMovie().getTitle(),
                movieGenre.getGenre().getId(),
                movieGenre.getGenre().getName()
        );
    }
}
