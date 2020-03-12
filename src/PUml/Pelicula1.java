package PUml;

import java.net.URI;
import java.sql.Time;


public class Pelicula1 {
	
	/**
	 * Los atributos los he creado en modo privado por la solucion que nos has colgado en el moodle que 
	 * especifica su visivilidad en (-) private.
	 */

	private String titulo;
	private Time agno;
	private String sipnosis;
	private Genero genero;
	private String pais;
	public String  trailer;
	private URI url;
	private Time duracion;
	
	// *********Constructor**********
	
	public Pelicula1(String titulo, Time agno, String sipnosis, Genero genero, String pais, String trailer, URI url,
			Time duracion) {
		super();
		this.titulo = titulo;
		this.agno = agno;
		this.sipnosis = sipnosis;
		this.genero = genero;
		this.pais = pais;
		this.trailer = trailer;
		this.url = url;
		this.duracion = duracion;
	}
	
	
	// ******** Métodos setters and getters ********************

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Time getAgno() {
		return agno;
	}

	public void setAgno(Time agno) {
		this.agno = agno;
	}

	public String getSipnosis() {
		return sipnosis;
	}

	public void setSipnosis(String sipnosis) {
		this.sipnosis = sipnosis;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	public URI getUrl() {
		return url;
	}

	public void setUrl(URI url) {
		this.url = url;
	}

	public Time getDuracion() {
		return duracion;
	}

	public void setDuracion(Time duracion) {
		this.duracion = duracion;
	}

	  //************ Método toString ******************
	@Override
	public String toString() {
		return "Pelicula1 [titulo=" + titulo + ", agno=" + agno + ", sipnosis=" + sipnosis + ", genero=" + genero
				+ ", pais=" + pais + ", trailer=" + trailer + ", url=" + url + ", duracion=" + duracion + "]";
	}

  }

