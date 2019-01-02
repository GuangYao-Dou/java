package S;
/**
 * ����ѧ�����ַ������ʽ����ѧ���ʽ�����
 * ��DijkStra��˫ջ�������ʽ��ֵ�㷨p80
 */
import java.util.Stack;

public class Dijk {
    public static void main(String[] args) {
        System.out.println(DijkStra("(-6)+1"));
//        (1+((2+3)*(4*5)))
//        (-6)+1
    }

    public static double DijkStra (String str) {

        //����������ջ
        Stack<Character> ops = new Stack<>();
        //����������ջ
        Stack<Double> nums = new Stack<>();
        for (int i = 0 ; i < str.length(); i++) {
            char s = str.charAt(i);
            switch (s) {
                //����������
                case '(':
                    break;
                // + �� - �� * ������sqrt ��Щ��������ѹ��ջ
                case '+':
                    ops.push(s);
                    break;
                case '-':
                    ops.push(s);
                    break;
                case '*':
                    ops.push(s);
                    break;
                case '/':
                    ops.push(s);
                    break;
                case ')':
                    //����������ʱ�����ݴӲ�����ջ��ȡ�������������Ӳ�����ջ��ȡ����Ӧ�����������м��㣬����������ѹ�������ջ
                    char op = ops.pop();
                    Double num = nums.pop();
                    switch (op) {
                        case '+':
                            num = num + nums.pop();
                            break;
                        case '-':
                            num = num - nums.pop();
                            break;
                        case '*':
                            num = num * nums.pop();
                            break;
                        case '/':
                            num = num / nums.pop();
                            break;
                    }
                    nums.push(num);
                    break;
                default:
                    nums.push(Double.parseDouble(Character.toString(s)));//������ѹ�������ջ��
                    break;
            }
        }
        return nums.pop();
    }
}
