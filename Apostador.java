package SisApostas;

public class Apostador{
	String nome;
	String login;
	String senha;

	public Apostador(String nome,String login, String senha){
		this.nome  = nome;
		this.login = login;
		this.senha = senha;
	}
	public Apostador(String nome,String login){
		this.nome  = nome;
		this.login = login;
	}

	public String getNome(){
		return this.nome;
	}
	public void setNome(){
		this.nome = nome;
	}

	public String getLogin(){
		return this.login;
	}
	public void setLogin(){
		this.login = login;
	}

	public String getSenha(){
		return this.senha;
	}
	public void setSenha(){
		this.senha = senha;
	}
}