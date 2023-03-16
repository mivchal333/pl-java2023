package java10.optionalOrElseThrow;

import java.util.Optional;

public class DataService {
    DataProvider dataProvider = new DataProvider();

    String getUsername(int id) {
        // implement here
        // get username from DataProvider.
        // Return value or throw exception if there is no value

        Optional<String> username = dataProvider.getUsername(id);

        return username.orElseThrow();
    }
}
