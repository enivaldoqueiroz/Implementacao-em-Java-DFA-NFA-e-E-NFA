package DFA007;



public class DfaNovo implements DfaState {
	
	public DfaState exibirCadeiaAceita(String s) {
		if(s.contains("007") == true) {
			System.out.println("A cadeia é aceita: " + s);
		}else {
			System.out.println("A cadeia não é aceita: " + s);
		}
		return new DfaAceito();
	}

	
	public DfaState exibirCadeiaNaoAceita(String s) {
		if(s.contains("007") == false) {
			System.out.println("A cadeia não é aceita: " + s);
		}else {
			System.out.println("A cadeia é aceita: " + s);
		}
		return new DfaNaoAceito();
	}
}
