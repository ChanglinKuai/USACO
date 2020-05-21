public class BinarySearch {
    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }

        }
//        for (int i = 0; i < arr.length; i++) {
//            if (target < arr[i]) {
//                return i;
//            } else if (target > arr[arr.length - 1]){
//                return arr.length;
//            }
//        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int idx1 = binarySearch(arr, 7);
        //int idx2 = binarySearch(arr, 14);
        System.out.println(idx1);
        //System.out.println(idx2);
    }
}
