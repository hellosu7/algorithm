class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String t1 = str1 + str2;
        String t2 = str2 + str1;

        if(!t1.equals(t2)) return "";

        int gcd = gcd(str1.length(), str2.length());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < gcd; i++){
            sb.append(str2.charAt(i));
        }

        return sb.toString();
    }

    private int gcd(int a, int b) {
        while (b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}