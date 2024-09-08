import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            String command = "";
            int value = -1;
            String[] input = sc.nextLine().split(" ");
            if (input.length == 2) {
                value = Integer.valueOf(input[1]);
            }
            command = input[0];

            execute(command, value, list);
        }
    }

    private static void execute(String command, int value, LinkedList<Integer> list) {
    switch (command) {
        case "push_front":
            list.addFirst(value);
            break;
        case "push_back":
            list.addLast(value);
            break;
        case "pop_front":
            System.out.println(list.pollFirst());
            break;
        case "pop_back":
            System.out.println(list.pollLast());
            break;
        case "size":
            System.out.println(list.size());
            break;
        case "empty":
            System.out.println(list.isEmpty() ? 1 : 0);
            break;
        case "front":
            System.out.println(list.peekFirst());
            break;
        case "back":
            System.out.println(list.peekLast());
            break;
        default:
            System.out.println("잘못된 명령어입니다...");
            break;
    }
}
}