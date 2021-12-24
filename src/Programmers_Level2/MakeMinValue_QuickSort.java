package Programmers_Level2;
//�ּҰ� �����(������)
public class MakeMinValue_QuickSort {

	public static void main(String[] args) {
		int arr1[] = { 1, 4, 2 };
		int arr2[] = { 5, 4, 4 };
		int result = solution(arr1, arr2);
		System.out.println("arr1�� arr2���� ���� �Ѱ��� ���ڸ� �̾� �� ���� ���� �ּ� ������ : " + result);
	}

	//�ּҰ� ���ϴ� �޼���
	public static int solution(int[] A, int[] B) {
		int answer = 0;
		int length = A.length;
		
		//ù��° �迭�� �������� ����
		A = QuickSort(A, 0, length-1, true);

		//�ι�° �迭�� �������� ����
		B = QuickSort(B, 0, length-1, false);

		// ù��° �������� ���� Ȯ�� �ڵ�
		CheckSort(A);
		// �ι�° �������� ���� Ȯ�� �ڵ�
		CheckSort(B);

		// �� ��Ҹ� ���� ���� answer�� ����
		for (int i = 0; i < length; i++) {
			answer += A[i] * B[i];
		}

		return answer;
	}

	//���ĵ� �迭 Ȯ���� ���� ���
	public static void CheckSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	//������ �޼���
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
