class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
        else{

        char[] firstChar=s.toCharArray();

        char[] secondChar=t.toCharArray();
Arrays.sort(firstChar);
 Arrays.sort(secondChar);
        String firstSorted = String.valueOf(firstChar);

        String secondSorted = String.valueOf( secondChar);

        return firstSorted.equalsIgnoreCase(secondSorted);



        }




}

}



    

