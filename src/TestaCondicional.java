public class TestaCondicional {
	public static void main(String[] args) { // main + ctrl + espaço (automatico)
		System.out.println("testando condicional"); // sysout + ctrl + espaço (automatico)

		int idade = 14;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Você é maior de 18 anos");
		} else if (quantidadePessoas >= 2) {
			System.out.println("Você é menor de idade, mas está acompanhado");
			System.out.println("pode entrar!");
		} else {
			System.out.println("Você é menor de idade e não está acompanhado");
			System.out.println("não pode entrar!");
		}
	}
}
