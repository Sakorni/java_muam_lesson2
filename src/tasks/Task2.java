package tasks;

public class Task2 {



        public static void complete(){
            GMatrix<Integer> m = new GMatrix<Integer>(
                    new Integer[][]{
                            new Integer[] {1,2,3},
                            new Integer[] {3,3,3},
                            new Integer[] {0,2,3},
                            new Integer[] {2,5,1},
                    }
            );
            System.out.printf("Looking for 2: %d\n",m.SearchKey(2));
            System.out.printf("Looking for 3: %d\n",m.SearchKey(3));
            System.out.printf("Looking for 1: %d\n",m.SearchKey(1));
            System.out.printf("Looking for -1: %d\n",m.SearchKey(-1));

            GMatrix<String> n = new GMatrix<String>(
                    new String[][]{
                            new String[] {"A", "B", "C"},
                            new String[] {"B", "C", "S"},
                            new String[] {"U", "Q", "W"},
                            new String[] {"X","Y",  "Z"},
                    }
            );
            System.out.printf("Looking for A: %d\n",n.SearchKey("A"));
            System.out.printf("Looking for B: %d\n",n.SearchKey("B"));
            System.out.printf("Looking for C: %d\n",n.SearchKey("C"));
            System.out.printf("Looking for X: %d\n",n.SearchKey("X"));
        }

    }


    class GMatrix<T>{

        T[][]matrix;

        public GMatrix(T[][]matrix){
            this.matrix = matrix;
        }

        /**
         * Returns count of given key in matrix
         */
        public int SearchKey(T key) {
            int count = 0;
            for (var line : matrix) {

                for (var elem : line) {
                    if (elem == key)
                        count++;
                }
            }
            return count;
        }
    }
