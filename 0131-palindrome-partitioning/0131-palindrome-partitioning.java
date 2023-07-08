class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> l=new ArrayList<>();
        checkpal(s,0,l,new ArrayList<String>());
        return l;

        
    }

    public void checkpal(String s,int index,List<List<String>> l,List<String> m){
        if(index==s.length()){
            l.add(new ArrayList<String>(m));
            return;
        }
        for(int i=index;i<s.length();++i){
            if(isPalindrome(s,index,i)){
                m.add(s.substring(index,i+1));
                checkpal(s,i+1,l,m);
                m.remove(m.size()-1);
            }
        }
    }


    boolean isPalindrome(String s,int start,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}