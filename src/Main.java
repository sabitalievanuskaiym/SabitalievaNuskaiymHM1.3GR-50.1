public class Main {
    private static void selectionSort(int[] massive) {

        for (int i = 0; i < massive.length; i++) {

            int min = massive[i];
            int min_i = i;

            for (int j = i + 1; j < massive.length; j++) {
                if (massive[j] < min) {
                    min = massive[j];
                    min_i = j;
                }
            }

            if (i != min_i) {
                int tmp = massive[i];
                massive[i] = massive[min_i];
                massive[min_i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {-23, -54, 86, 23, -12, 32, -98, -24, 64, -45, 11, 10, -53, 42, -12};
        int result = 0;
        int positive = 0;
        for (int a : nums) {
            if (a < 0) {
                continue;
            } else if (a >= 0) {
                positive++;
            }


            result += a;

            System.out.println(result + "/" + positive + " = " + result / positive);

        }
        int[] massive = {62, 84, 32, 5, 0, 14, 52, 82, 58, 71};
        System.out.print("\n");
        selectionSort(massive);
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + "  ");
        }
    }


}