package controle;

import java.util.regex.Pattern;

/**
 * Classe que tem como função verificar os dados digitados pelo Artista
 * @author Gustavo Costa de Jesus
 * @since 2022
 * @version 1.0
 */
public class ControleInformacoesArtista {
	
	/**
	 * Verifica se o email ultilizado pelo Usuario é valido. em caso positivo, retorna true.
	 * É fornecido uma String que indica o pattern, que possteriormente é compilado e compara com o email digitado.
	 * @param email
	 * Recebe o email digitado pelo usuario
	 * @return
	 * Retorna um boolean para indicar se o email é valido ou nao.
	 */
	public static boolean checkEmailArtista(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";
		
		Pattern pat = Pattern.compile(emailRegex);
		if(email == null) {
			return false;
		}return pat.matcher(email).matches();
		
	}
	
	
	
}
