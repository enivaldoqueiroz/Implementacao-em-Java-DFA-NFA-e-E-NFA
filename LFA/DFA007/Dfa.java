package DFA007;


public class Dfa {
	
	protected DfaState estado;

	//Contrutor da classe Jargao
	public Dfa() {
		estado = new DfaNovo();
	}
	
	//Metodos da classe ParBinario
	public void exibirCadeiaAceita(String s){
		estado = estado.exibirCadeiaAceita(s);
	}
	
	public void exibirCadeiaNaoAceita(String s){
		estado = estado.exibirCadeiaNaoAceita(s);
	}
}
