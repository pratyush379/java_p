package strings;

public class Str1 {
    public static void main(String[] args){
        String  str = "A/BXVC5678NH/9086/BNK/  /";
        String[] arr = str.split("/");
        for(String str1 : arr){
            System.out.println(str1);
        }
    }
}
