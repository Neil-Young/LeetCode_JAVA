public class FindNeedleStr {
    public static void main(String[] args){
        strStr("hello","ll");
    }

    public static int strStr(String haystack, String needle){
        int count = 0;
        if (needle.length() == 0){
            count = 0;
        }else if(haystack.length() == 0 || needle.length() > haystack.length()){
            count = -1;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++){
            if (haystack.substring(i,i+needle.length()).equals(needle)){
                count = i;
                break;
            } else{
                count = -1;
            }
        }
        return count;
    }
}
