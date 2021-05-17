/**  Lab 3, COMP160, 2020  */
import java.util.Scanner;
public class Letter{
    private static int junior = 22000;    // standard pay rate for Junior employee
    private static int intermediate = 40000; // standard pay rate for Intermediate employee
    private static int senior = 75000;    // standard pay rate for Senior employee
   
    public static void main(String [] args){
        jobOffer();
        jobOffer("Chief Cook");
        jobOffer("Sous Chef");
        
    } // end method
   
    /** displays a job offer for Bottle Washer at $22K */
    public static void jobOffer(){
        System.out.println("Dear applicant\nI wish to offer you the position of Bottle Washer.\nThe pay rate will be $22000 per annum.");
        signature();
    } // end method
    
    /**second job offer**/
    public static void jobOffer (String jobTitle){ System.out.println("Dear applicant\nI wish to offer you the position of " +
    jobTitle + ".\nThe pay rate will be $22000 per annum.");
    signature(); } // end method

    /**Third job offer**/
    public static void jobOffer (String jobTitle, int payRate){ System.out.println("Dear applicant\nI wish to offer you the position of " +
    jobTitle + ".\nThe pay rate will be $ 22000 per annum.");
    } //end method
   
    /** displays signature */
    public static void signature(){
        String yours = "Yours sincerely";
        String sign = "Mr Albert Agnew Esq.\nHuman Resources Manager\nButtery Baps Unlimited\nwww.bb.co.nz";
        System.out.println("\n" + yours + "\n" + sign + "\n");
    }
   
} // end class