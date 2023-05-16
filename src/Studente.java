public class Studente {
	
	private String nome;
	private int annoNascita;
	
	//costruttore di default
	public Studente() {
		nome = "Luca";
		annoNascita = 2006;
	}
	
	//costruttore parametrizzato
	public Studente(String nome, int annoNascita) {
		this.nome = nome;
		this.annoNascita = annoNascita;
	}

	//getters & setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnnoNascita() {
		return annoNascita;
	}
	public void setAnnoNascita(int annoNascita) {
		this.annoNascita = annoNascita;
	}

	//toString
	public String toString() {
		return "nome = " + nome + ", annoNascita = " + annoNascita;
	}
}
