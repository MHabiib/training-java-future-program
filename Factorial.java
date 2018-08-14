public class Factorial{
		public static void main(String[]args){
			
			int inp=Integer.parseInt(args[0]);
			
			if(inp<0){
				System.out.println("Mohon Masukkan Angka Faktorial > 0");
			}
			else{
				int sum=1;
				for(int i=inp;i>0;i--){
					sum*=i;
				}
				System.out.println(sum);
			}
			
		}
}