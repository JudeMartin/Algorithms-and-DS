package DS.Math;

public class AddDigits {

/*  public int addNumber(int num){ 
            int temp = 0;
            int sum = 0;
            while(num!=0){
                temp = num%10;
                sum = sum + temp;
                num=num/10;
                //temp = 0;
            }
            return sum;
        }    

    */
    
	public int addDigits(int num) {
		return (num - 1) % 9 + 1;
	}

	public static void main(String[] args) {
		AddDigits aD = new AddDigits();
		int num = 123;
		System.out.println("Before Adding the number is : " + num);
		System.out.println("Sum of " + num +" is : " + aD.addDigits(num));
	}
}
