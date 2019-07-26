import org.junit.Test;

import java.io.File;
import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;

public  class RecentFile {

    private static String file;
    @Test
    public void recentFile() {
        ArrayListAdder.AddFull();
        ArrayListAdder.AddFull2();
        file = "file17";
        FileAdder.addRecent(file);
        assertEquals(FileAdder.recentfile, FileAdder.recentfile2);
        //el objeto esperado es el dinamico , el segundo es estatico por ende tiene que ser modificado en la clase ArrayListAdder


   }



}