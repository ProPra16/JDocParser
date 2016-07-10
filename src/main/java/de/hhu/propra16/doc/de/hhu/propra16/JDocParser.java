package de.hhu.propra16.doc.de.hhu.propra16;

import de.hhu.propra16.doc.JavaDoc;

/**
 * Created by Tobias Witt on 10.07.16.
 */
public class JDocParser {
    public static void main(String[] args) {
        JavaDoc javaDoc = parseJDoc(
                "/**\n" +
                " * This is the title\n" +
                " *\n" +
                " * This is the body of the comment. It might span across\n" +
                " * multiple lines and even include links: {@link String},  to  other classes\n"  +
                " * that contain an at-sign.\n" +
                " *\n" +
                " * @param argument1\n" +
                " * @param argument2\n" +
                " *\n" +
                " * @return A valid return value\n" +
                " */");

        System.out.println("Titel: " + javaDoc.title);
        System.out.println();
        System.out.println("Beschreibung: " + javaDoc.body);
        System.out.println();
        System.out.println("Parameter:");
        javaDoc.params.forEach(System.out::println);
        System.out.println();
        System.out.println("Rückgabewert: " + javaDoc.returnValue);
    }

    private static JavaDoc parseJDoc(String s) {
    }
}
