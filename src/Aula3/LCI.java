package Aula3;

public class LCI implements Produto {

	@Override
	public double investir(double valor) {
		
		return valor * 1.095;
	}

}
