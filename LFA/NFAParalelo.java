import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

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


public class NFAParalelo {
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
		
		int posicao = 0;		
		int[] estados = {estadoInicial};
		//Varrendo as  Posições e novosEstados
		while(posicao < cadeia.length()) {
			imprimeCI(cadeia, estados, posicao);
			int [] novosEstados = new int[] {};
			int elemento = Integer.parseInt(cadeia.substring(posicao, posicao + 1));
			for(int i:estados) {
				int[] destinoTransicao = transicao[i][elemento];
				novosEstados = uniao(novosEstados, destinoTransicao);
			}
			
			estados = novosEstados;
			if(estados.length == 0) {
				break;
			}
			posicao++;
		}
		imprimeCI(cadeia, estados, posicao);
		
		if(aceita(estados)) {
			System.out.println("Aceita");
		} else {
			System.out.println("Rejeitada");
		}
	}
	
	//Metodos
	//Verifica os estados e faz a unição dos novos estados atraves de estrutura arvore
	public static int[] uniao(int[] estados, int[] novosEstados) {
		Set<Integer> uniao = new TreeSet<>();
		for(int i: estados) uniao.add(i);
		for(int i: novosEstados) uniao.add(i);
		int[] ret = new int [uniao.size()];
		int j = 0;
		for(int i:uniao) ret[j++] = i;
		return ret;
	}
	//Verifica a aceitação dos estados
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
	//Imprime a Configuração Instantania dos estados
	public static void imprimeCI(String cadeia, int[] estado, int posicao) {
		System.out.print(cadeia.substring(0,posicao) + "{");
		for(int i=0; i < estado.length; i++ ) {
			System.out.print("q" + estado[i]);
			if(i<estado.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println("}" + cadeia.substring(posicao));
	}
}
