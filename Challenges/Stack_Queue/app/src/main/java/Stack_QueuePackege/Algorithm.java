package Stack_QueuePackege;

public class Algorithm {
//    String[] openBrackets = new String[]{"{([<"};
//    String[] closedBrackets = new String[]{"}])>"};

    public boolean correctBrackets(String brackets){
        Stack<Character> s = new Stack<>();
        char x;

        for (int i = 0; i < brackets.length(); i++)
        {
            if (brackets.charAt(i) == '(' || brackets.charAt(i)== '['
                    || brackets.charAt(i) == '{')
            {
                s.push(brackets.charAt(i));
                continue;
            }
            if (s.isEmpty()) {
                return false;
            }

            switch (brackets.charAt(i)) {
                case ')':
                    x = s.peek();
                    s.pop();
                    if (x == '{' || x == '[')
                        return false;
                    break;

                case '}':
                    x = s.peek();
                    s.pop();
                    if (x == '(' || x == '[')
                        return false;
                    break;

                case ']':
                    x = s.peek();
                    s.pop();
                    if (x == '(' || x == '{')
                        return false;
                    break;
            }
        }

        return (s.isEmpty());
    }


}
