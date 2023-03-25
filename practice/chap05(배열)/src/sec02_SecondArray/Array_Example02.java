package sec02_SecondArray;

public class Array_Example02 {

	public static void main(String[] args) {
		
		int [][] score = new int [][] {
			{100, 100, 100},
		//	   00   01   02      //score[0][1]번  각각의 score[0][i]에는 과목 별 점수가 써짐
			{ 20,  20,  20},     //사용자에게 입력 받는 경우에는  국어 영어 수학 순으로 입력 받는 다.
			{ 30,  30,  30},
			{ 40,  40,  40},
			{ 50,  50,  50}
		};
		
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		int totalsum = 0;
		float averagesum = 0.0f;
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균"); //\t tab
		System.out.println("===================================================");
		
		for (int i =0 ;i<score.length; i++) {
			
			int sum = 0;
			float avg = 0.0f;
			
			korTotal += score[i][0]; 		 //국어점수 //각 배열의 첫번째수를  total에 더해 나간다 score[0][0]+score[1][0]....
									         // 과목 별 총점을 나타낸다.
			engTotal += score[i][1];  		 //영어 점수
			mathTotal += score[i][2]; 		 //수학 점수
			
			//3개의 자리를 차지하며 출력
			System.out.printf("%3d", i+1); 	//%d는 띄어쓰기 없이 쓰는거 %3d는 2칸 띄어 쓰고 3번째 자리에 쓴다.
			
			for (int j =0 ; j < score[i].length ;j++) {
				
				sum +=score[i][j];     					//내부 for문으로 각 번호별 총점을 sum에 저장한다.
				          //0  3
				          //1  3
				System.out.printf("\t%d", score[i][j]); //score[i].length를 쓰는 이유는 내부 배열의 위치를 위해서
														//score[0][i]의 점수의 합계를 나타내기 위해서
			}
			totalsum += sum; //5번째 줄의 총점의 총점을 나타내는 것
			avg = sum/(float)score[i].length; //float
			
			averagesum += avg;
			System.out.printf("\t%d \t%.2f%n", sum, avg);
			}
			averagesum /= (float)score.length;
			
			System.out.println("==========================================================");
			System.out.printf("총점\t%d\t%d\t%d\t%d\t%.2f",korTotal, engTotal, mathTotal, totalsum, averagesum);	
				
			}
			
		}

	
	

