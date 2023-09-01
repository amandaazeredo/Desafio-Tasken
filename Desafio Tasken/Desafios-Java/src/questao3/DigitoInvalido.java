package questao3;

@SuppressWarnings("serial")
public class DigitoInvalido extends Exception {

private int num;
	
	public DigitoInvalido(int num) {
		super();
		this.setNum(num);
	}
	
	@Override
	public String toString() {
		return "Número inserido inválido. O número precisa ser positivo";
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}


}
