public class patterns0 {
    /**
     * Prints a square grid pattern
     */
    public static void pattern1(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Prints a left aligned triangle
     */
    public static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Prints a left aligned triangle of numbers
     * 
     * @param args
     */
    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /**
     * Prints left aligned triangle with numbers for rows
     * 
     * @param args
     */
    public static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    /**
     * prints inverted left aligned triangle
     * 
     * @param args
     */
    public static void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - 1 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * prints inverted left aligned triangle of column numbers
     * 
     * @param args
     */
    public static void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /**
     * prints a pyramid
     * 
     * @param args
     */
    public static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = n - i; j <= n + i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * prints inverted pyramid
     * 
     * @param args
     */
    public static void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            for (int j = n; j < 2 * n - 1 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * prints filled diamond
     * 
     * @param args
     */
    public static void pattern9(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = n - i; j < n - 1 + i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < 2 * n - 1 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * stinger pattern
     * 
     * @param args
     */
    public static void pattern10(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * prints left aligned triangle with 0 and 1
     * 
     * @param args
     */
    public static void pattern11(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((i + j) % 2 + " ");
            }
            System.out.println();
        }
    }

    /**
     * prints negative inverted pyramid with column numbers
     * 
     * @param args
     */
    public static void pattern12(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j);
            }
            for (int j = 0; j < 2 * n - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i + 1; j++) {
                System.out.print(i + 1 - j);
            }
            System.out.println();
        }
    }

    /**
     * prints left aligned triangle with count
     * 
     * @param args
     */
    public static void pattern13(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(count++);
            }
            System.out.println();
        }
    }

    /**
     * prints left aligned triangle with A-Z
     * 
     * @param args
     */
    public static void pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
    }

    /**
     * prints inverted left aligned triangle with A-Z
     * 
     * @param args
     */
    public static void pattern15(int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
    }

    /**
     * prints left aligned triangle with A-Z with letter per row
     * 
     * @param args
     */
    public static void pattern16(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + i));
            }
            System.out.println();
        }
    }

    /**
     * prints pyramid of A-Z
     * 
     * @param args
     */
    public static void pattern17(int n) {
        for (int i = 0; i < n; i++) {

            char c = 'A';
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i + 1; j++) {

                if (j <= (2 * i + 1) / 2) {
                    System.out.print(c++);
                } else {
                    System.out.print(c--);
                }
            }
            System.out.println();

        }

    }

    /**
     * prints left aligned triangle of A-Z but letters are reverse ordered
     */
    public static void pattern18(int n) {
        for (int i = 1; i <= n; i++) {
            char c = (char) ('A' + n);
            for (int j = 0; j < i; j++) {
                System.out.print((char) (c - i + j));
            }
            System.out.println();
        }
    }

    /**
     * prints negative diamond of side n
     * 
     * @param args
     */
    public static void pattern19(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * n - 2 * i - 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * prints butterfly
     * 
     * @param args
     */
    public static void pattern20(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * n - 2 - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * prints hollow square
     * 
     * @param args
     */
    public static void pattern21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * heatmap from cetre
     * 
     * @param args
     */
    public static void pattern22(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                System.out.print(Math.max(Math.abs(n - 1 - i) + 1, Math.abs(n - 1 - j) + 1));
            }
            System.out.println();
        }
    }

    /**
     * 
     * 
     * main method
     * 
     * @param args
     */
    public static void main(String[] args) {
        int n = 5;
        // pattern1(n);
        // pattern2(n);
        // pattern3(n);
        // pattern4(n);
        // pattern5(n);
        // pattern6(n);)
        // pattern7(n);
        // pattern8(n);
        // pattern9(n);
        // pattern10(n);
        // pattern11(n);
        // pattern12(n);
        // pattern13(n);
        // pattern14(n);
        // pattern15(n);
        // pattern16(n);
        // pattern17(n);
        // pattern18(n);
        // pattern19(n);
        // pattern20(n);
        // pattern21(n);
        // pattern22(n);
    }
}