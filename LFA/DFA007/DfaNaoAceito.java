package DFA007;

public class DfaNaoAceito implements DfaState {
		
	public DfaState exibirCadeiaAceita(String s) {
		if(s.contains("007") == true) {
			System.out.println("A cadeia � aceita: " + s);
		}
		return new DfaAceito();
	}

	public DfaState exibirCadeiaNaoAceita(String s) {
		if(s.contains("00") == false) {
			System.out.println("A cadeia n�o � aceita: " + s);
		}
		return this;
	}
}
