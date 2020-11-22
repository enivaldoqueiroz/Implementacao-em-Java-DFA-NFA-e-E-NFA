import java.util.Scanner;

//-> Q = {q0, q1}
// q0 = q0
//F = {q1}
//Alfabeto = {0,1}
//		0	|	1
//q0	q0		q1
//q1	q1		q0

//Cadeia aceita: 00101
//Cadeia não aceita: 01, 001
public class DFAGenerico {
	// Q = {q0, q1}
	//Alfabeto = {0,1}
	static int[][] transicao = {{0,1},{1,0}};
	static int estadoInicial = 0;
	static int [] aceitacao = {0};
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		String cadeia;
		int posicao = 0; 
		int estado = estadoInicial;
		char simbolo;
		
		System.out.println("Informe uma cadeia: ");
		cadeia = leitor.nextLine();
		
		//Pecorrer a cadeia
		while(posicao < cadeia.length()) {
			imprimeCI(cadeia, estado, posicao);
			simbolo = cadeia.charAt(posicao);
			int simboloInt = Integer.parseInt(simbolo + "");
			estado = transicao[estado][simboloInt];
			posicao++;
		}
		imprimeCI(cadeia, estado, posicao);
		boolean aceita = false;
		
		for(int i:aceitacao) {
			if (estado == i) aceita = true;
		}
		if (aceita) {
			System.out.println("Aceita");
		} else {
			System.out.println("Rejeitada");
		}
		
	}
	
	//Metodos

	public static void imprimeCI(String cadeia, int estado, int posicao) {
		System.out.print(cadeia.substring(0,posicao));
		System.out.print("[q" + estado + "]");
		System.out.println(cadeia.substring(posicao));
	}

}


