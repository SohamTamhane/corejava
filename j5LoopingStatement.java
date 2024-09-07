class j5LoopingStatement{
    public static void main(String args[]){

        // --------- While Loop -----------

        int i = 0;
        while(i<5){
            System.out.println("Hello World: " + i);
            i++;
        }



        // ---------- Do While Loop ------------

        i = 0;
        do{
            System.out.println("Hello World: " + i);
        }while(i>0);



        // ---------- For Loop -------------
        for(int j=0; j<5; j++){
            System.out.println(j);
        }

    }
}