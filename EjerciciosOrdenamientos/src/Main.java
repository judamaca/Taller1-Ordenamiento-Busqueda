//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] myArray = {70, 12, 19, 45, 11, 33, 26};
        MisAlgoritmos misAlgoritmos = new MisAlgoritmos();

        misAlgoritmos.bubbleSort(myArray);
        for (int num: myArray) {
            System.out.println(num + " ");
        }
    }
}
