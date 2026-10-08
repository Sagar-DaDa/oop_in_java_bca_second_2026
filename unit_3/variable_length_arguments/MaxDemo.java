class MaxDemo {

    static int max(int... numbers) {
        int max = numbers[0];

        for (int n : numbers) {
            if (n > max) {
                max = n;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(max(10, 20, 30, 40, 50));
    }
}