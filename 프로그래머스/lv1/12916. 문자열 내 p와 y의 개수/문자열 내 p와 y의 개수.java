class Solution {
    boolean solution(String s) {
        int cnt = 0;
        char ch = ' ';
        
        for(int i=0; i<s.length(); i++){
            ch=s.charAt(i);
            if(ch == 'p' || ch == 'P')
                cnt++;
            else if(ch == 'y' || ch == 'Y')
                cnt--;
        }
        if(cnt != 0)
            return false;
        return true;
    }
}