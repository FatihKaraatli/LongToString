public class LongToString {
    public static void main(String[] args) {
        long ln = 10;
        String str = "";
        str = String.valueOf(ln);
          
        if(str instanceof String){
            System.out.println(str);
        }   
    }
}
