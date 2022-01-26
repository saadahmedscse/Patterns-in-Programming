public class Patterns {

    public static class Rectangle{
        public static void Rectangle(int row, int column){
            for (int i=0; i<row; i++){
                for (int j=0; j<column; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void HollowRectangle(int row, int column){
            for (int i=0; i<row; i++){
                for (int j=0; j<column; j++){
                    if (i==0 || j==0 || i==row-1 || j==column-1){
                        System.out.print("*");
                    }
                    else System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

    public static class Pyramid{
        public static void HalfPyramid(int row){
            for (int i=1; i<=row; i++){
                for (int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void HalfPyramidRotation180(int row){
            for (int i=1; i<=row; i++){
                for (int j=1; j<=row-i; j++){
                    System.out.print(" ");
                }
                for (int k=1; k<=i; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void InvertedHalfPyramid(int row){
            for (int i=row; i>=1; i--){
                for (int j=0; j<i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void FullPyramid(int row){
            int temp = 1;
            for (int i=1; i<=row; i++){
                for (int j=row; j>i; j--){
                    System.out.print(" ");
                }
                for (int j=1; j<=temp; j++){
                    System.out.print("*");
                }
                temp += 2;
                System.out.println();
            }
        }

        public static void InvertedFullPyramid(int row){
            int temp = (row*2) - 1;

            for (int i=1; i<=row; i++){
                for (int j=1; j<i; j++){
                    System.out.print(" ");
                }
                for (int j=1; j<=temp; j++){
                    System.out.print("*");
                }
                temp-=2;
                System.out.println();
            }
        }
    }

    public static class Star{
        public static void StarSpaced(int row){
            for (int i=1; i<=row; i++){
                for (int j=1; j<=row-i; j++){
                    System.out.print(" ");
                }

                for (int j=1; j<=i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }

            for (int i=1; i<=row; i++){
                for (int j=1; j<=i; j++){
                    System.out.print(" ");
                }
                for (int j=row; j>i; j--){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        public static void Star(int row){
            int temp = 1;
            int invTemp = (row * 2)-3;

            for (int i=1; i<=row; i++){
                for (int j=row; j>i; j--){
                    System.out.print(" ");
                }

                for (int j=1; j<=temp; j++){
                    System.out.print("*");
                }
                temp+=2;
                System.out.println();
            }

            for (int i=1; i<=row; i++){
                for (int j=1; j<=i; j++){
                    System.out.print(" ");
                }

                for (int j=1; j<=invTemp; j++){
                    System.out.print("*");
                }
                invTemp-=2;
                System.out.println();
            }
        }
    }

    public static class Rhombus{

        public static void Rhombus(int row){
            for (int i=1; i<=row; i++){
                for (int j=row; j>i; j--){
                    System.out.print(" ");
                }

                for (int j=1; j<=row; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void MirrorRhombus(int row){
            for (int i=1; i<=row; i++){
                for (int j=1; j<i; j++){
                    System.out.print(" ");
                }

                for (int j=1; j<=row; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void HollowRhombus(int row){
            for (int i=1; i<=row; i++){
                for (int j=row; j>i; j--){
                    System.out.print(" ");
                }

                for (int j=1; j<=row; j++){
                    if (i==1 || i==row || j==1 || j==row){
                        System.out.print("*");
                    } else System.out.print(" ");
                }
                System.out.println();
            }
        }

        public static void MirrorHollowRhombus(int row){
            for (int i=1; i<=row; i++){
                for (int j=1; j<i; j++){
                    System.out.print(" ");
                }

                for (int j=1; j<=row; j++){
                    if (i==1 || i==row || j==1 || j==row){
                        System.out.print("*");
                    } else System.out.print(" ");
                }
                System.out.println();
            }
        }

    }
}
