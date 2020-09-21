package movieratings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class MovieRatingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieRatingsApplication.class, args);
	}
	
	@Bean
	public MovieRatingsService getMovieRatingService() {
		return new MovieRatingsService();
	}
	
	@Bean
	public MovieRatingsRepository getMovieRatingRepository() {
		return new MovieRatingsRepository();
	}

}
