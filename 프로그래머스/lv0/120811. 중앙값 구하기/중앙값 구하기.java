import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int center = 0;
        Arrays.sort(array);
        center = array[array.length/2];
        return center;
    }
}