package C;
import java.util.Scanner;
import java.util.regex.*;
import java.util.Arrays;
import java.util.Arrays.*;

//�˷�����ȡ�����ַ����е�����
public class c_check {
	  public static String getNumbers(String str) { 
		  str=str.trim();
		  String str2="";
		  if(str != null && !"".equals(str)){
			  for(int i=0;i<str.length();i++){
				  if(str.charAt(i)>=48 && str.charAt(i)<=57){
				  str2+=str.charAt(i);
				  }
			  }
		  }
		  return str2;
	  }
//�˷����������ַ���ת����һ�����鷵��
	  public static int[] stringFormatInteger(String s) {
	     	int len=s.length();
	     	int[] a=new int[len];
	     	for(int i=0;i<len;i++) {
	     		a[i]=s.charAt(i)-'0';
	     	}
	     	return a;
	     }
//�˷��������ַ������ñ���ǰ������������һ�������arr2���бȽ�
	  public static boolean  checkinput(String s,int arr2[]) {//��arr2Ϊ�ж�����
		  	int arr[] = stringFormatInteger(getNumbers(s));
		  	int arr11[] = {0,0,0,0};
		  	int arr22[] = {0,0,0,0};
		  	arr11 = arr;
		  	arr22 = arr2;
		  	Arrays.sort(arr11);
		  	Arrays.sort(arr22);
		  	int flag = 0;
		  	for(int i = 0; i < 4;i++) {
					if(arr11[i] != arr22[i]) {
						flag = 1;
				}
			}
		  	if(flag == 1) {
		  		return false ;
		  	}
		  	else {
		  		return true;
		  	}
	  }
	  
	  public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.printf("�������ַ���");
//		String s = input.nextLine();
//		System.out.println(getNumbers(s));
		int arr1[] = {4,5,2,3};
		int arr2[] = {5,2,3,4};
		System.out.println(checkinput("5+*/3-*-4*4", arr2));
//		System.out.println(stringFormatInteger(getNumbers(s)));
	}
}
