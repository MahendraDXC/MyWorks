package patterns;

public class Upsidedownhill1 {

	public static void main(String[] args) {
		int i=0,j=0,k=0,h=0;
		for(i=1;i<=20;i++) {
			for(j=1;j<=20-i;j++){
				System.out.print("\t");
			}
			for(k=1;k<=i;k++) 
			{
				h++;
				System.out.print(h+"\t");
			}System.out.println();
		}
	}
		
	}


