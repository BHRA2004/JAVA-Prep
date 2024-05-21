class Sports {
    // Method to play
    public void play() {
        System.out.println("Playing a sport");
    }
}

// Subclass 1
class Football extends Sports {
    // Override play method for Football
    @Override
    public void play() {
        System.out.println("Playing Football");
    }
}

// Subclass 2
class Basketball extends Sports {
    // Override play method for Basketball
    @Override
    public void play() {
        System.out.println("Playing Basketball");
    }
}

// Subclass 3
class Rugby extends Sports {
    // Override play method for Rugby
    @Override
    public void play() {
        System.out.println("Playing Rugby");
    }
}

// Main class
public class New {
    public static void main(String[] args) {
        // Polymorphism in action
        Sports sport1 = new Football();
        Sports sport2 = new Basketball();
        Sports sport3 = new Rugby();

        // Calling play() for each object will invoke the overridden method
        sport1.play(); // Output: Playing Football
        sport2.play(); // Output: Playing Basketball
        sport3.play(); // Output: Playing Rugby
    }
}