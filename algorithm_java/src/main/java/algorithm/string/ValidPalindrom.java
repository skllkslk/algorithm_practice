package algorithm.string;
/**
 * 주어진 문자열이 팰린드롬인지 확인하기. 대소문자 구분 x, 영숫자만을 대상으로 한다.
 * [입력] "Do geese see God?"
 * [출력] true
 * */
public class ValidPalindrom {

  public static boolean isPalindrome(String s) {
    int start = 0;
    int end = s.length() - 1;
    //서로 중앙 이동 -> 겹치는 지점 도달하면 종료
    while (start < end) {
      if (!Character.isLetterOrDigit(s.charAt(start))) {
        start++;
      } else if (!Character.isLetterOrDigit((s.charAt(end)))) {
        end--;
      } else {
        if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
          return false;
        }
        // 시작 문자는 한칸 뒤로, 끝 문자는 안쪽 앞으로 이동
        start++;
        end--;
      }
    }
    return true;
  }

  public static void main(String[] args) {

    String inputStr = "baab";
    boolean result = isPalindrome(inputStr);
    System.out.println(result);

  }
}
