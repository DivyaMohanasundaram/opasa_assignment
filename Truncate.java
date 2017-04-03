public class Truncate {

    public static final String replacement_string = " ... (truncated) ... ";
    public static final int replacement_string_length = replacement_string.length();

    public static String truncate(String orderDetails, int count) {
        if (orderDetails != null) {
            int oderdetails_length = orderDetails.length();

            if (oderdetails_length <= count || count <= replacement_string_length) {
                return orderDetails;
            } else {
                int delta = count - replacement_string_length;
                int prefix = delta / 2;
                int suffix = delta - prefix;
                return orderDetails.substring(0, prefix) + replacement_string +
                        orderDetails.substring(oderdetails_length - suffix, oderdetails_length);


            }
        } else
            return "";
    }

    public static void main(String[] args) {

        System.out.println(Truncate.truncate("123456789012345678901234567890", 31));
        System.out.println(Truncate.truncate("1234567890123456789012345678901", 31));
        System.out.println(Truncate.truncate("1234567890123456789012345678901", 30));
        System.out.println(Truncate.truncate("1234567890", 5));
        System.out.println(Truncate.truncate("123", 50));
        System.out.println(Truncate.truncate("123456789012345678901234567890", 25));
        System.out.println(Truncate.truncate("123456789012345678901234567890", 26));


    }
}

