package SisApostas;

import java.util.ArrayList;
import java.util.List;

public interface SisApostas{

	public void cadastrarJogo(Jogo jogo);

	public void cadastrarUsuario(Apostador apostador);

	public boolean verificarLoginUsuario(String login, String senha);

	public void cadastrarResultadoDeJogo(String descricaoJogo, int golsTime1, int golsTime2);

	public List<Apostador> getVencedores();

	public void setValorAposta(double valor);

	public List<Apostador> pesquisaUsuarioComNomeComecandoCom();

	public List<Jogo> obterListaDeJogos();

}