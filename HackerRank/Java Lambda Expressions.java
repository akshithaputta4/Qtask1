 public PerformOperation isOdd() {
        return num -> num % 2 != 0;
    }

    public PerformOperation isPrime() {
        return num -> {
            if (num <= 1) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        };
    }

    public PerformOperation isPalindrome() {
        return number -> {
            String original = String.valueOf(number);
            String reversed = new StringBuilder(original).reverse().toString();
            return original.equals(reversed);
        };
    }
}
