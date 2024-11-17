public class Stringsdemo {
    public static void main(String[] args) {
        String s1="Java"; //String literal
        String s2="Java"; //String literal

        String s3=new String("Java");
        String s4=new String("JAVA");
        String s7=new String("Java is my favorite Language");


        // System.out.println("s1==s2"+(s1==s2));//== will compare the address not the value
        // System.out.println("s3==s4"+(s3==s4));//== will compare the address not the value

        char javaVar[]={'J','A','V','A'};
        String s5=new String(javaVar);
        // System.out.println("s5 "+s5);

        char s4_to_array[]=s4.toCharArray();
        for (char ch : s4_to_array) {
            // System.out.println(ch);
            
        }

        // System.out.println(s3+".equals("+s4+") "+(s3.equals(s4)));
        // System.out.println(s3+".equalsIgnorecase("+s4+") "+(s3.equalsIgnoreCase(s4)));
        // System.out.println(s3+".toUpperCase() "+(s3.toUpperCase()));
        // System.out.println(s3+".toLowerCase() "+(s3.toLowerCase()));
        // System.out.println(s3+".length() "+(s3.length()));
        // System.out.println(s3+".charAt(2) "+(s3.charAt(2)));
        // System.out.println(s3+".startsWith() "+(s3.startsWith("J")));
        // System.out.println(s3+".endsWith() "+(s3.endsWith("A")));
        // System.out.println(s3+".index('a') "+(s3.indexOf("a")));//gives the 1st occurance of the letter
        // System.out.println(s3+".index('a',2) "+(s3.indexOf("a",s3.indexOf("a")+1)));//gives the 1st occurance of the letter
        // System.out.println(s3+".lastIndexOf('a') "+(s3.lastIndexOf("a")));
        // System.out.println("s7.substring(7,) "+s7.substring(7));
        // System.out.println("s7.substring(7,13) "+s7.substring(7,13));
        // System.out.println("\"A\".compareTo(\"B\")"+"A".compareTo("B"));//ASCII of A is 65 and B is 66, 65<66 returns -1
        // System.out.println("\"B\".compareTo(\"A\")"+"B".compareTo("A"));//ASCII of B is 66 and A is 65, 66>65 returns 1
        // System.out.println("\"A\".compareTo(\"A\")"+"A".compareTo("A"));//ASCII of A is 65 and A is 65, 65==65 returns 0
        
        String s8="   Java Programming is Simple     ";
        // System.out.println("s8 "+s8);
        // System.out.println("s8.trim() "+s8.trim());//handles only whitespace of non unicode
        // System.out.println("s8.strip() "+s8.strip());
        // System.out.println("s8.stripLeading() "+s8.stripLeading());
        // System.out.println("s8.stripTrailing() "+s8.stripTrailing());

        // System.out.println("s8.replace(\"a\",\"x\")"+s8.replace("a","x"));
        // System.out.println("s8.replace(\"Java\",\"Python\")"+s8.replace("Java","Python"));
        // System.out.println("s8.contains(\"Java\")"+s8.contains("Java"));
        // System.out.println("\"\".isEmpty()"+"".isEmpty());
        // String words[]={"Good","Morning","Guru"};
        // System.out.println(String.join(" ",words));
        // System.out.println(String.valueOf(786));//converts int into String Representation

        String data="Welcome123";
        System.out.println(data.matches("[A-Za-z0-9]+"));//checking wheather the data is having lowercase alphabets and numbers
        System.out.println(s2==s3.intern());//intern() converts String object into String Literal, if content is same then it will store the value in same address
        System.out.println("Abi".codePointAt(0));
        System.out.println("Abi".codePointBefore(1));
        int i=data.codePointBefore(1);
        char ch=(char) i;
        System.out.println(ch);
        System.out.println(data.codePointCount(0, 7));
        byte b[]=data.getBytes();
        for (byte c : b) {
            System.out.println(c);
        }

        String mydata1="Java7Programming9Hello";
        String mydata2="Programming Java";
        System.out.println(mydata1.regionMatches(0, mydata2, 12, 4));
        System.out.println(mydata1.regionMatches(mydata1.indexOf("P"), mydata2, 0, "Programming".length()));

        System.out.println(mydata1.replaceAll("\\d+", ""));
        System.out.println(mydata1.replaceFirst("\\d", ""));

        String words[]=mydata1.split("\\d");
        for (String word : words) {
            System.out.println(word);
        }
        float f=3.142667f;
        System.out.println(String.format("Hello %s and his age is %d","Vishnu",20));
        System.out.println(String.format("value is %.2f",f));

//        String text="
//            Java\\n
//                Programming";
//        System.out.println(text.indent(4));
        // System.out.println(s3+".charAt() "+(s3.charAt(2)));
        // System.out.println(s3+".charAt() "+(s3.charAt(2)));
        // System.out.println(s3+".charAt() "+(s3.charAt(2)));



        
    }
    
}
