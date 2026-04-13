class Solution {

    public String encode(List<String> strs) {
        final String EMPTY_STRING ="E";
        final String CHAR_DELIMITER = "C";
        final String STRING_DELIMITER = "S";
        if(strs.isEmpty())
        return null;
        // TODO: Implement encoding logic
        StringBuilder sb = new StringBuilder();
        for (String string : strs) {
            
            if(string.length()==0){
                sb.append(EMPTY_STRING);
            
            }
            else{
                char[] chars = string.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    sb.append((int)chars[i]).append(CHAR_DELIMITER);
                }
                sb.deleteCharAt(sb.lastIndexOf(CHAR_DELIMITER));
                
            }
            sb.append(STRING_DELIMITER);
            
        }
        sb.deleteCharAt(sb.lastIndexOf(STRING_DELIMITER));
        
        
        return sb.toString();
    }
        
     /* Decodes a single string to a list of strings.
     */
    public List<String> decode(String s) {
        final String EMPTY_STRING ="E";
        final String CHAR_DELIMITER = "C";
        final String STRING_DELIMITER = "S";
        List<String> result = new ArrayList<>();
        if(s==null)
        return result;
        String[] asciiList = s.split(STRING_DELIMITER);
        for (String string : asciiList) {
            if(string.equals(EMPTY_STRING)){
                result.add("");
            }else{
                String[] chars = string.split(CHAR_DELIMITER);
                StringBuilder builder = new StringBuilder();
                for (String string2 : chars) {
                    int intValue =Integer.parseInt(string2);
                    char charValue =(char)intValue;
                    builder.append(charValue);
                }
                result.add(builder.toString());
            }
            
        }
        // TODO: Implement decoding logic
        return result;
    }
}
