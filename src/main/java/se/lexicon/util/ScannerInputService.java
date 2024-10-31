package se.lexicon.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ScannerInputService implements userInputService {

    Scanner scanner;

    @Autowired
    public ScannerInputService(Scanner scanner) {
        System.out.println("Scanner object created...");
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
