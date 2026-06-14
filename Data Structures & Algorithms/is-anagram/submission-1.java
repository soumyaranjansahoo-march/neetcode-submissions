class Solution {
    public boolean isAnagram(String s, String t) {
if(s.length()!=t.length()){
    return false;
}
else{

String sSort= s.chars().mapToObj(value->(char)value)
.sorted().map(String::valueOf).collect(Collectors.joining());

String tSort= t.chars().mapToObj(value->(char)value)
.sorted().map(String::valueOf).collect(Collectors.joining());

return sSort.equals(tSort);

}

}



    
}
