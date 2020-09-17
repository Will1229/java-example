package example.textblock;

import org.intellij.lang.annotations.Language;

public class TextBlockExample {

    @Language("HTML")
    String htmlOldWay = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "    " +
            "<body>\n" +
            "        " +
            "<h2>HTML Buttons</h2>\n" +
            "        " +
            "<p>HTML buttons are defined with the button tag:</p>\n" +
            "        " +
            "<button>Click me</button>\n" +
            "    " +
            "</body>\n" +
            "</html>\n";

    @Language("HTML")
    String htmlInTextBlock = """
            <!DOCTYPE html>
            <html>
                <body>
                    <h2>HTML Buttons</h2>
                    <p>HTML buttons are defined with the button tag:</p>
                    <button>Click me</button>
                </body>
            </html>
            """;

    @Language("Json")
    String jsonOldWay = "{\n" +
            "  \"name\": \"John\",\n" +
            "  \"age\": 30,\n" +
            "  \"car\": null\n" +
            "}\n";

    @Language("Json")
    String jsonInTextBlock = """
            {
              "name": "John",
              "age": 30,
              "car": null
            }
            """;

    @Language("Oracle")
    String sqlOldWay = "SELECT column_name(S)\n" +
            "FROM TABLE1\n" +
            "         " +
            "INNER JOIN TABLE2\n" +
            "                    " +
            "ON TABLE1.COLUMN_NAME = TABLE2.COLUMN_NAME;";

    @Language("Oracle")
    String sqlInTextBlock = """
            SELECT column_name(S)
            FROM TABLE1
                     INNER JOIN TABLE2
                                ON TABLE1.COLUMN_NAME = TABLE2.COLUMN_NAME;  
            """;
}
