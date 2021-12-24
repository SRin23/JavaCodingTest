package Programmers_Level2;
//최소값 만들기(선택정렬)
public class MakeMinValue_SelectionSort {

	public static void main(String[] args) {
		int arr1[] = { 1, 4, 2 };
		int arr2[] = { 5, 4, 4 };
		int result = solution(arr1, arr2);
		System.out.println("arr1과 arr2에서 각각 한개의 숫자를 뽑아 두 수를 곱한 최소 누적값 : " + result);
	}

	//최소값 구하는 메서드
	public static int solution(int[] A, int[] B) {
		int answer = 0;
		//첫번째 배열은 오름차순 정렬
		A = SelectionSort(A, false);

		//두번째 배열은 내림차순 정렬
		B = SelectionSort(B, true);

		// 첫번째 오름차순 정렬 확인 코드
		CheckSort(B);
		// 두번째 내림차순 정렬 확인 코드
		CheckSort(A);

		// 각 요소를 곱한 값을 answer에 저장
		for (int i = 0; i < A.length; i++) {
			answer += A[i] * B[i];
		}

		return answer;
	}

	//정렬된 배열 확인을 위한 출력
	public static void CheckSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	//선택정렬 메서드
	public static int[] SelectionSort(int[] arr, boolean arrCh) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arrCh==true) {
					if (arr[i] < arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}else {
					if (arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
				
			}
		}
		return arr;
	}
}
