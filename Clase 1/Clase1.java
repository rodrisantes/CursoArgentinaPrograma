class Clase1 {

    public static void main(String[] args) {
        int b = 20;
        int a = 10;

        
        // for (int i = 0; i < b ; i++) {
        //     while (i < b && a < i) {
        //         System.out.println(i);
        //         i++;
        //     }
        // }
        for (int i = 0; i < b ; i++) {
            while (i < b && a < i && i % 2 == 0) {
                System.out.println(i);
                i++;
            }
        }



    }

    

}