

//StringBuffer is mutable, with initial capacity 16,
//growable in runtime as per the string size
public class StringBufferdemo {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Codefrombasics");
        System.out.println(sb.capacity());
        System.out.println("Before adding Azure Training " + sb);
        sb.append("  Azure Training ");
        System.out.println("After adding  Azure Training " + sb);

        System.out.println("capcity " + sb.capacity());
        System.out.println("Length " + sb.length());

        sb.insert(1, "Java");
        System.out.println(sb);

        StringBuilder sbuild = new StringBuilder();
        String number = "7897897898";
        String mask = "xxxxxx$$$$";

        for (int i = 0; i < number.length(); i++) {
            char c = mask.charAt(i);
            if (c == 'x') {
                sbuild.append(c);
            } else if (c == '$') {
                sbuild.append(number.charAt(i));
            }
        }

        System.out.println(sbuild.toString());

    }

}