import javax.swing.JOptionPane;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;

public class Util {

    // Method to generate the Merkle root from a list of words
    public String getMerkleRoot(ArrayList<String> lstWords) {
        // Implement the Merkle root generation as per the class instructions
        return "generatedMerkleRoot";
    }

    // Private method to populate a MerkleNode with left and right nodes
    private void populateMerkleNode(MerkleNode node, MerkleNode left, MerkleNode right) {
        node.oLeft = left;
        node.oRight = right;
        node.sHash = generateHash(left.sHash + right.sHash);
    }

    // Method to generate SHA-256 hash of the original string
    public synchronized String generateHash(String sOriginal) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] btEncodedhash = digest.digest(sOriginal.getBytes(StandardCharsets.UTF_8));

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < btEncodedhash.length; i++) {
                sb.append(Integer.toString((btEncodedhash[i] & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        } catch (Exception ex) {
            System.out.println("Error generating hash: " + ex.getMessage());
            return null;
        }
    }

    // Method to prompt the user for input using JOptionPane
    public String promptUser(String sQuestion) {
        JOptionPane oQuestion = new JOptionPane();
        return oQuestion.showInputDialog(sQuestion);
    }

    // Method to make the thread sleep for a random time between 3 and 8 seconds
    public void sleepRandomTime(String sThreadName) {
        // Gets random number between 0 and 5 and then adds 3, meaning between 3 and 8 now.
        int iSleepTime = new SecureRandom().nextInt(5) + 3;

        System.out.println(sThreadName + " sleeping for " + iSleepTime + " seconds.");
        sleep(iSleepTime);
    }

    // Method to make the thread sleep for a specified number of seconds
    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
