import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        
        int count = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            String command;
            int value = -1;
            String[] input = sc.nextLine().split(" ");
            if (input.length == 2) {
                value = Integer.valueOf(input[1]); 
            }
            command = input[0];

            calculate(list, command, value);
        }
    }

    public static void calculate(List<Integer> list, String command, int value) {
        switch (command) {
            case "push_back": {
                list.add(value);
                break;
            }
            case "pop_back": {
                list.remove(list.size() - 1);
                break;
            }
            case "get": {
                System.out.println(list.get(value - 1));
                break;
            }
            case "size": {
                System.out.println(list.size());
                break;
            }
            default: {
                System.out.println("잘못된 명령어임.");
            }
        }
    }
}