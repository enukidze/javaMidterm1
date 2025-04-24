public class task1 {
    public static void main(String[] args) {
        int[] numbers = {7, 3, 1, 4, 2};
        
        String[] strings = {"apple", "banana", "cherry", "date", "elderberry", 
                          "fig", "grape", "honeydew", "kiwi", "lemon"};
        
        String[] result = new String[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            int index = numbers[i] - 1;
            
            if (index >= 0 && index < strings.length) {
                result[i] = strings[index];
            } else {
                result[i] = "Invalid index";
            }
        }
        
        System.out.println("Original number array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
        
        System.out.println("Original string array:");
        for (String str : strings) {
            System.out.println(str);
        }
        System.out.println();
        
        System.out.println("Resulting mapped array:");
        for (int i = 0; i < result.length; i++) {
            System.out.println("For number " + numbers[i] + ": " + result[i]);
        }
    }
}


