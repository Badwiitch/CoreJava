package Matrix;

public class Diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		System.out.println("Lower Digonal matrix");
		lower(a);
		System.out.println();
		System.out.println("Upper Digonal matrix");

		upper(a);

	}
	
	static void lower(int a[][]) {
		int ans[][]=new int [a.length][a[0].length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(i>=j) {
					ans[i][j]=a[i][j];
				}
				else {
					ans[i][j]=0;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void upper(int a[][]) {
		int ans[][]=new int [a.length][a[0].length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(i<=j) {
					ans[i][j]=a[i][j];
				}
				else {
					ans[i][j]=0;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}

}
