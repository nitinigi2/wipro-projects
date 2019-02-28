class Handson1{
	public static void main(String args[]){
		int arr[] = {1,4,5,7,10,19,17};
		int n = arr.length;
		int sum = 0, average;
		for(int i=0;i<n;i++)
			sum+=arr[i];
		average = sum / n;
		System.out.print("Sum: "+sum + "\nAverage: "+average);
	}
}
