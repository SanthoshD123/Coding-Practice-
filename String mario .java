"""
String Mario

Coding

DESCRIPTION

Complete the classes using the specifications given below. Consider default visibility of classes, data fields, and methods unless mentioned otherwise.

Specifications

Class Definitions:

Class Mario

Data Members:

1. String life - A string of private visibility that contains 5 space-separated integers (0 and 1), where:

0 → Life is spared

1 → Life left

2. String villain - A string of private visibility that denotes the name of the villain in an encoded form.

Visibility:
Private
Constructor:
Mario(String life, String villain) → Constructor with public visibility

Methods:

Implement getters and setters with public visibility.

---

Class PlayMario

Data Members:

1. Mario mario = null - A variable of type Mario initialized as null.

Constructor:

PlayMario(Mario mario) → Constructor with public visibility.

Method Definitions:

1. String lifeCheck();

Returns the number of lives Mario can still avail.

The number should be returned in words:

0 → ZERO

1 → ONE

2 → TWO

3 → THREE

4 → FOUR

5 → FIVE

2. String killVillain();

Given the encoded name of the villain, remove all special characters (except spaces) and return the proper name of the villain.

---

Input Format

Mario m = new Mario("1 0 1 1 1", "Th@an#os");
PlayMario pm = new PlayMario(m);

String ans = pm.lifeCheck();
String res = pm.killVillain();

System.out.println(ans);
System.out.println(res);

---

Output Format

FOUR
Thanos

---

Evaluation Parameters

Sample Input

Mario m = new Mario("0 1 1 0 1", "J@o%ke*r!");
PlayMario pm = new PlayMario(m);
pm.lifeCheck();
pm.killVillain();

Sample Output

THREE  
Joker

---

Notes:

You can make suitable function calls and use the RUN CODE button to check your main() method output.
"""
import java.util.*;

class Mario {
    private String life;
    private String villain;

    // Constructor
    public Mario(String life, String villain) {
        this.life = life;
        this.villain = villain;
    }

    // Getter and Setter for life
    public String getLife() {
        return life;
    }

    public void setLife(String life) {
        this.life = life;
    }

    // Getter and Setter for villain
    public String getVillain() {
        return villain;
    }

    public void setVillain(String villain) {
        this.villain = villain;
    }
}

class PlayMario {
    private Mario mario;

    // Constructor
    public PlayMario(Mario mario) {
        this.mario = mario;
    }

    // Method to check Mario's life
    public String lifeCheck() {
        String[] lifeArray = mario.getLife().split(" "); // ✅ FIXED

        int count = 0;
        for (String l : lifeArray) {
            if (l.equals("1")) {
                count++;
            }
        }

        // Convert count to words
        return numberToWords(count);
    }

    // Method to clean villain's name (remove special characters)
    public String killVillain() {
        return mario.getVillain().replaceAll("[^a-zA-Z ]", "").trim();
    }

    // Helper method to convert numbers to words
    private String numberToWords(int num) {
        String[] words = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE"};
        return words[num];
    }
}

public class Source {
    public static void main(String args[]) {
        // Sample Input
        Mario m = new Mario("1 1 1 1 0", "Th@an%^os");
        PlayMario pm = new PlayMario(m);

        // Output results
        System.out.println(pm.lifeCheck()); // Output: FOUR
        System.out.println(pm.killVillain()); // Output: Thanos
    }
}
