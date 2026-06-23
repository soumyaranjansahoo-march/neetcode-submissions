class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
        else{
String firstSorted="";
String secondSorted="";

char[] firstArr=s.toCharArray();
char[] secondArr=t.toCharArray();
      for(int i =0;i<firstArr.length-1;i++){
        for(int j=0;j<firstArr.length-1-i;j++){

if(firstArr[j]>firstArr[j+1]){
            char temp=firstArr[j];
            firstArr[j]=firstArr[j+1];
            firstArr[j+1]=temp;
}
        }
      }

      for(int i =0;i<secondArr.length-1;i++){
        for(int j=0;j<secondArr.length-1-i;j++){

if(secondArr[j]>secondArr[j+1]){
           char temp=secondArr[j];
            secondArr[j]=secondArr[j+1];
            secondArr[j+1]=temp;
}
        }
      }

      return new String(secondArr).equalsIgnoreCase(new String(firstArr));


        }




}

}



    

