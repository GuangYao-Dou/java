package sort;

public class selectSort {

    public static void main(String[] args) {
        int arr1[] = {5,9,6,7,0,5,14,2,1};
        slectSort(arr1);
        for(int i = 0; i < arr1.length; i++) {
            System.out.println("��"+i+"�ǣ�"+arr1[i]);
        }
    }
    public static void slectSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int min = i;
            //�ҳ���С�����ĽǱ�
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j ;
                }
            }
            //����С������δ�������еĵ�һ��Ԫ�ؽ���λ��
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
                System.out.print("��"+i+"������");
    			for(int i1 = 0 ; i1 <arr.length; i1++ ) {
    				System.out.print(arr[i1]+" ");
    			}
    			System.out.println("");
        }
    }
}
