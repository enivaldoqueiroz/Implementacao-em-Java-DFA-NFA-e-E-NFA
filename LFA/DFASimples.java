import java.util.Scanner;

// Q = {q0, q1}
// q0 = q0
//F = {q1}
//Alfabeto = {0,1}
//		0	|	1
//q0	q0		q1
//q1	q1		q0

//Cadeia aceita: 100 
//Cadeia não aceita: 101
public class DFASimples {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		String cadeia;
		int posicao = 0; 
		int estado = 0;
		char simbolo;
		
		System.out.println("Informe uma cadeia: ");
		cadeia = leitor.nextLine();
		
		//Pecorrer a cadeia
		while(posicao < cadeia.length()) {
			imprimeCI(cadeia, estado, posicao);
			simbolo = cadeia.charAt(posicao);
			if(estado == 0 && simbolo == '0') {
				estado = 0;
			} else if (estado == 0 && simbolo == '1') {
				estado = 1;
			} else if (estado == 1 && simbolo == '0') {
				estado = 1;
			} else if (estado == 1 && simbolo == '1') {
				estado = 0;
			}
			posicao++;
		}
		imprimeCI(cadeia, estado, posicao);
		
		if (estado == 1) {
			System.out.println("Aceita");
		} else if (estado == 0) {
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


