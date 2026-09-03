class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char x:s.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        boolean flag=true;
        for(int i=0;i<s.length();i++){
              if(s.charAt(i)=='['){
                  if(map.get('[')!=map.get(']')){
                     flag=false;
                  }
              }
              if(s.charAt(i)=='{'){
                  if(map.get('{')!=map.get('}')){
                     flag=false;
                  }
              }
              if(s.charAt(i)=='('){
                  if(map.get('(')!=map.get(')')){
                     flag=false;
                  }
              }
        }
        return flag;
    }
}
