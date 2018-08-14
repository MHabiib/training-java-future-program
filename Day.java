
	public class Day{
		public static void main(String[]args){
			
			int tahun=Integer.parseInt(args[0]);
			int bulan=Integer.parseInt(args[1]);
			
			
			switch(bulan){
			case 1: System.out.println("31 Hari");break;	
			case 2: if(tahun%400==0 || tahun%4==0 || tahun%100==0)
					{
						System.out.println("29 Hari");
					}
					else	
					{
						System.out.println("28 Hari");
					}
					break;	
			case 3: System.out.println("31 Hari");break;	
			case 4: System.out.println("30 Hari");break;	
			case 5: System.out.println("31 Hari");break;	
			case 6: System.out.println("30 Hari");break;	
			case 7: System.out.println("31 Hari");break;	
			case 8: System.out.println("31 Hari");break;	
			case 9: System.out.println("30 Hari");break;	
			case 10: System.out.println("31 Hari");break;	
			case 11: System.out.println("30 Hari");break;	
			case 12: System.out.println("31 Hari");break;	
						}
					}			
						
		}