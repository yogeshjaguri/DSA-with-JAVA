package recursion2;

public class TowerOfhanoi {

    public static void towerOfHanoi(int disks, char source, char destination, char auxiliary) {
        // Write your code here
        if (disks > 0) {

            towerOfHanoi(disks - 1, source, auxiliary, destination);
            System.out.println(source + " " + auxiliary);
            towerOfHanoi(disks - 1, destination, source, auxiliary);
        }
    }

    public static void main(String[] args) {
        towerOfHanoi(3, 'a', 'b', 'c');
    }

}
