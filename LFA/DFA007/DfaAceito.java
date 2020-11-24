package DFA007;


public class DfaAceito implements DfaState {

	
	public DfaState exibirCadeiaAceita(String s) {
		if(s.contains("00") == true) {
			System.out.println("A cadeia é aceita: " + s);
		}
		return this;
	}

	
	public DfaState exibirCadeiaNaoAceita(String s) {
		if(s.contains("007") == false) {
			System.out.println("A cadeia não é aceita: " + s);
		}
		return new DfaNaoAceito();
	}

}
