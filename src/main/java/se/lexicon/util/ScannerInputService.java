package se.lexicon.util;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class ScannerInputService implements userInputServiceDao {

    Scanner scanner;
@Autowired
    public ScannerInputService(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String getString() {
        return "";
    }

    @Override
    public int getInt() {
        return 0;
    }
}
