package movieratings;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class MovieRatingsService {
	@Autowired
	MovieRatingsRepository repository;
	
	public List<MovieRatings> getMoviesByUserId(String userId){
		return repository.getMoviesByUserId(userId);
	}

}
