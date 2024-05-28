public class Buffer1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("INDIA ");
        sb.append("is country");
        sb.insert(8, " my");
        // System.out.println(sb.capacity());
        // sb.append("is a big country ");
        // System.out.println(sb);
        // sb.append("Live Long ");
        // sb.deleteCharAt(3);
        System.out.println(sb);
    }
}
