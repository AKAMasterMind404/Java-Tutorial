public class numberDatatypes {

    // **** SMALLEST ****

    // byte
    // short
    // int
    // long
    // double

    // **** LARGEST ****

    public static void main(String[] args){
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;

        int minValueOfInt = Integer.MIN_VALUE;
        int maxValueOfInt = Integer.MAX_VALUE;

        short minValueOfShort = Short.MIN_VALUE;
        short maxValueOfShort = Short.MAX_VALUE;

        long minValueOfLong = Long.MIN_VALUE;
        long maxValueOfLong = Long.MAX_VALUE;

        float minValueOfFloat = Float.MIN_VALUE;
        float maxValueOfFloat = Float.MAX_VALUE;

        double minValueOfDouble = Double.MIN_VALUE;
        double maxValueOfDouble = Double.MAX_VALUE;

        int min = -2_147_483_648;
        int max = 2_147_483_647;

        System.out.println("Min value int:"+minValueOfInt); // -2147483648
        System.out.println("Max value int:"+maxValueOfInt); // 2147483647
        System.out.print("\n");
        System.out.println("Min value short:"+minValueOfShort); // -2147483648
        System.out.println("Max value short:"+maxValueOfShort); // 2147483647
        System.out.print("\n");
        System.out.println("Min value byte:"+minByteValue); // -128
        System.out.println("Max value byte:"+maxByteValue); // 127
        System.out.print("\n");
        System.out.println("Min value long:"+minValueOfLong); // -9223372036854775808
        System.out.println("Max value long:"+maxValueOfLong); // 9223372036854775807
        System.out.print("\n");
        System.out.println("Min value float:"+minValueOfFloat); // -9223372036854775808
        System.out.println("Max value float:"+maxValueOfFloat); // 9223372036854775807
        System.out.print("\n");
        System.out.println("Min value double:"+minValueOfDouble); // -2147483648
        System.out.println("Max value double:"+maxValueOfDouble); // 2147483647

    }
}
