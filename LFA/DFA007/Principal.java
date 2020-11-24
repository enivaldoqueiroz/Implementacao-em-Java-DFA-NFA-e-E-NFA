package DFA007;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		
			Dfa parBinario = new Dfa();
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Digite um alfabeto composto apenas por inteiros entre 0 e 9");
			System.out.println("Digite a cadeia de caracteres: ");
			String myString = scanner.next();		
			scanner.close();
						
			parBinario.exibirCadeiaAceita(myString);
			parBinario.exibirCadeiaNaoAceita(myString);
		

	}

}
