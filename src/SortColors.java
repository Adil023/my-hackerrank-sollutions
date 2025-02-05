public class SortColors {

    public  void sortColors(int[] colors) {
        int current = 0;
        int left = 0;
        int right = colors.length - 1;

        while (current <= right) {
            if (colors[current] == 2) {
                int temp = colors[right];
                colors[right] = colors[current];
                colors[current] = temp;
                right--;
            } else if (colors[current] == 0) {
                int temp = colors[left];
                colors[left] = colors[current];
                colors[current] = temp;
                left++;
                current++;
            } else {
                current++;
            }
        }
    }
}
