import java.util.*;
class Solution{
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            }
            else if (c == '}' || c == ']' || c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (c == '}' && top != '{' || c == ']' && top != '[' || c == ')' && top != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            if(isBalanced(input))
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
		}
		sc.close();
	}
}
