package miniTeste;

/* Sistema para cadastrar e definir uma estrutura que organiza uma prefeitura, focando na secretaria, onde vão cadastrar
 * os secretários e suas respectivas secretarias.*/
 

public class FachadaPrefeitura {
	private Map<Integer, Secretario> secretarios;
	private int maxIdSecretario = 0;
	private int maxIdSecretaria = 0;
	
	
	public int cadastrarSecretario (String nome) {
		Secretario secretario = criarSecretario(nome);
		secretarios.put(++maxIdSecretario, secretario);
		return maxIdSecretario;
	}
	
	protected Secretario criarSecretario(String nome) {
		return new Secretario(nome);
	}
	
	public int cadastrarSecretaria (int IdSecretario, String nomeSecretaria) {
		Secretario secretario = secretarios.get(IdSecretario);
		Secretaria secretaria = criarSecretaria(nomeSecretaria);
		secretario.adicionarSecretaria(++maxIdSecretaria, Secretaria);
		return maxIdSecretaria;
		
	}
	
	protected Secretaria criarSecretaria(String nomeSecretaria) {
		return new Secretaria(nomeSecretaria);
	}
	
	______________________________________________________________________________________________________________
	
	
	public class FachadaPrefeituraExtra extends FachadaPrefeitura() {
		@Overide
		private int maxSubSecretario = 0;
		private int maxSecretarioExtra = 0;
		
		
		protected Secretaria criarSecretariaExtra (String nomeSE) {
			return new SecretariaExtra (nomeSE);
			
		}
		
		public int cadastrarSubSecretario (int IdSecretario, int IdSecretaria, String nomeSubSE) {
			Secretario secretario = secretarios.get(IdSecretario);
			SecretariaExtra secretariaextra = (SecretariaExtra) secretario.get(IdSecretaria);
			SubSecretario subsecretario = new SubSecretario(nomeSubSE);
			secretariaextra.adicionarSubSecretario (++maxIdSubSecretario, subSecretario);
			return maxIdSubSecretario;
		}
	}
	
	
	
}
