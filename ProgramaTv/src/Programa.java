
public class Programa {
	private String nome;
	private String data;
	private String horario;
	private boolean onAir;
	private String descricao;
	private String genero;
	private int classificacaoIndicativa;
	private boolean lembrete;
	private boolean gravado;
	public Programa(String nome, String data, String horario, boolean onAir, String descricao, String genero,
			int classificacaoIndicativa, boolean lembrete, boolean gravado) {
		super();
		this.nome = nome;
		this.data = data;
		this.horario = horario;
		this.onAir = onAir;
		this.descricao = descricao;
		this.genero = genero;
		this.classificacaoIndicativa = classificacaoIndicativa;
		this.lembrete = lembrete;
		this.gravado = gravado;
	}
	
	@Override
	public String toString() {
		return "Programa nome=" + nome + ", data=" + data + ", horario=" + horario + ", onAir=" + onAir
				+ ", descricao=" + descricao + ", genero=" + genero + ", classificacaoIndicativa="
				+ classificacaoIndicativa + ", lembrete=" + lembrete + ", gravado=" + gravado;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public boolean isOnAir() {
		return onAir;
	}
	public void setOnAir(boolean onAir) {
		this.onAir = onAir;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getClassificacaoIndicativa() {
		return classificacaoIndicativa;
	}
	public void setClassificacaoIndicativa(int classificacaoIndicativa) {
		this.classificacaoIndicativa = classificacaoIndicativa;
	}
	public boolean isLembrete() {
		return lembrete;
	}
	public void setLembrete(boolean lembrete) {
		this.lembrete = lembrete;
	}
	public boolean isGravado() {
		return gravado;
	}
	public void setGravado(boolean gravado) {
		this.gravado = gravado;
	}
	
}
