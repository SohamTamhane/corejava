public class j7Array{
    public static void main(String args[]){

        // ------------ 1D Array ----------------

        int arr1[] = {10, 20, 30, 40};
        arr1[0] = 31;
        System.out.println(arr1[0]);

        // {0,0,0,0,0}
        int arr2[] = new int[5];
        for(int i=0; i<5; i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println();


        // ------------ 2D Array -------------
        // [rows][cols]
        int arr3[][] = new int[3][4];

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                arr3[i][j] = (int)(Math.random() * 10);
            }
        }

        System.out.println("2D Array: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


        // For Each Loop
        for(int n[]: arr3){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }


        // Jagged Array
        int arr4[][] = new int[3][];
        
        arr4[0] = new int[3];
        arr4[1] = new int[2];
        arr4[2] = new int[4];

        System.out.println("Jagged Array");
        for(int i=0; i<arr4.length; i++){
            for(int j=0; j<arr4[i].length; j++){
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
    }
}