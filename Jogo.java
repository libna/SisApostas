package SisApostas;

public class Jogo{
	public Time          time1;
	public Time          time2;
	public String        descricao;
	public ResultadoDoJogo resultado;
	public String        status;

	public static String NAO_REALIZADO = "Não realizado";
	public static String REALIZADO     = "realizado";

	public Jogo(String descricao, String nomeTime1, String nomeTime2){
		this.descricao = descricao;
		nomeTime1 = time1.getNome();
		nomeTime2 = time2.getNome();
	}

	public Time getTime1(){
		return this.time1;
	}
	public Time getTime2(){
		return this.time2;
	}

	public String getStatus(){
		return this.status;
	}

	// public void setStatus(String realizadoOuNao){

	// }
	public void setResultado(int golsTime1, int golsTime2){
		golsTime1 = resultado.getGolsTime1();
		golsTime2 = resultado.getGolsTime2();
	}
	public ResultadoDoJogo getResultado(){
		return this.resultado;
	}
}