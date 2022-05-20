package br.com.ifce.service;

import java.util.List;

import br.com.ifce.model.Movie;
import br.com.ifce.repository.MovieRepository;

//@Service
public class MovieService {
	
	//@Autowired
	private MovieRepository movieRepo;
	
	public void registerService(Movie movie) {
		
		if(movie.getTitulo() != null) {
			
			movieRepo.salvarMovie(movie);
			
		}
	}
	
	//public void atualizarMovie(Movie movie) {
		//movieRepo.saveOrUpdate(movie);
	//}
	
	public Movie buscarPorCodigo(Long codigo) {
		
		return movieRepo.buscarPorCodigo(codigo);
		
	}
	
	public List <Movie> getAllMovie(){
		
		return movieRepo.getAllMovie();
		
	}
	
	public void apagarMovie(Long codigo) {
		
		movieRepo.apagarMovie(codigo);
		
	}

}
