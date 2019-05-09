package SisAPostas;

import java.util.ArrayList;
import java.util.List;

public class SisApostasSI{
	List<Jogo> jogos            = new ArrayList<Jogo>();
	List<Apostador> apostadores = new ArrayList<Apostador>();
	List<Aposta> apostas 		= new ArrayList<Aposta>(); 
	double 	valorAposta;

	public double getValorAposta(){
		return this.valorAposta;
	}
	public void setValorAposta(){
		this.valorAposta = valorAposta;
	}
}