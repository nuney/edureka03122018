package day2;

public class GreatestofThree {

	public static void main(String[] args) {
		

		int firstNumber, secondNumber, thirdNumber;
			
			firstNumber = 99;
			
			secondNumber = 90;
			
			thirdNumber = 99;
			if((firstNumber> secondNumber) && (firstNumber> thirdNumber)){
				System.out.println("firstNumber is greatest");
			} else if((secondNumber> firstNumber)&& (secondNumber> thirdNumber)){
					System.out.println("second Number is greatest");
			} else if((thirdNumber> firstNumber)&& (thirdNumber> secondNumber)) {
					System.out.println("third Number is great");
			}else if ((firstNumber== secondNumber) && (firstNumber>thirdNumber)) {
				System.out.println("firstNumber & second number  greatest than third");
			}else if ((firstNumber== thirdNumber) && (firstNumber>secondNumber)) {
					System.out.println("firstNumber & third number  greatest than second");
			}else if ((thirdNumber== secondNumber) && (thirdNumber>firstNumber)) {
				System.out.println("third & second number  are greatest than first");
			
			}
			
			else {
					System.out.println("All are equal");	
				
				}
	}

}
