package serach1;

public class Search {
	public static void main(String[] args) {
//		int arr[] = {12,3,5,4,8,89,1,5,7,5,3,1,54,58};
		int arr[] = {1,2,3,4,6,7,8,9};
		if(binsearch(arr, 5)) {
			System.out.println("����");
		}else {
			System.out.println("������");
		}
	}
	//˳�����
	public static boolean seqsearch(int[] arr, int key) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				return true;
			}
		}
		return false;
	}
	//�۰����
	public static boolean binsearch(int arr[], int key) {
		int low = 0;
		int hig = arr.length-1;
		while(low <= hig) {
			int mid = (low + hig) / 2;
			//����벿��
			if(arr[mid] > key) {
				hig = mid - 1;
			}
			//���Ұ벿��
			if(arr[mid] < key){
				low = mid + 1;
			}
			//����
			if(arr[mid] == key) {
				return true;
			}
		}
		//������
		return false;
	}	
}
