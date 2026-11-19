class Solution {
    public void sortIt(int[] arr) {
                // code here
                ArrayList<Integer> even = new ArrayList<>();
                ArrayList<Integer> odd = new ArrayList<>();
                for(int v:arr){
                    if(v%2==0){
                        even.add(v);
                    }else{
                        odd.add(v);
                    }
                }
                Collections.sort(even);
                Collections.sort(odd, Collections.reverseOrder());
                int idx = 0;
                for(int v:odd){
                    arr[idx++] = v;
                }
                for(int v:even){
                    arr[idx++] = v;
                }
            }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna