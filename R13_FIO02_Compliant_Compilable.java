/******************************************************************************
 *  Rule13 - FIO02
 *  Compliant
 ******************************************************************************/

import java.io.File; 

public class R13_FIO02_Compliant_Compilable{

    public static void main(String[] args){
        File file = new File("file");
        if (!file.delete()) {
          System.out.println("Deletion failed");
        }
    }
}


