package htmlEditor;

import javax.swing.filechooser.FileFilter;
import java.io.File;
import java.util.Locale;

public class HTMLFileFilter extends FileFilter {

    @Override
    public boolean accept(File f) {
        String fileName = f.getName().toLowerCase(Locale.ROOT);
        String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
        if (f.isDirectory() || suffix.equals("html") || suffix.equals("htm")) return true;
        return false;
    }

    @Override
    public String getDescription() {
        return "HTML и HTM файлы";
    }
}

