class Solution {
    public String encode(List<String> str) {
        if (str.isEmpty()) {
            return null;
        }
        String encoded_string = str.remove(0);
        encoded_string = encoded_string + ":;";
        while (!str.isEmpty()) {
            encoded_string = encoded_string + str.remove(0);
            encoded_string = encoded_string + ":;";
        }
        return encoded_string;
    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<>();
        if (str == null) {
            return decoded_strs;
        }
        int i = 0;
        String temp = "";
        while (i < str.length() - 1) {
            if (str.charAt(i) == ':' && str.charAt(i + 1) == ';') {
                decoded_strs.add(temp);
                i++;
                temp = "";
            } else {
                temp = temp + str.charAt(i);
            }
            i++;
        }
        return decoded_strs;
    }
}
