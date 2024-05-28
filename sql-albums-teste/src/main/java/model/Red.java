package model;

public class Red {
	
	public int id;
	public String nome;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Red [id=" + id + ", nome=" + nome + "]";
	}
	
}
