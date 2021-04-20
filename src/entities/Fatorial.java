package entities;

import java.math.BigInteger;

public class Fatorial {
	
	private BigInteger fatorial;

	public Fatorial() {
		
	}

	public BigInteger getFatorial() {
		return fatorial;
	}

	public BigInteger fatorialRecursivo(int num) {
		
		if(num < 0) {
			return BigInteger.ZERO;
		}
		else if(num == 0) {
			return BigInteger.ONE;
		}
		else {
			this.fatorial = BigInteger.valueOf(num);
			return fatorial.multiply(fatorialRecursivo(num - 1));
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
