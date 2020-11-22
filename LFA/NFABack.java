import java.util.Scanner;

//Q = {q0, q1, q2}
//q0 = q0
//F = q2
//Alfabeto = {0,1}
//-----------------------
//|		|	0	|	1	|
//|->q0	|{q0,q1}|	{q0}|
//|q1	|{}		|	{q2}|
//|*q2	|{}		|	{}	|
//-----------------------
// ->q0
// q1
// *q2
//Seja ∑ = {0,1}, proponha um NFA (Autômato Finito não determinístico) para reconhecer cadeias que:
//a. Comecem com 100.
//b. Terminem com 100.
//c. Comecem ou terminem com 100.


public class NFABack {
	//Q = {q0, q1, q2}
	//Alfabeto = {0,1}
	
	static int[][][] transicao = {	{{0,1},{0}},
									{{},{2}},
									{{},{}}};
	static int estadoInicial = 0;
	static int [] aceitacao = {1};
	
	public static void main(String[] args) {
		//Leitura das cadeias
		Scanner leitor = new Scanner(System.in);
		String cadeia;
		char simbolo;		
		System.out.println("Informe uma cadeia: ");
		cadeia = leitor.nextLine();
		
		int[] estados = {estadoInicial};
		int[] estadosFinais = testa(cadeia, estados, 0);
		if(aceita(estadosFinais)) {
			System.out.println("Aceita");
		} else {
			System.out.println("Rejeitada");
		}
	}
	
	//Metodos
	public static int[] testa(String cadeia, int[] estados, int posicao) {
		if(posicao == cadeia.length()) {
			imprimeCI(cadeia, estados[0], posicao);
			if(aceita(estados)) {
				return estados;	
			} else {
				System.out.println("<<Busca profunda>> Fim da cadeia");
				return null;	
			}
		}
		
		int simboloInt = Integer.parseInt(cadeia.substring(posicao, posicao+1));
		for(int i:estados) {
			imprimeCI(cadeia, i, posicao);
			int[] novosEstados = transicao[i][simboloInt];
			if(novosEstados.length == 0) {
				System.out.println("<<Busca profunda>> sem opeções");
				return null;
			}
			int[] transicoes = testa(cadeia, novosEstados, posicao+1);
			if(transicoes != null)
			return transicoes;
		}
		return null;
			
	}
	
	public static boolean aceita(int[] estados) {
		if(estados == null) return false;
		for(int i:estados) {
			for(int j:aceitacao) {
				if(i == j) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void imprimeCI(String cadeia, int estado, int posicao) {
		System.out.print(cadeia.substring(0,posicao));
		System.out.print("[q" + estado + "]");
		System.out.println(cadeia.substring(posicao));
	}
}
