package arrays;

public class Simple_Array {

	public static void main(String[] args) throws Exception{
		
		int[][] a= new int[3][1];
		a[0][0]=1;
		System.out.println(a[0][0]);
		/*int[][] a = {{1,2},{3,4},{5,6,7,8,9,10,11,12}};
		System.out.println(a[2].length+" "+a);
		
		for(int i=0;i<a.length;i++) {
			System.out.print(" {");
			for(int j=0;j<a[i].length;j++) {
			
				System.out.print(a[i][j]+",");
			}System.out.print("},");
		}
		
		/*for(int i[] : a) {
			for(int j : i) {
				System.out.print(j+" ");
			}
			System.out.print("| ");
		}*/

	}

}
