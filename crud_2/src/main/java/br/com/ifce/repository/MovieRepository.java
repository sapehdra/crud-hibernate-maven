package br.com.ifce.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.ifce.config.HibernateConfig;
import br.com.ifce.model.Movie;

public class MovieRepository {
	
	public void salvarMovie(Movie movie) {
		
		Transaction transacao = null;
		Session sessao = HibernateConfig.getSessionFactory().openSession();
		
		transacao = sessao.beginTransaction();
		
		sessao.save(movie);
		
		transacao.commit();
		
	}
	
	public void atualizarMovie(Movie movie) {
		
		Transaction transacao = null;
		Session sessao = HibernateConfig.getSessionFactory().openSession();
		
		transacao = sessao.beginTransaction();
		
		sessao.saveOrUpdate(movie);
		
		transacao.commit();
		
	}
	
	public Movie buscarPorCodigo(Long codigo) {
		
		Transaction transacao = null;
		Session sessao = HibernateConfig.getSessionFactory().openSession();
		
		transacao = sessao.beginTransaction();
		
		Movie movie = sessao.get(Movie.class, codigo);
		
		transacao.commit();
		
		return movie;
		
	}
	
	@SuppressWarnings("unchecked")
	public List <Movie> getAllMovie() {
		
		Transaction transacao = null;
		
		Session sessao = HibernateConfig.getSessionFactory().openSession();
		
		transacao = sessao.beginTransaction();
		
		List <Movie> movie = null;
		
		movie = sessao.createQuery("from Movie").list();
		
		transacao.commit();
		
		return movie;
		
	}
	
	public void apagarMovie(Long codigo) {
		
		Transaction transacao = null;
		Movie movie = null;
		Session sessao = HibernateConfig.getSessionFactory().openSession();
		
		transacao = sessao.beginTransaction();
		
		 movie = sessao.get(Movie.class, codigo);
         // get student object
         sessao.delete(movie);
         //student = session.load(Student.class, id);
		
		transacao.commit();
		
	}

}
