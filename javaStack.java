import java.util.*;
class javaStack{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		Stack<String> s=new Stack<String>();
        String in=sc.next();
		for(String i:in.split("")) {
            if(i.equals("(") || i.equals("{") || i.equals("[")){
                s.push(i);
            }
            else if(i.equals(")") && s.peek().equals("(")){
                s.pop();
            }
            else if(i.equals("}") && s.peek().equals("{")){
                s.pop();
            }
            else if(i.equals("]") && s.peek().equals("[")){
                s.pop();
            }
        }
        sc.close();
        if(s.isEmpty())
            System.out.println("true");
        else
            System.out.println("false");
    }
}



