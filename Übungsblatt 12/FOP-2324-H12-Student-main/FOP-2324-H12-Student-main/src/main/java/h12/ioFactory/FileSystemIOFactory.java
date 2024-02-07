package h12.ioFactory;

import org.tudalgo.algoutils.student.Student;

import java.io.*;

import static org.tudalgo.algoutils.student.Student.crash;

/**
 * An Implementation of {@link IOFactory} for the Filesystem
 */
public class FileSystemIOFactory implements IOFactory{

    @Override
    public boolean supportsReader() {
        // TODO
        return crash();
    }

    @Override
    public BufferedReader createReader(final String ioName) throws FileNotFoundException {
        // TODO
        return crash();
    }

    @Override
    public boolean supportsWriter() {
        // TODO
        return crash();
    }

    @Override
    public BufferedWriter createWriter(final String ioName) throws IOException {
        // TODO
        return crash();
    }
}
