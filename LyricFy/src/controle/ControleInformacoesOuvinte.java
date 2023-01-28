package controle;

import java.util.regex.Pattern;

/**
 * Classe que tem como função verificar os dados digitados pelo Ouvinte.
 * @author Gustavo Costa de Jesus
 * @since 2022
 * @version 1.0
 */
public class ControleInformacoesOuvinte {
	
	/**
	 * Verifica se o email ultilizado pelo Usuario é valido. em caso positivo, retorna true.
	 * É fornecido uma String que indica o pattern, que possteriormente é compilado e compara com o email digitado.
	 * @param email
	 * Recebe o email do usuario.
	 * @return
	 * Retorna um boolean dizendo se o email é valido.
	 */
	public static boolean checkEmailOuvinte(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";
		
		Pattern pat = Pattern.compile(emailRegex);
		if(email == null) {
			return false;
		}return pat.matcher(email).matches();
		
	}
	
	/**
	 * Verifica se o nome ultilizado pelo Usuario é valido. em caso positivo, retorna true.
	 * É fornecido uma String que indica o pattern, que possteriormente é compilado e compara com o email digitado.
	 * @param name
	 * Recebe o nome do Usuario
	 * @return
	 * Retorna um boolean dizendo se o nome é valido ou nao.
	 */
	public static boolean checkName(String name) {
		String regex = "^[A-Za-z]\\w{5,29}$";
		
		Pattern pat = Pattern.compile(regex);
		
		if(name == null) {
			return false;
		}return pat.matcher(name).matches();
		
	}
}
