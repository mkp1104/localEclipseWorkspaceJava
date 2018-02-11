import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;


public class CSVReaderWithHeaderAutoDetection {
    private static final String SAMPLE_CSV_FILE_PATH = "./train.csv";

    public static void main(String[] args) throws IOException {
        try (
            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                    .withFirstRecordAsHeader()
                    .withIgnoreHeaderCase()
                    .withTrim());
        ) {
            Iterable<CSVRecord> csvRecords = csvParser.getRecords();

            for (CSVRecord csvRecord : csvRecords) {
                // Accessing values by Header names

                String buying_price = csvRecord.get("buying_price");
                String maintainence_cost = csvRecord.get("maintainence_cost");
                String number_of_doors = csvRecord.get("number_of_doors");
                String number_of_seats = csvRecord.get("number_of_seats");
                String luggage_boot_size = csvRecord.get("luggage_boot_size");
                String safety_rating = csvRecord.get("safety_rating");
                String popularity = csvRecord.get("popularity");
                

                System.out.print("Record No - " + csvRecord.getRecordNumber() + " - " + buying_price + "," + maintainence_cost + "," + number_of_doors + "," + number_of_seats + "," + luggage_boot_size + "," + safety_rating + "," + popularity);
                System.out.println();
            }
        }
    }

}
