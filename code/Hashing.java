package hashing;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner input = new Scanner(System.in);

        Hashing(input);
    }

    public static void Hashing(Scanner input) throws NoSuchAlgorithmException {
        String password = input.nextLine();

        MessageDigest md = MessageDigest.getInstance("SHA-256");

        //Omdanner password til bytes i et byte array.
        byte[] hashinbytes = md.digest(password.getBytes(StandardCharsets.UTF_8));

        StringBuilder sb = new StringBuilder();

        for (byte b : hashinbytes) {
            sb.append(String.format("%02x", b));
        }
        System.out.println(sb.toString());
    }
}

