/******************************************************************************
 *  Rule13 - FIO02
 *
 ******************************************************************************/

import java.io.File; 

public class R13_FIO02_Compilable{

    public static void main(String[] args){
        File file = new File(args[0]);
        file.delete();
    }
}


