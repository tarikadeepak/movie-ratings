package movieratings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MovieRatingsRepository {
	List<MovieRatings> movieList = new ArrayList<MovieRatings>(Arrays.asList(
			new MovieRatings("Movie1", 9, "dtarika"),
			new MovieRatings("Movie2", 8, "dtarika"),
			new MovieRatings("Movie3", 7, "dsingh")));
	List<MovieRatings> getMoviesByUserId(String userId){
		return movieList.stream().filter(movie -> userId.equals(movie.getUserId())).collect(Collectors.toList());
	}
}
