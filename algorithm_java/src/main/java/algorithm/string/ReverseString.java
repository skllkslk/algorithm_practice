package algorithm.string;
/**
 * 문자열을 뒤집는 함수를 작성. 입력값: 문자 배열
 * 리턴없이 문자 배열 내부를 직접 조작하기
 * [입력] ["r", "a", "c", "e", "c", "a", "r"]
 * */
public class ReverseString {

  public static void reverseString(char[] s) {
    int start = 0;
    int end = s.length - 1;

    while (start < end) {
      char temp = s[end];
      s[start] = s[end];
      s[end] = temp;
      start++;
      end--;
    }

  }

  public static void main(String[] args) {

    char[] input = {'a', 'b', 'c', 'e', 'c', 'a', 'r'};
    reverseString(input);
    for (char s : input) {
      System.out.println(s);
    }

  }

}
