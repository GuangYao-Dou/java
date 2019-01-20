package sort2;

public class QuickSort {
	public static void main(String[] args) {
		int [] arr = {9,8,7,6,54,4,3,2,1,0};
		sort(arr, 0, arr.length-1);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
	}
//	public static void quicksort(int[] arr,int low,int hig) {
//		int temp = arr[0];
//		low = 0;
//		hig = arr.length -1;
//		while(low < hig) {
//			while(arr[hig] <= temp && low < hig) {
//				hig--;
//			}
//			while(arr[low] >= temp && low < hig) {
//				low--;
//			}
//			if(low < hig) {
//				int t = arr[low];
//				arr[low] = arr[hig];
//				arr[hig] = t;
//			}
//		}
//		arr[0] = arr[low];
//		arr[low] = temp;
//		quicksort(arr,0,hig-1);
//		quicksort(arr, low+1, hig);
//	}
	  public static void QuickSort(int[] arr, int low, int high){
	        int i,j,temp,t;
	        if(low>high){
	            return;
	        }
	        i=low;
	        j=high;
	        //temp���ǻ�׼λ
	        temp = arr[low];
	 
	        while (i<j) {
	            //�ȿ��ұߣ���������ݼ�
	            while (temp<=arr[j]&&i<j) {
	                j--;
	            }
	            //�ٿ���ߣ��������ҵ���
	            while (temp>=arr[i]&&i<j) {
	                i++;
	            }
	            //������������򽻻�
	            if (i<j) {
	                t = arr[j];
	                arr[j] = arr[i];
	                arr[i] = t;
	            }
	 
	        }
	        //��󽫻�׼Ϊ��i��j���λ�õ����ֽ���
	         arr[low] = arr[i];
	         arr[i] = temp;
	        //�ݹ�����������
	         QuickSort(arr, low, j-1);
	        //�ݹ�����Ұ�����
	         QuickSort(arr, j+1, high);
	    }
	  public static void sort(int[] arr, int low , int hig) {
		  //�ж��Ƿ�Ӧ�ü���
		  if(low > hig) {
			  return;
		  }
		  int temp = arr[low];
		  int i = low;
		  int j = hig;
		  //�ж��Ƿ�����
		  while(i < j) {
			  //�������������С�ڻ�׼������
			  while(i < j && temp <= arr[j]) {
				  j--;
			  }
			  //�������ұ����Ҵ��ڻ�׼������
			  while(i < j && temp >= arr[i]) {
				  i++;
			  }
			  //���û��������ô�ͽ��ҳ������������н���
			  if(i < j) {
				  int temp2 = arr[i];
				  arr[i] = arr[j];
				  arr[j] = temp2;
			  }
		  }
		  //�����󣬽���׼��������λ�õ������н���
		  arr[low] = arr[j];
		  arr[j] = temp;
		  //����߼����ݹ�
		  sort(arr,low,i-1);
		  //���ұ߼����ݹ�
		  sort(arr,i+1,hig);
	  }
	}