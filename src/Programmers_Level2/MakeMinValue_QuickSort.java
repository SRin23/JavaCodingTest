package Programmers_Level2;
//최소값 만들기(퀵정렬)
public class MakeMinValue_QuickSort {

	public static void main(String[] args) {
		int arr1[] = { 1, 4, 2 };
		int arr2[] = { 5, 4, 4 };
		int result = solution(arr1, arr2);
		System.out.println("arr1과 arr2에서 각각 한개의 숫자를 뽑아 두 수를 곱한 최소 누적값 : " + result);
	}

	//최소값 구하는 메서드
	public static int solution(int[] A, int[] B) {
		int answer = 0;
		int length = A.length;
		
		//첫번째 배열은 오름차순 정렬
		A = QuickSort(A, 0, length-1, true);

		//두번째 배열은 내림차순 정렬
		B = QuickSort(B, 0, length-1, false);

		// 첫번째 오름차순 정렬 확인 코드
		CheckSort(A);
		// 두번째 내림차순 정렬 확인 코드
		CheckSort(B);

		// 각 요소를 곱한 값을 answer에 저장
		for (int i = 0; i < length; i++) {
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
	
	//퀵정렬 메서드
	public static int[] QuickSort(int arr[], int left, int right, boolean ch){
        int i, j, pivot, temp;
        if(left<right){
            pivot = arr[left];
            i = left;
            j = right;
            while(i<j){
                if(ch==true){
                    while(i<right&&arr[i]<=pivot) i++;
                    while(j>left&&arr[j]>=pivot) j--;
                }else{
                    while(i<right&&arr[i]>=pivot) i++;
                while(j>left&&arr[j]<=pivot) j--;
                }
                
                if(i<j){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            arr[left] = arr[j];
            arr[j] = pivot;
            
            QuickSort(arr, left, j-1, ch);
            QuickSort(arr, j+1, right, ch);
        }
        return arr;
    }
}
