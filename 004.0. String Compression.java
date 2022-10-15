
class Solution {
    public int compress(char[] chars) {
      
        int idx = 0; // to form the resultant char array
      
        int i = 0;
        while(i < chars.length){
            int j = i + 1;
            // get to the last occurance of repeating character
            while(j < chars.length && chars[i] == chars[j])
                j++;
            
            chars[idx++] = chars[i]; // place the current charcter
            
            // if count of repeating character is greater than 1 add the freq to the resultant char array
            if(j - i > 1){
                String count = j - i + "";
                for(Character c : count.toCharArray())
                    chars[idx++] = c;
            }
            
            // update i to the next character
            i = j;
        }
        
        return idx; // length of the res char array
    }
}
