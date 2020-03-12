package PUml;

import java.net.URI;
import java.sql.Time;
import java.util.Date;
import java.util.TreeSet;

public class Persona<E>  extends Pelicula1{
	
	// ******** Atributos *********
	
		
		private String nombre;
		private String apellido;
		private Date fechaNacimiento;
		private String nacionalidad;
		
		
		public TreeSet<E> actor = new java.util.TreeSet<E>();
		
		public TreeSet<E> director = new java.util.TreeSet<E>();
		
		public TreeSet<E> productor = new java.util.TreeSet<E>();
		
		public TreeSet<E> guionista = new java.util.TreeSet<E>();
		
		//********* Constructor *************
		

		public Persona(String titulo, Time agno, String sipnosis, Genero genero, String pais, URI url,
				Time duracion, String nombre, String apellido, Date fechaNacimiento, String nacionalidad, String trailer) {
			super(titulo, agno, sipnosis, genero, pais, trailer, url, duracion);
			this.nombre = nombre;
			this.apellido = apellido;
			this.fechaNacimiento = fechaNacimiento;
			this.nacionalidad = nacionalidad;
		}
		
		// ********* Métodos setters and getters *************

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public Date getFechaNacimiento() {
			return fechaNacimiento;
		}

		public void setFechaNacimiento(Date fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}

		public String getNacionalidad() {
			return nacionalidad;
		}

		public void setNacionalidad(String nacionalidad) {
			this.nacionalidad = nacionalidad;
		}

		//************** Método toString *******************
		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento
					+ ", nacionalidad=" + nacionalidad + ", actor=" + actor + ", director=" + director + ", productor="
					+ productor + ", guionista=" + guionista + "]";
		}
	
}
