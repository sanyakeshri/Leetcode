// 500. Keyboard Row

class Solution {
    public String[] findWords(String[] words) {

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        java.util.ArrayList<String> result = new java.util.ArrayList<>();

        for (String word : words) {

            String w = word.toLowerCase();

            boolean r1 = true;
            boolean r2 = true;
            boolean r3 = true;

            for (char c : w.toCharArray()) {

                if (row1.indexOf(c) == -1)
                    r1 = false;

                if (row2.indexOf(c) == -1)
                    r2 = false;

                if (row3.indexOf(c) == -1)
                    r3 = false;
            }

            if (r1 || r2 || r3) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }
}