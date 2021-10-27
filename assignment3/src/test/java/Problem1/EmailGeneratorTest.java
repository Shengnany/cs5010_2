package Problem1;

import Problem1.EmailGenerator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmailGeneratorTest {
    private static String arg;
    private static String arg1;
    private static String arg2;
    private static String arg3;
    @BeforeEach
    void setUp() {
        arg = "--email --email-template email-template.txt --output-dir emails --csv-file insurance-company-members.csv";
        arg1 = "--email-template email-template.txt --output-dir emails --csv-file insurance-company-members.csv";
        arg2 = "--letter --email-template email-template.txt --output-dir emails --csv-file insurance-company-members.csv";
        arg3 = "--email --email-template email-template.txt --output-dir --csv-file insurance-company-members.csv";

    }

    @Test
    void main() {
        EmailGenerator g = new EmailGenerator();
        g.main(arg.split(" "));
        g.main(arg1.split(" "));
        g.main(arg2.split(" "));
        g.main(arg3.split(" "));

    }
}