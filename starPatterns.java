
import java.util.*;
public class rough {
    public static void main(String[] args) {
    //   Scanner sc = new Scanner(System.in);




    // int  n=5;
    // for(int i=1; i<n;i++){
    //     for(int j =0; j<i; j++){
    //         System.out.print(i+" ");
    //     }System.out.println();
    // }


// ------------------ reversed pyramid ----------------------------
// ------------------ reversed pyramid ----------------------------
// ------------------ reversed pyramid ----------------------------
// ------------------ reversed pyramid ----------------------------

// -----constant-------------
        int n=5;
// -------------------------



    for(int i=n; i>0;i--){
        for(int j=0; j<=5-i;j++){
            System.out.print(" ");
        }
        for(int j=i; j>0;j--){
            System.out.print("* ");
    }
        System.out.println();
    }



    // --------Output ------

    //      * * * * *
    //       * * * *
    //        * * *
    //         * *
    //          *
      
//========================================================================================================
//========================================================================================================
//========================================================================================================




    // --------------------Right down Mirror Star Pattern--------------------
    // --------------------Right down Mirror Star Pattern--------------------
    // --------------------Right down Mirror Star Pattern--------------------
    // --------------------Right down Mirror Star Pattern--------------------

    for(int i=n; i>0;i--){
        for(int j=n; j>i; j--){
            System.out.print(" ");
        }
        for(int j=0; j<i;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    // ------------------output--------------------

    //      *****
    //       ****
    //        ***
    //         **
    //          *  



    //========================================================================================================
    //========================================================================================================
    //========================================================================================================
    


//  ---------------------- number pyramid -----------------------------
//  ---------------------- number pyramid -----------------------------
//  ---------------------- number pyramid -----------------------------
//  ---------------------- number pyramid -----------------------------



    int n=4;
    int k =0;
    for(int i=n; i>0;i--){
        for(int j=0; j<i; j++){
        System.out.print(" ");
        }
        for(int j =n;j>=i;j--){
            k+=1;
            System.out.print(k+" ");
        }System.out.println();


    }
    // ------------------output--------------------
            //     1
            //    2 3
            //   4 5 6
            //  7 8 9 10



    }
}
