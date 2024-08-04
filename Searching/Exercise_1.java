public class Exercise_1 {
    public static int binarySearch(int[] nums, int flag) {
        int hi_num = nums.length - 1;
        int lo_num = 0;

        System.out.println("hi_num: " + hi_num);
        System.out.println("lo_num: " + lo_num);
        System.out.println("-------------------");

        while (hi_num >= lo_num) {

            System.out.println("hi_num: " + hi_num);
            System.out.println("lo_num: " + lo_num);
            System.out.println("-------------------");

            int guess = (lo_num + hi_num) >>> 1;

            System.out.println("guess: " + guess);
            System.out.println("-------------------");

            System.out.println("flag: " + flag);
            System.out.println("-------------------");

            System.out.println("nums[guess]: " + nums[guess]);
            System.out.println("-------------------");


            if (nums[guess] > flag) {
                hi_num = guess - 1;
                System.out.println("hi_num inside condition: " + hi_num);
                System.out.println("-------------------");

            } else if (nums[guess] < flag) {
                lo_num = guess + 1;
                System.out.println("lo_num inside condition: " + lo_num);
                System.out.println("-------------------");

            } else {
                System.out.println("guess inside condition : " + guess);
                System.out.println("-------------------");

                return guess;
            }

            System.out.println("-------------------");
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 6, 7, 8, 11};
        int search_num = 7;
        int index = binarySearch(nums, search_num);
        if (index == -1) {
            System.out.println(search_num + " is not in the array");
        } else {
            System.out.println(search_num + " is at index " + index);
        }
    }
}
