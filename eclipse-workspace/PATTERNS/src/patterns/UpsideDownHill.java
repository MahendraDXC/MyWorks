package patterns;

public class UpsideDownHill {

	public static void main(String[] args) {
		int i=0,j=10,k=0;
        for(i=0;i<10;i++) {
        	for(j=10;j>i;j--) {
        		k++;
        		System.out.print(k+" \t");	
        	}
        	System.out.println("");
        }

	}

}
