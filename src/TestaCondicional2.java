
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("testando condicional 2");

		int idade = 18;
		//boolean acompanhado = true;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("valor de bool = " + acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("pode entrar!");
		} else {
			System.out.println("não pode entrar!");
		}

	}

}
