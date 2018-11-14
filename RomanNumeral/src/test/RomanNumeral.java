package test;

public class RomanNumeral {

	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int isComplete() {
		int valor = 0;
		int valortotal = 0;
		for (int i = 0; i < number.length(); i++) {
			switch (number) {
			case "I":
				valor += 1;
				break;
			case "V":
				valor += 5;
				break;
			case "X":
				valor += 10;
				break;
			case "L":
				valor += 50;
				break;
			case "C":
				valor += 100;
				break;
			case "D":
				valor += 500;
				break;
			case "M":
				valor += 1000;
				break;
			default:
			}
		}
		int soma = 0;
		for(int i = 0; i < number.length(); i++) {
		char teste = number.charAt(i);
		char drteste = i < number.length() - 1 ? number.charAt(i + 1) : ' ';
		if(teste == 'I' && drteste == 'V') {
			valortotal +=4;
		} else if(teste == 'I' && drteste == 'X') {
			valortotal += 9;
		}else if(teste == 'X' && drteste == 'L') {
			valortotal +=50;
		}else if(teste =='X' && drteste == 'C') {
			valortotal += 90;
		}else if(teste =='C' && drteste == 'D') {
			valortotal +=400;
		}else if(teste == 'C' && drteste == 'M') {
			valortotal+=900;
		}
		}
		soma += valor+valortotal;
		return soma;
	}
}
