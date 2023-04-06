import java.util.*;

public class StudentSorter implements Runnable {
    private String[] names;
    private int[] ages;

    public StudentSorter(String[] names, int[] ages) {
        this.names = names;
        this.ages = ages;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000); // wait for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sortDescending(); // sort the names and ages in descending order
            System.out.println(Arrays.toString(names));
            System.out.println(Arrays.toString(ages));
        }
    }

    private void sortDescending() {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(names[i], ages[i]); // create a map of names and ages
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue()); // sort in descending order based on age
            }
        });
        for (int i = 0; i < 10; i++) {
            Map.Entry<String, Integer> entry = list.get(i);
            names[i] = entry.getKey(); // update the sorted names array
            ages[i] = entry.getValue(); // update the sorted ages array
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[10];
        int[] ages = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name of student " + (i+1) + ": ");
            names[i] = scanner.next();
            System.out.print("Enter age of student " + (i+1) + ": ");
            ages[i] = scanner.nextInt();
        }
        StudentSorter sorter = new StudentSorter(names, ages);
        Thread thread = new Thread(sorter);
        thread.start();
    }
}
