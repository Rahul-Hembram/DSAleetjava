class Solution {
    public int minFlips(String s) {
        // Code here

        //Since there are only 2 possibilities - 1010101010 ,0101010101

        //0101010101
        int count1 = 0;
        boolean flag1 = false;
        int i = 0;
        while(i<s.length()){
            if(flag1 == false && s.charAt(i) != '0'){
                count1++;

            }
            else if(flag1 == true && s.charAt(i) != '1'){
                count1++;
            }
            flag1 = !flag1;
            i++;
        }

        //1010101010
        int count2 = 0;
        boolean flag2 = true;
        int j = 0;
        while(j<s.length()){
            if(flag2 == true && s.charAt(j) != '1'){
                count2++;

            }
            else if(flag2 == false && s.charAt(j) != '0'){
                count2++;

            }
            flag2 = !flag2;
            j++;
        }


        return Math.min(count1,count2);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna