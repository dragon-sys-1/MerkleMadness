# MerkleMadness
2025SP-CSIS-294-1958 Lab Group 2
# MERKLE MADNESS

## Project Overview
MERKLE MADNESS is a console-based Java application designed to help students gain experience with SHA256 hashing, Merkle trees, and multithreading. The application allows users to input words, which are processed by Merkle and Rogue threads, with the goal of matching a user-provided Merkle root to win the game.

## Skills Covered
- SHA256 Hashing
- Merkle Trees
- Multithreading

## Group Members
- Member 1: Yousif Alrubaye
- Member 2: Joshua Chambers
- Member 3: Albeer Malan
- Member 4: Samim Nasim

## Project Structure
The project consists of several classes, each responsible for different aspects of the application:

1. MerkleManager_Test: Contains the main method and instantiates the MerkleManager.
2. MerkleManager: Manages user input, starts threads, and controls the game logic.
3. MerkleThread: Implements Runnable; processes user words to create a Merkle tree.
4. RogueThread: Implements Runnable; grabs user words to increase strike count.
5. MonitorThread: Implements Runnable; monitors game progress and determines win/loss conditions.
6. MerkleNode: Represents a node in the Merkle tree.
7. Util: Contains helper methods for user input, generating Merkle roots, and managing thread sleep times.

## Installation and Setup
1. Clone the repository:
    ```sh
    git clone https://github.com/YOUR_USERNAME/MerkleMadness.git
    ```
    Replace `YOUR_USERNAME` with your GitHub username.

2. Navigate to the project directory:
    ```sh
    cd MerkleMadness
    ```

3. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).

## Running the Project
1. Compile the project:
    ```sh
    javac src/*.java
    ```

2. Run the project:
    ```sh
    java src.MerkleManager_Test
    ```

## Contributing
Each group member is responsible for contributing to the project by implementing and testing their assigned classes. Once completed, push your changes to the repository and collaborate with other members to integrate and review the code.

### Pull Requests
1. Create a new branch for your feature or bug fix:
    ```sh
    git checkout -b feature/branch-name
    ```

2. Commit your changes:
    ```sh
    git commit -m "Description of your changes"
    ```

3. Push the branch to the repository:
    ```sh
    git push origin feature/branch-name
    ```

4. Create a pull request on GitHub and request reviews from your group members.

## License
This project is licensed under the Grossmont College License.

## Acknowledgements
This project was developed as part of a group lab exercise to gain practical experience with multithreading and Merkle roots in Java.

