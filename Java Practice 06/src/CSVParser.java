import java.util.ArrayList;
import java.util.List;

public class CSVParser {
    /*
    public List<List<String>> parse(String input) {
        List<List<String>> table = new ArrayList<>();   //rows

        StringBuilder cell = new StringBuilder();   //one cell
        List<String> cells = new ArrayList<>();     //row (list of cells)

        for (int i = 0; i < input.length(); i++) {

            //New row
            if (input.charAt(i) == '\n') {
                cells.add(cell.toString());
                cell = new StringBuilder();
                table.add(cells);
                cells = new ArrayList<>();

            } else if (input.charAt(i) == ',') {    //New cell
                cells.add(cell.toString());
                cell = new StringBuilder();

            } else {                                //Appending new symbol
                cell.append(input.charAt(i));
            }
        }
        cells.add(cell.toString());
        table.add(cells);

        return table;
    }

    */

    public List<List<String>> parse(String input) {
        List<List<String>> table = new ArrayList<>();   //rows

        StringBuilder cell = new StringBuilder();   //one cell
        List<String> cells = new ArrayList<>();     //row (list of cells)
        boolean startCell = true;
        boolean quote = false;

        for (int i = 0; i < input.length(); i++) {
            //Quotes
            if (input.charAt(i) == '\"' && input.charAt(i + 1) == '\"') {
                i++;
                if (i >= input.length()) {
                    break;
                }
            }
            if (startCell && input.charAt(i) == '\"') {
                quote = true;
                i++;
            } else if (input.charAt(i) == '\"' && i < input.length() - 1 && (input.charAt(i + 1) == ',' || input.charAt(i + 1) == '\n')) {
                quote = false;
                i++;
            }

            startCell = false;

            //New row
            if (input.charAt(i) == '\n' && !quote) {
                cells.add(cell.toString());
                cell = new StringBuilder();
                startCell = true;
                table.add(cells);
                cells = new ArrayList<>();

            } else if (input.charAt(i) == ',' && !quote) {    //New cell
                cells.add(cell.toString());
                cell = new StringBuilder();
                startCell = true;

            } else if ((input.charAt(i) == '\"' || input.charAt(i) == ',') && quote) {
                cell.append(input.charAt(i));       //Appending quotes, comma or enter
            } else if ((input.charAt(i) == '\n' && quote)) {
                cell.append("\n");
            } else if (input.charAt(i) != '\"' && input.charAt(i) != ',') {
                cell.append(input.charAt(i));       //Appending new symbol
            }
        }
        cells.add(cell.toString());
        table.add(cells);

        return table;
    }
}