package sort3;


public class HeapSort{
	public static void main(String[] args) {
		long start = System.nanoTime();
		int[] arr = {55,3,21,58,9,101,43,19,27};
		System.out.println("����ǰ��");
		for(int i = 0; i < arr.length; i ++) {
			System.out.print(arr[i]+"  ");
		}
		heapSort(arr);
		System.out.println("\n�����:");
		for(int i = 0; i < arr.length; i ++) {
			System.out.print(arr[i]+"  ");
		}
		long end = System.nanoTime();
		System.out.println("\n������ʱ��"+(end - start)+"ns");
	}
	public static void heapSort(int[] arr) {
		//�����������г�ʼ���ɶ�
		for(int i = arr.length / 2; i >= 0; i--) {
			HeapAdjust(arr, i, arr.length-1);
		}
		//��ʼ����
		for(int i = arr.length - 1, temp = 0; i > 0; i--) {
			temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			HeapAdjust(arr, 0, i);
		}
	}
	//�Զѽ��е���
	public static void HeapAdjust(int[] arr, int parent, int len) {
		//��¼���ڵ��ֵ
		int temp = arr[parent];
		//Ѱ�����ӽڵ�
		int child = 2 * parent + 1;
		while(child < len) {
			//�����Ӻ��Һ��ӽڵ���ѡȡ�ϴ��
			if(child + 1 < len && arr[child+1] > arr[child]) {
				child ++;
			}
			//������ڵ�����������ӽڵ㣬���ý���
			if(arr[parent] > arr[child]) {
				break;
			}
			//�����ڵ���ϴ���ӽڵ���н���
			arr[parent] = arr[child];
			parent = child;
			child = 2 * child + 1;
		}
		arr[parent] = temp;
	}
	
}