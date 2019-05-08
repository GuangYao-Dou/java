package sort2;

public class merge1 {
	public static void main(String[] args) {
		int[] arr = {56,82,6,33,101,58,23};
		System.out.println("����ǰ��");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"   ");
		}
		System.out.println();
		sort(arr);
		System.out.println("�����");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"   ");
		}
	}
	//�˷���������ã���ʡ��
	public static void sort(int[] arr) {
		int[] temp = new int[arr.length];
		sort(arr, 0, arr.length - 1, temp);
	}
	//�õݹ�ķ���ʹһ������ֽ⵽����Ϊ1�������ٵ���mege����
	private static void sort(int[] arr, int left, int right, int[] temp) {
		if(left < right) {
			int mid = (left + right)/2;
			sort(arr, left, mid, temp);
			sort(arr, mid + 1, right, temp);
			merge(arr, left, mid, right, temp);
		}
	}
	//�˺�������������������Ԫ�ص����н��кϲ�
	private static void merge(int[] arr, int left, int mid, int right, int[] temp) {
		int i = left;
		int j = mid + 1;
		int k = 0;
		while(i <= mid && j <= right) {
			if(arr[i] <= arr[j]) {
				temp[k++] = arr[i++];
			}else {
				temp[k++] = arr[j++];
			}
		}
		while(i <= mid) {
			temp[k++] = arr[i++];	
		}
		while(j <= right) {
			temp[k++] = arr[j++];
		}
		k = 0 ;
		while(left <= right) {
			arr[left++] = temp[k++];
		}
	}
} 
