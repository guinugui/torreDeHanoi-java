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

	public static void movimento(int n, char comeco, char aux, char fim) {
		if (n > 0) {
			movimento(n - 1, comeco, fim, aux);
			System.out.println("O disco " + n + " se moveu da torre " + comeco + " para a torre " + fim + " !");
			movimento(n - 1, aux, comeco, fim);
		}
	}

}
