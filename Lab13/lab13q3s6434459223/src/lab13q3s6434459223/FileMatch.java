package lab13q3s6434459223;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class FileMatch {
    public static void main(String[] args) {

        ArrayList<AccountRecord> accountRecords = new ArrayList<>();
        ArrayList<TransactionRecord> transactionRecords = new ArrayList<>();

        String masterFpath = "src/lab13q3s6434459223/master.txt";
        String transFpath = "src/lab13q3s6434459223/trans.txt";
        String newFile = "src/lab13q3s6434459223/newMaster.dat";

        File masterFile = new File(masterFpath);
        try (Scanner master = new Scanner(masterFile)) {
            while (master.hasNextLine()) {
                String[] masterInputList = master.nextLine().split(" ");

                int acctNo = Integer.parseInt(masterInputList[0]);
                String name = masterInputList[1] + " " + masterInputList[2];
                double balance = Double.parseDouble(masterInputList[3]);

                accountRecords.add(new AccountRecord(acctNo, name, balance));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
         // Read Transaction file
         File transFile = new File(transFpath);
         try ( Scanner trans = new Scanner(transFile)) {
             while (trans.hasNextLine()) {
                 String[] transInputList = trans.nextLine().split(" ");
 
                 int acctNo = Integer.parseInt(transInputList[0]);
                 double amount = Double.parseDouble(transInputList[1]);
 
                 transactionRecords.add(new TransactionRecord(acctNo, amount));
             }
         } catch (Exception e) {
             System.out.println(e.getMessage());
         }
 
         // Matching Transaction with account and update balance
         matching(accountRecords, transactionRecords);

        // Write to dat file
        try (RandomAccessFile r = new RandomAccessFile(newFile, "rw")) {
            accountRecords.forEach((account) -> {
                try {
                    r.writeInt(account.getAccountNumber());
                    r.writeChars(account.getName());
                    r.writeChars(" ".repeat(30 - account.getName().length()));
                    r.writeDouble(account.getBalance());
                    r.writeInt(account.getTransCnt());
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            });

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Read from dat file
        try (RandomAccessFile r = new RandomAccessFile(newFile, "r")) {
            int totalRecord = 0;
            double balance = 0;
            int noTransacCnt = 0;

            while (r.getFilePointer() != r.length()) {
                r.readInt();
                totalRecord++;

                r.skipBytes(30 * 2); // Skip name

                balance += r.readDouble();
                if (r.readInt() == 0) {
                    noTransacCnt++;
                }
            }
            System.out.println("Total Account Record : " + totalRecord);
            System.out.println("Total balance : " + balance);
            System.out.println("No transaction : " + noTransacCnt + " account.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void matching(ArrayList<AccountRecord> accountRecords,
            ArrayList<TransactionRecord> transactionRecords) {
        for (AccountRecord account : accountRecords) {
            for (TransactionRecord transaction : transactionRecords) {
                if (transaction.getAccountNumber() == account.getAccountNumber()) {
                    account.combine(transaction);
                }
            }
        }
    }
}
