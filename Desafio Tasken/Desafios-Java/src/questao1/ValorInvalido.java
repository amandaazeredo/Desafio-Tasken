package questao1;

@SuppressWarnings("serial")
public class ValorInvalido extends Exception {

	private int num;
	
	public ValorInvalido(int num) {
		super();
		this.setNum(num);
	}
	
	@Override
	public String toString() {
		return "Número inserido inválido. O número precisa ser maior ou igual a 1.";
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}


}
