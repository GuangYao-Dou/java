package sort;

public class InsertSort {

	public static void main(String[] args) {
		int[] arr = {9,5,7,11,13,2,55,1};
		for(int i1 = 0 ; i1 <arr.length; i1++ ) {
			System.out.print(arr[i1]+" ");
		}
		System.out.println("");
		inSort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.println("��"+i+"����"+arr[i]);
		}
	}
	//�ӵڶ�����ʼ
	//���ֳ��Ѿ������δ����Ĳ���
	//ѡ��δ�����еĵ�һ��Ԫ��
	//���Ѿ�����Ĳ��ִӺ���ǰ�Ƚ���С��������õ�������
	//�������Ѿ����ź����ĳ�����ڸ����ĺ������
	public static void inSort(int arr[]) {
		for(int i = 1 ; i < arr.length; i++) {
			//arr[i]��δ�������еĵ�һ��Ԫ��
			int temp = arr[i];
			//arr[j]���Ѿ�����õ����е����һ�� 
			for(int j = i - 1; j >= 0; j-- ) {
				//�������һ��Ԫ�أ���ô���뵽���ĺ���
				if(temp > arr[j]) {
					arr[j+1] = temp;
					break;
				}
				//���arr[i]С�����źõ����һ�������Ѿ��źõ����к���һλ
				if(temp < arr[j]) {
					arr[j+1] = arr[j];
				}
				//���Աȵ�����ĵ�0��Ԫ��ʱ��˵�����Լ�������С��
				if(j == 0) {
					arr[0] = temp;
					break;
				}
			}
			System.out.print("��"+i+"������");
			for(int i1 = 0 ; i1 <arr.length; i1++ ) {
				System.out.print(arr[i1]+" ");
			}
			System.out.println("");
		}
	}
}
