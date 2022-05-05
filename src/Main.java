public class Main {

    public static void main(String[] args) {
        int[] values = {
                3, 0, 0, 0, 0, 2, 0, 0, 0, 4, 5
        };

        for (int i = 0; i < values.length; i++) {
            int currentValue = values[i];
            if (currentValue == 0 && i < values.length -1) {
                processSwap(values, i, currentValue);
            }
        }

        for (int value : values) {
            System.out.println(value);
        }
    }

    private static void processSwap(int[] values, int i, int currentValue) {
        int nextValue = values[i + 1];
        if (nextValue == 0) {
            processSwapWithNextZero(values, i, currentValue);
        } else {
            values[i] = nextValue;
            values[i + 1] = currentValue;
        }
    }

    private static void processSwapWithNextZero(int[] values, int i, int currentValue) {
        for (int counter = 2; counter + i < values.length; counter++) {
            int totalCounter = counter + i;
            int next = values[totalCounter];
            if (next != 0) {
                values[i] = next;
                values[totalCounter] = currentValue;
                return;
            }
        }
    }
}
