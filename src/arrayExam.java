import java.util.Arrays;

public class arrayExam {
	public static void main(String[] args) {
		int[][] array2 = new int[3][4];
		// int는 배열의 data type이 정수형이라는 것을 선언한다
		// [][]는 2차원 배열을 생성한다
		// array2는 새로 만들어진 2차원 배열의 배열명이다
		// new는 1차원 배열과 마찬가지로 배열을 생성할 때에 필요한 keyword이다
		// int[3][4]는 배열이 int형 피연산자를 3*4 크기의 판에 받는다는 표시이다
// 배열에 값을 때에는 배열의 세로 가로 index를 사용하면 된다
		array2[0][1] = 10;
		System.out.println(array2[0][1]);
		// 2차원 배열을 생성할 때에는 크기가 같은 배열 뿐만 아니라 배열의 크기가 다른 것도 생성할 수 있다
		int[][] array3 = new int[3][];
		array3[0] = new int[1];
		array3[1] = new int[2];
		array3[2] = new int[3];
		// 세로의 0 index에는 1차원 배열 index 한개짜리 생성
		// 세로의 1 index에는 1차원 배열 index 두개짜리 생성
		// 세로의 2 index에는 1차원 배열 index 세개짜리 생성
		int[][] array4 = {{1}, {1, 2}, {1, 2, 3}};
		// 2차원 배열 array4를 생성과 동시에 값을 담은 것이다
		System.out.println(array4[0][0]);
		// 0번 index
		System.out.println(array4[1][0]);
		// 1번 index
		System.out.println(array4[1][1]);
		// 1번 index
		System.out.println(array4[2][0]);
		// 2번 index
		System.out.println(array4[2][1]);
		// 2번 index
		System.out.println(array4[2][2]);
		// 2번 index
	}
}
