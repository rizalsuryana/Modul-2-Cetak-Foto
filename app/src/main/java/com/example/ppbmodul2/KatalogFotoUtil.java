package com.example.ppbmodul2;

import java.util.ArrayList;
import java.util.List;

public class KatalogFotoUtil {
    private static int[] ridArray = {
            R.drawable.me,
            R.drawable.ji,
            R.drawable.ku,
            R.drawable.hi,
            R.drawable.bi,
    };

    private  static String[] filenameArray ={
            "Frame Foto 1",
            "Frame Foto 2",
            "Frame Foto 3",
            "Frame Foto 4",
            "Frame Foto 5",
    };

    private static List<KatalogFoto> katalogFotoList;

    public static void init(){
        katalogFotoList = new ArrayList<>();
        int nArray = ridArray.length;
        for(int i=0;i<nArray;i++){
            katalogFotoList.add(new KatalogFoto(ridArray[i], filenameArray[i]));
        }
    }
    public static List<KatalogFoto> getKatalogFotoList(){
        return katalogFotoList;
    }
    public static KatalogFoto getKatalogFotoAt(int i){
        return katalogFotoList.get(i);
    }
}
