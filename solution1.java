package leetcodetest;
/*
 * �ж�һ�������Ƿ��ǻ���������������ָ���򣨴������ң��͵��򣨴������󣩶�����һ����������

ʾ�� 1:

����: 121
���: true
ʾ�� 2:

����: -121
���: false
����: �������Ҷ�, Ϊ -121 �� ���������, Ϊ 121- �����������һ����������
ʾ�� 3:

����: 10
���: false
����: ���������, Ϊ 01 �����������һ����������
 */
public class solution1 {
	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
	}
	public static boolean isPalindrome(int x) {
		int flag = x ;
		double num = 0;
		if(x < 0) {
			return false;
		}
		if(x == 0) {
			return true;
		}
		if(x > 0) {
			int[] arr = null;
			for(int i = 0; x < 10; i++) {
				arr[i] = x % 10;
				x = x / 10;
			}
			int len = arr.length - 1;
			for(int i = 0; len >= 0; i++,len--) {
				num =num + Math.pow(10, len)*arr[i];
			}
		}
		if(flag == num) {
			return true;
		}else {
			return false;
		}
    }
}
