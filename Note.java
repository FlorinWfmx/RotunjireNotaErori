public class RotunjireNota {
    public static void main (String[]args){

        double d1 = 5.6;
        System.out.println ("Restul impartirii notei la 1 este " + d1%1);
      
        if (d1%1 < 0.5) {
            //d1 = d1-d1%1;
            d1-=d1%1;
            System.out.println("Se face rotunjire in sens scazator la " + d1);
        }
        else {
            d1 = d1-d1%1+1;  //De ce nu sunt echivalente expresia asta si urmatoarea? Aici rezultatul e 6.0, CORECT
            //d1-=d1%1+1;      // Aici rezultatul e 4.0
            System.out.println("Se face rotunjire in sens crescator la " + d1);
        }
    }
}
