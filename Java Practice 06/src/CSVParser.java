import java.util.ArrayList;
import java.util.List;

public class CSVParser {
    public List<List<String>> parse(String input) {
        List<List<String>> table = new ArrayList<>();   //rows

        StringBuilder cell = new StringBuilder();   //one cell
        List<String> cells = new ArrayList<>();     //row (list of cells)
        boolean startCell = true;
        boolean quote = false;

        for (int i = 0; i < input.length(); i++) {
            //Quotes
            if (startCell && input.charAt(i) == '\"') {
                quote = true;
                i++;
            } else if (input.charAt(i) == '\"' && i < input.length() - 1 && (input.charAt(i + 1) == ',' || input.charAt(i + 1) == '\n')) {
                quote = false;
                i++;
            }

            //Quotes at the end of the input string
            if (input.charAt(i) == '\"' && i == input.length() - 1) {
                break;
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

            } else if ((input.charAt(i) == '\"' || input.charAt(i) == ',') && quote && cell.charAt(cell.length() - 1) != '\"') {
                cell.append(input.charAt(i));       //Appending quotes, comma or enter
            } else if ((input.charAt(i) == '\n' && quote)) {
                cell.append("\n");                  //Appending '\n' symbols
            } else if (input.charAt(i) != '\"' && input.charAt(i) != ',') {
                cell.append(input.charAt(i));       //Appending new symbol
            }
        }
        cells.add(cell.toString());
        table.add(cells);

        return table;
    }
}