package SisApostas;

public class ResultadoDoJogo{
	int golsTime1;
	int golsTime2;

	public ResultadoDoJogo(int golsTime1,int golsTime2){
		this.golsTime1 = golsTime1;
		this.golsTime2 = golsTime2;
	}

	//public ResultadoDoJogo();

	public int getGolsTime1(){
		return this.golsTime1;
	}
	public int getGolsTime2(){
		return this.golsTime2;
	}

	public void setGolsTime1(){
		this.golsTime1 = golsTime1;
	}
	public void setGolsTime2(){
		this.golsTime2 = golsTime2;
	}
}