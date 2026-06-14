class Solution {
    public boolean isAnagram(String s, String t) {

char[] firstCharArr= s.toCharArray();
char[] secondCharArr = t.toCharArray();

Arrays.sort(firstCharArr);
Arrays.sort(secondCharArr);
        

        return String.valueOf(firstCharArr).equalsIgnoreCase(String.valueOf((secondCharArr)));
}

}



    

