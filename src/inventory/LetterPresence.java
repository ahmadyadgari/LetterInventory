package inventory;

public class LetterPresence {

    private int inventory;

    public LetterPresence() {
        inventory = 0;  // Explicitly initializing the inventory
    }

    private int getIndex(char letter) {
        // Assume letter is valid and lowercase
        return letter - 'a';  // Convert char to int for zero-based indexing
    }

    public void add(char letter) {
        int position = getIndex(letter);
        inventory |= (1 << position);  // Set the bit at the position to 1
    }

    public void remove(char letter) {
        int position = getIndex(letter);
        inventory &= ~(1 << position);  // Set the bit at the position to 0
    }

    public boolean isPresent(char letter) {
        int position = getIndex(letter);
        return (inventory & (1 << position)) != 0;  // Check if the bit at the position is 1
    }

    public void clear() {
        inventory = 0;  // Reset the inventory
    }
}

