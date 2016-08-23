
public class main {

	public static void main(String[] args) {
		int[] num={1,2,3,4,5};
		int sum=0;
		int product=0;
		for(int i:num){
			sum+=i;
			product=sum*sum;
		}
		System.out.println("Total sum is= "+sum+"product is "+product);
	}

}
