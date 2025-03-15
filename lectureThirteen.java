public class lectureThirteen {
    public static void main(String[] args) {
        //String builder in Java 
        StringBuilder sb = new StringBuilder("Tony");

        //Methods with stringbuilder 
        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'P');
        System.out.println(sb);

        sb.insert(2, "n");
        System.out.println(sb);

        sb.delete(2, 4);
        System.out.println(sb);

        sb.append("y");
        System.out.println(sb);

        System.out.println(sb.length());

        //Reverse a string using string builder
        StringBuilder name = new StringBuilder("rahul");

        for(int i=0; i<name.length()/2; i++){
            int start = i ;
            int end = name.length()-1-i;

            char fc = name.charAt(start);
            char lc = name.charAt(end);

            name.setCharAt(start, lc);
            name.setCharAt(end, fc);
        }
        System.out.println(name);
    }
}
