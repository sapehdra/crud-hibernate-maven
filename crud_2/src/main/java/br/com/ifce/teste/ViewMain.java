package br.com.ifce.teste;

import java.util.List;

import br.com.ifce.model.Movie;
import br.com.ifce.repository.MovieRepository;

public class ViewMain {
	
	public static void main(String[] args) {
		Movie movie1 = new Movie();
		movie1.setTitulo("Samurai X");
		movie1.setData("04/06/2021");
		movie1.setDuracao(139);
		movie1.setPreco(65);
		
		Movie movie2 = new Movie();
		movie2.setTitulo("Samurai X, the beginning");
		movie2.setData("30/07/2021");
		movie2.setDuracao(137);
		movie2.setPreco(40);
		
		Movie movie3 = new Movie();
		movie3.setTitulo("Samurai X, the origin");
		movie3.setData("25/08/2012");
		movie3.setDuracao(135);
		movie3.setPreco(100);
		
		MovieRepository movieRepo = new MovieRepository();
		
		movieRepo.salvarMovie(movie1);
		movieRepo.salvarMovie(movie2);
		movieRepo.salvarMovie(movie3);
		
		movie1.setTitulo("Samurai X, The Final");
		movieRepo.atualizarMovie(movie1);
		
		Movie movie4 = movieRepo.buscarPorCodigo(1L);
		
		System.out.println(movie4.getTitulo());
		
		List <Movie> movie = movieRepo.getAllMovie();
		
		for (Movie movie5 : movie) {
			System.out.println(movie);
		}
		//movie.forEach(movie5 --> System.out.println(movie5.getCodigo()));

		
		movieRepo.apagarMovie(3L);
		
	}

}
