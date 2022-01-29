
public class Matrix {

	public static void main(String [] args){
		
	int a[][]= {{1,3,4},{2,4,3},{3,4,5}};
	int b[][]= {{1,3,4},{2,4,3},{1,2,4}};
	
	int c[][]= new int[3][3];
	int d[][]= new int[3][3];
	
	System.out.println("Addition of Matrix");
	
	for(int i=0; i<3; i++){
		for(int j=0; j<3; j++){
			c[i][j]= a[i][j]+b[i][j];
		
			System.out.print(c[i][j]+" ");
		}
		System.out.println();	
	}
	
	System.out.println("Multiplication of Matrix");
	
		for(int k=0; k<3; k++){
			for(int l=0; l<3; l++){
				d[k][l]= a[k][l]*b[k][l];
			
				System.out.print(d[k][l]+" ");
			}
		System.out.println();	
	}
	}
}
