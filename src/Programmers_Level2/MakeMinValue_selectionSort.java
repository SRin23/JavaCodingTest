package Programmers_Level2;
//�ּҰ� �����(��������)
public class MakeMinValue_SelectionSort {

	public static void main(String[] args) {
		int arr1[] = { 1, 4, 2 };
		int arr2[] = { 5, 4, 4 };
		int result = solution(arr1, arr2);
		System.out.println("arr1�� arr2���� ���� �Ѱ��� ���ڸ� �̾� �� ���� ���� �ּ� ������ : " + result);
	}

	//�ּҰ� ���ϴ� �޼���
	public static int solution(int[] A, int[] B) {
		int answer = 0;
		//ù��° �迭�� �������� ����
		A = SelectionSort(A, false);

		//�ι�° �迭�� �������� ����
		B = SelectionSort(B, true);

		// ù��° �������� ���� Ȯ�� �ڵ�
		CheckSort(B);
		// �ι�° �������� ���� Ȯ�� �ڵ�
		CheckSort(A);

		// �� ��Ҹ� ���� ���� answer�� ����
		for (int i = 0; i < A.length; i++) {
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
	
	//�������� �޼���
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
