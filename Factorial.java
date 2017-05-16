package prFactorial;

public class Factorial {

	public static int calcular(int entrada) {
		int res=0;
		if(entrada == 0){
			res = 1;
		}else{
			res = entrada*calcular(entrada-1);
		}
		return res;
	}

}
