import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class fileEncryptionDecryption {
	public static void main(String[] args) throws IOException {
		String inputFileName = "file";
		String encryptedFile = "Encrypted File";
		String decryptedFile = "Decrypted File";
		encryptedFile(inputFileName, encryptedFile);
		decryptFile(encryptedFile, decryptedFile);
	}

	public static void encryptedFile(String inputFileName, String encryptedFile)
			throws IOException, FileNotFoundException {
		File file1 = new File(inputFileName);

		FileInputStream fis = new FileInputStream(file1);
		FileOutputStream fos = new FileOutputStream(encryptedFile);
		int[] encrypt = { 100 };

		DataOutputStream outputFile = new DataOutputStream(
				new FileOutputStream(encryptedFile));

		for (int i = 0; i < encrypt.length; i++)
			fos.write(encrypt[i] + 100);

		System.out.println("Encrypted.");

		outputFile.close();
	}

	public static void decryptFile(String inputFileName, String decryptedFile)
			throws IOException, FileNotFoundException {
		File file1 = new File(inputFileName);

		FileInputStream fis = new FileInputStream(file1);
		FileOutputStream fos = new FileOutputStream(decryptedFile);
		int[] decrypt = { 0 };

		DataInputStream inputFile = new DataInputStream(fis);

		for (int i = 0; i < decrypt.length; i--)
			fos.write(decrypt[i] - 100);

		System.out.println("Decrypted.");

		inputFile.close();
	}
}