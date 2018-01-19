public class Solution {
    public static void main(String[] args){

        System.out.println(puzzle(22, 11));
    }

    public static int puzzle(int i, int j) {
        if (i == j) {
            return 0;
        } else {
            return 1 + puzzle(i - 2, j - 1);
        }
    }
        /*for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 30; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        System.out.println(" ---- ---- ---- ----");
        for(int k=0; k < 5; k++){
            for(int l=0; l < 5; l++){
                System.out.print("|    ");

            }
            System.out.println();
            System.out.println(" ---- ---- ---- ----");
        }

            System.out.println(Math.ceil(2.1));
            System.out.println(Math.floor(3.99));
            System.out.println(Math.min(3.0, 2.0));
            System.out.println(Math.max(3.0, 1.0));
            System.out.println(Math.abs(-3.0));

        String s = "hello world";
        System.out.println(s.length());

        String p = "hello world";
        char result = p.charAt(5);
        System.out.println(result);
    }*/
}
