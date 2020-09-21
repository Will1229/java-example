package example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TextBlockExampleTest {

    @Test
    void textBlock() {
        String text = """
                This is text with line break
                and "double quotes"
                """;
        assertThat(text).isEqualTo("This is text with line break\nand \"double quotes\"\n");


        String text2 = """
                This is text with line break\n\t and slashes /\\""";
        assertThat(text2).isEqualTo("This is text with line break\n\t and slashes /\\");


        String text3 = """
                This is a parameter %s""";
        assertThat(text3.formatted("param1")).isEqualTo("This is a parameter param1");


    }
}