package Problem1;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class contains a main method that is used to automate the process for the company to communicate with customers
 */
public class EmailGenerator {
    private static int NOT_SPECIFIED = 0;
    private static int EMAIL = 1;
    private static int LETTER = 2;
    private static int ARGLENTH = 7;
    private static String USAGE = " Usage:\n" +
            "        --email    only generate email messages         " +
            "        --email-template <file>  accepts a filename that holds the email template. " +
            "Required if --email is used\n" +
            "        --letter   only generate letters" +
            "        --letter-template <file> accepts a filename that holds the email template. " +
            "Required if --letter is used\n" +
            "        --output-dir <path> accepts the name of a folder, " +
            "all output is placed in this folder\n" +
            "        --csv-file <path> accepts the name of the csv file to process\n" +
            "Examples:       \n" +
            "--email --email-template email-template.txt --output-dir emails --csv-file customer.csv \n" +
            "--letter --letter-template letter-template.txt --output-dir letters --csv-file customer.csv";

    /**
     * This main method is used to generate email and templates given the input csv.
     * @param args the options
     */
    public static void main(String[] args) {
        try {
            Path currentRelativePath = Paths.get("");
            String s = currentRelativePath.toAbsolutePath().toString();
            System.out.println("Current absolute path is: " + s);
            if (args.length != ARGLENTH) {
                throw new IllegalInputExeception("Incorrect");
            }
            String template = null;
            String outputDir = null;
            String fileName = null;
            int type = NOT_SPECIFIED;
            for (int i = 0; i < args.length; i++) {
                args[i] = args[i].trim();
                if ("--email".equals(args[i])) {
                    if (type == NOT_SPECIFIED) {
                        type = EMAIL;
                    } else {
                        throw new IllegalInputExeception("Can only provide one argument to specify leter or email to generatte");
                    }
                } else if ("--letter".equals(args[i])) {
                    if (type == NOT_SPECIFIED) {
                        type = LETTER;
                    } else {
                        throw new IllegalInputExeception("Can only provide one argument to specify leter or email to generatte");
                    }
                }
            }
            for (int i = 0; i < args.length; i++) {
                if ("--email-template".equals(args[i])) {
                    if (i < args.length - 1) {
                        if (type == EMAIL) {
                            template = args[i + 1];
                        } else {
                            throw new IllegalInputExeception("Inoorect template");
                        }
                    } else {
                        throw new IllegalInputExeception("Must provide file name after the argument \"--email-template\" ");
                    }
                }
                if ("--letter-template".equals(args[i])) {
                    if (i < args.length - 1) {
                        if (type == LETTER) {
                            template = args[i + 1];
                        } else {
                            throw new IllegalInputExeception("Inoorect template");
                        }
                    } else {
                        throw new IllegalInputExeception("Must provide file name after the argument \"--letter-template\" ");
                    }
                } else if ("--csv-file".equals(args[i])) {
                    if (i < args.length - 1 && !args[i + 1].startsWith("--")) {
                        fileName = args[i + 1];
                    } else {
                        throw new IllegalInputExeception("Must provide file name after the argument \"--csv-file\" ");
                    }
                } else if ("--output-dir".equals(args[i])) {
                    if (i < args.length - 1 && !args[i + 1].startsWith("--")) {
                        outputDir = args[i + 1];
                    } else {
                        throw new IllegalInputExeception("Must provide file name after the argument \"---output-dir\" ");
                    }
                }
            }
            if (template == null || outputDir == null || fileName == null) {
                throw new IllegalInputExeception("Please provide all information");
            }
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            int lineCount = 1;
            Map<String, Integer> title = new HashMap<>();
            List<Map<Integer, String>> table = new ArrayList<>();
            while (true) {
                line = br.readLine();
                if(line==null){
                    System.out.println("d");
                    break;
                }
                if (lineCount == 1) {
                    String[] t = line.split(",");
                    for (int i = 0; i < t.length; i++) {
                        title.put(t[i].substring(1, t[i].length() - 1), i);
                    }

                } else {
                    String[] t = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
                    Map<Integer, String> rowPairs = new HashMap<Integer, String>();
                    for (int i = 0; i < t.length; i++) {
                        rowPairs.put(i, t[i].substring(1, t[i].length() - 1));
                    }
                    table.add(rowPairs);
                }
                lineCount++;
            }
            File outputFolder = new File(outputDir);
            boolean mkdir = outputFolder.mkdir();
            System.out.println(mkdir);
           line = null;
            for (int i = 0; i < lineCount - 1; i++) {
                String outputName = "output" + i + ".txt";
                File outputFile = new File(outputDir, outputName);
                BufferedWriter fw = new BufferedWriter(new FileWriter(outputFile));
                br = new BufferedReader(new FileReader(template));
                String regreplace = "\\[\\[\\w+]]";
                Pattern compile1 = Pattern.compile(regreplace);
                while ((line = br.readLine()) != null) {
                    Matcher matcher1 = compile1.matcher(line);
                    StringBuffer newLine = new StringBuffer();
                    while (matcher1.find()) {
                        String tp = matcher1.group(0).substring(2, matcher1.group(0).length() - 2);
                        if(table.get(i).containsKey(title.get(tp))){
                            matcher1.appendReplacement(newLine, table.get(i).get(title.get(tp)));
                        }
                        else {
                            throw new IllegalInputExeception("We do not have the template for the key word: "+tp);
                        }
                    }
                    matcher1.appendTail(newLine);
                    fw.write(newLine.toString());
                    fw.newLine();
                }

                br.close();
                fw.close();
            }
        } catch (IllegalInputExeception e2) {
            System.out.println("Error: " + e2.getMessage());
            System.out.println(USAGE);
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }
    }
}


