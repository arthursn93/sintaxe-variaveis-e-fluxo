public class TestaCondicional {
	public static void main(String[] args) { // main + ctrl + espa�o (automatico)
		System.out.println("testando condicional"); // sysout + ctrl + espa�o (automatico)

		int idade = 14;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Voc� � maior de 18 anos");
		} else if (quantidadePessoas >= 2) {
			System.out.println("Voc� � menor de idade, mas est� acompanhado");
			System.out.println("pode entrar!");
		} else {
			System.out.println("Voc� � menor de idade e n�o est� acompanhado");
			System.out.println("n�o pode entrar!");
		}
	}
}
