class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedStr = new StringBuilder();
        for(String str : strs){
            int length = str.length();
            encodedStr.append(length).append("#").append(str);
        }
        return encodedStr.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j)!='#') j++;
            int length = Integer.parseInt(str.substring(i,j));
            j++;
            String word = str.substring(j, j + length);
            res.add(word);
            i = j + length;

        }
        return res;
    }
}
