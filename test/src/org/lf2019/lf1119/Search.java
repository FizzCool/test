package org.lf2019.lf1119;

/**
 * @ClassName: Search
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2019/11/19
 */
public class Search {
    //{1,2,3,4,5,6,7,8,9}
    // 0 1 2 3 4 5 6 7 8
    public static int zheBan(int[] i, int a) {
        int min = 0;
        int max = i.length-1;
        int mid;
        int index = -1;
        while (min <= max) {
            mid = (min + max) / 2;
            if (a == i[mid]) {
                index = mid;
                break;
            }
            else if (a < i[mid]) {
                max = mid - 1;
            }
            else {
                min = mid + 1;
            }
        }

        return index;
    }

    public static int binarySearch0(int[] a, int fromIndex, int toIndex,
                                     int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }

}
