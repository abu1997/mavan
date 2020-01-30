
public class CalculateTask {

	public static void verifysumnumber(int [] a) {
		
		//int[]array= {200,100,200,300};

			for(int i=0;i<a.length;i++) {
			
				for(int j=i+1;j<a.length;j++) {
			
					if(a[i] + a[j]==500) {
						System.out.println("CONDITION IS TRUE!!!");
						
					}
			}
		}
	}
}
