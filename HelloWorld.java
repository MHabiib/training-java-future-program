
	public class HelloWorld{
		public static void main(String[]args){
			System.out.println("Hello World\n\n");
			int inp=Integer.parseInt(args[0]);
			if(inp>=80){
				System.out.println("A");
			}
			else if(inp>=70){
				System.out.println("B");
			}
			else if(inp>=60){
				System.out.println("C");
			}
			else if(inp>=50){
				System.out.println("D");
			}
			else{
				System.out.println("E");
			}
			
		}
	}