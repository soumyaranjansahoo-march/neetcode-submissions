class Solution {
    public boolean isAnagram(String s, String t) {

char[] firstCharArr= s.toCharArray();
char[] secondCharArr = t.toCharArray();

        for(int i=0;i<secondCharArr.length-1;i++){
            for(int j=0;j<secondCharArr.length-1-i;j++){

if(secondCharArr[j]>secondCharArr[j+1]){
                char temp=secondCharArr[j];
                secondCharArr[j]=secondCharArr[j+1];
                secondCharArr[j+1]=temp;

            }}

        }

        for(int i=0;i<firstCharArr.length-1;i++){
            for(int j=0;j<firstCharArr.length-1-i;j++){
if(firstCharArr[j]>firstCharArr[j+1]){
                char temp=firstCharArr[j];
                firstCharArr[j]=firstCharArr[j+1];
                firstCharArr[j+1]=temp;
}
            }

        }

        return String.valueOf(firstCharArr).equalsIgnoreCase(String.valueOf((secondCharArr)));
}

}



    

