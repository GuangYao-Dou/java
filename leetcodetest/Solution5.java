package leetcodetest;

//�ж�һ�������Ƿ��ǻ���������������ָ���򣨴������ң��͵��򣨴������󣩶�����һ����������
public class Solution5 {
	public static void main(String[] args) {
		System.out.println(isPalindrome(232));
	}
    public static boolean isPalindrome(int x) {
    	if(x < 0 || (x%10==0) && x!=0) {
    		return false;
    	}
    	if(x < 10) {
    		return true;
    	}
        String str = String.valueOf(x);
        final StringBuilder builder = new StringBuilder(str);
        if(builder.reverse().toString().equals(str)){
            return true;
        }
        return false;
    }
}
