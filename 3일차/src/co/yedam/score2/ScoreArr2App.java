package co.yedam.score2;

public class ScoreArr2App {
	//2차원배열
				  // k  e  m
	int[][] arr = {{100,90,80},
				   {10,20,30},
				   {50,50,50},
				   {30,30,30}};

	void print() {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++ ) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	//해당 학생의 과목 수 
	int getSbjCnt(int no) {
		return score.arr[no].length;
	}
	
	//입력한 번호의 한 학생의 총점
	int stdTotal(int no) {
		int result = 0;
		for (int k = 0; k < arr[no].length; k++) {
			result += arr[no][k]; // +arr[no][1]+arr[no][2];
		}
		return result;
	}
	
}