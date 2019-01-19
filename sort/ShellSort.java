package sort;

public class ShellSort {
	public static void main(String[] args) {
		int arr[] = {2,5,85,1,11,3,0,110};
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "   ");
		}
		System.out.println();
		ShellSort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "   ");
		}
	}
	public static void shellSort(int[] arr) {
        int j = 0;
        int temp = 0;
        for (int increment = arr.length / 2; increment > 0; increment /= 2) {
            System.out.println("increment:" + increment);
            for (int i = increment; i < arr.length; i++) {
                temp = arr[i];
                for (j = i - increment; j >= 0; j -= increment) {
                    if (temp < arr[j]) {
                        arr[j + increment] = arr[j];
                    } else {
                        break;
                    }
                }
                arr[j + increment] = temp;
            }
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + "   ");
            System.out.println("");
        }
    }
	public static void ShellSort(int[] arr) {
		int L = arr.length;
		while(true) {
			L = L / 2;
			//arr[i]��һ�����еĵ�һ��Ԫ��
			for(int i = 0; i < L; i++) {
				//arr[j]��������ȷ����Ԫ��
				for(int j = i + L; j < arr.length; j = j+L) {
					int temp = arr[j];//temp��δ����ĵ�һ��Ԫ�أ�һ�����еĵ�1��Ԫ�أ���0��Ϊ����ģ�
					//���¿�ʼ��������
					for(int k = j - L; k >= 0; k = k -L ) {
						if(temp > arr[k]) {
							arr[k+L] = temp;
							break;
						}
						if(temp < arr[k]) {
							arr[k+L] = arr[k];
						}
						if(k == i) {
							arr[i] = temp;
							break;
						}
					}
				}
			}
			//���������С��1��������ɣ��˳�whileѭ��
			if(L == 1) {
				break;
			}
		}
	}
}
