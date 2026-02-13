import java.sql.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Integer a = 128;
//        Integer b = 128;
//        System.out.println(a == b);


        List<Integer> arr = Arrays.asList(1, 3, 4, 5, 7, 4, 3, 7, 84, 34, 2, 4);

        Map<Integer, Long> test = arr.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(test);


        List<Map.Entry<Integer, Long>> arr2 = arr.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1).toList();

//        System.out.println(arr2);

        Enum Medium;
        Enum High;
        Enum Low;
        List<Employee> employees = List.of(
                new Employee("hnv", "df", 42342344.43),
                new Employee("tyh", "dfvc", 2324324.2),
                new Employee("erg", "ghfgb", 4232.43),
                new Employee("fg", "hjhyg", 43322.234));

        Map<SalarayRange, List<Employee>> ans1 = employees.stream()
                .collect(Collectors.groupingBy(e -> {
                    if (e.getSalary() < 50000) return SalarayRange.Low;
                    if (e.getSalary() < 100000) return SalarayRange.Medium;
                    else return SalarayRange.High;
                }));
//                .entrySet().stream()
//                .;
//        System.out.println(ans1);

        int[] arr3 = {1, 2, 3, 4, 6, 7};
//        reverseOne(arr3);
//        leftRotateByN(arr3, 2);


        leftRotate(arr3, 4);
//        System.out.println();
//        System.out.println(Arrays.toString(arr3));

        String str = "swiss";

        rightRotate(arr3, 2);
        System.out.println(arr3);

    }

    private static void rightRotate(int[] arr, int n) {

        int size= arr.length;
        reverseRight(arr, n, size-1);
        reverseRight(arr, n, 0);
        reverseRight(arr, 0, 0);



    }

    private static void reverseRight(int[] arr, int l, int r) {

        while (l < r) {
            int temp = arr[r];
            arr[r] = arr[l];
            arr[l] = temp;

            l++;
            r--;
        }
    }


//    Find the first non-repeating character
//
//    Input: "swiss"
//    Output: 'w'


    private static void reverseOne(int[] arr) {

        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
    }


    private static void leftRotate(int[] arr, int r) {
        int n = arr.length;
        r = r % n;

        reversefnc(arr, 0, r - 1);
        reversefnc(arr, r, n - 1);
        reversefnc(arr, 0, n - 1);
    }

    private static void reversefnc(int[] arr, int l, int r) {
        int temp = 0;


        while (l < r) {

            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }


    private static void leftRotateByN(int[] arr, int r) {


        int[] temp = new int[r];
        for (int i = 0; i < r; i++) {
            temp[i] = arr[i];
        }
        System.out.println(Arrays.toString(temp));
        for (int i = r; i < arr.length; i++) {
            arr[i - r] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        int x = 0;
        for (int j = arr.length - r; j < arr.length; j++) {
            arr[j] = temp[x];
            x++;
        }
    }


}