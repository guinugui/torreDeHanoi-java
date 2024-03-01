package application;

public class movimentoTorre {

	private String comeco;
	private String aux;
	private String fim;
	private Integer n;
	public String getComeco() {
		return comeco;
	}
	public void setComeco(String comeco) {
		this.comeco = comeco;
	}
	public String getAux() {
		return aux;
	}
	public void setAux(String aux) {
		this.aux = aux;
	}
	public String getFim() {
		return fim;
	}
	public void setFim(String fim) {
		this.fim = fim;
	}
	public Integer getN() {
		return n;
	}
	public void setN(Integer n) {
		this.n = n;
	}
	public static void movimento(String comeco, String aux, String fim, int n) {
		if(n >= 1) {
			movimento(comeco, aux, fim, n - 1);
			System.out.println("O disco " + n + " se moveu para torre " + comeco + "para a torre " + fim + " !");
			movimento(comeco, aux, fim, n - 1);
		}
	}
	
	
	
}
