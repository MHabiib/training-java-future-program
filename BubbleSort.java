public class BubbleSort{
	public static void main(String []args){
		
		int [] arrayInteger = new int[args.length];
		for(int i=0;i<args.length;i++){
			arrayInteger[i]=Integer.parseInt(args[i]);
		}
		
		for(int i=0;i<arrayInteger.length;i++){
			for(int j=0;j<arrayInteger.length;j++){
				if(arrayInteger[i]<arrayInteger[j]){
					int temp;
					temp=arrayInteger[i];
					arrayInteger[i]=arrayInteger[j];
					arrayInteger[j]=temp;
				}
			}
		}for(int i=0;i<arrayInteger.length;i++){
		System.out.print(arrayInteger[i]+" ");}
		
		System.out.println();
	}
	
}