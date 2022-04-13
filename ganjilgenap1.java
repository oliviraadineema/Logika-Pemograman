System.out.println("Menentukan Bilangan Ganjil-Genap");
        System.out.println("");
        System.out.println("4, 6, 1, 3, 5");
        int [] angka = {4, 6, 1, 3, 5};
        System.out.print("=> [");
        for(int a=0; a<5; a++){
            if(angka[a] %2 == 0){
                System.out.print("Genap,");
            }
            else{
                System.out.print("Ganjil,");
            }  
        }
        
        System.out.println("]");
    }
    
}