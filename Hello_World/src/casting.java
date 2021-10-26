public class casting {
    public static void main(String[] args){
        String c = (String)"c";

        byte b = 10;

        short s = 1000;

        int i = 240;

        long l = (50_000+10)*((int)b+(int)s);

        System.out.println(l);

    }
}
