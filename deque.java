    import java.util.*;
    public class deque {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<>();
            HashSet<Integer> s=new HashSet<Integer>();
            int max=Integer.MIN_VALUE;
            int n = in.nextInt();
            int m = in.nextInt();
            in.close();
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
               deque.add(num);
               s.add(num);
               if(deque.size()==m){
                   if(s.size()>max)
                   max=s.size();
                    int x=(int)deque.remove();
                    if(!deque.contains(x))
                    s.remove(x);
               }
            }
            System.out.println(max);
        }
    }




