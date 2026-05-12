// Base class
public class Players {

    // Fields
    private String name;
    private int age;
    private String nationality;
    private String jerseyNumber;

    // Constructor
    public Players(String name, int age, String nationality, String jerseyNumber) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.jerseyNumber = jerseyNumber;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    public String getJerseyNumber() {
        return jerseyNumber;
    }

    // Methods
    public void play() {
        System.out.println(name + " is playing a sport.");
    }

    public void train() {
        System.out.println(name + " is training.");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void displayInfo() {
        System.out.println("|========== Player ==========|");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Nationality : " + nationality);
        System.out.println("Jersey Number : " + jerseyNumber);
        System.out.println("|============================|");
    }

    // Cricket class
    class Cricket_Player extends Players {

        private String battingStyle;
        private String bowlingStyle;
        private int ODIRuns;

        public Cricket_Player(String name, int age, String nationality,
                String jerseyNumber, String battingStyle,
                String bowlingStyle, int ODIRuns) {

            super(name, age, nationality, jerseyNumber);

            this.battingStyle = battingStyle;
            this.bowlingStyle = bowlingStyle;
            this.ODIRuns = ODIRuns;
        }

        @Override
        public void play() {
            System.out.println(getName() + " is playing cricket.");
        }

        @Override
        public void displayInfo() {
            System.out.println("|====== Cricket Player ======|");
            System.out.println("Name : " + getName());
            System.out.println("Batting Style : " + battingStyle);
            System.out.println("Bowling Style : " + bowlingStyle);
            System.out.println("ODI Runs : " + ODIRuns);
            System.out.println("|============================|");
        }
    }

    // Football class
    class Football_Player extends Players {

        private String position;
        private int goalsScored;
        private String preferredFoot;

        public Football_Player(String name, int age, String nationality,
                String jerseyNumber, String position,
                int goalsScored, String preferredFoot) {

            super(name, age, nationality, jerseyNumber);

            this.position = position;
            this.goalsScored = goalsScored;
            this.preferredFoot = preferredFoot;
        }

        @Override
        public void play() {
            System.out.println(getName() + " is playing football.");
        }

        @Override
        public void displayInfo() {
            System.out.println("|===== Football Player =====|");
            System.out.println("Name : " + getName());
            System.out.println("Position : " + position);
            System.out.println("Goals : " + goalsScored);
            System.out.println("Preferred Foot : " + preferredFoot);
            System.out.println("|===========================|");
        }
    }

    // Hockey class
    class Hockey_Player extends Players {

        private String stickHand;
        private String position;
        private int internationalCaps;

        public Hockey_Player(String name, int age, String nationality,
                String jerseyNumber, String stickHand,
                String position, int internationalCaps) {

            super(name, age, nationality, jerseyNumber);

            this.stickHand = stickHand;
            this.position = position;
            this.internationalCaps = internationalCaps;
        }

        @Override
        public void play() {
            System.out.println(getName() + " is playing hockey.");
        }

        @Override
        public void displayInfo() {
            System.out.println("|====== Hockey Player ======|");
            System.out.println("Name : " + getName());
            System.out.println("Position : " + position);
            System.out.println("Stick Hand : " + stickHand);
            System.out.println("International Caps : " + internationalCaps);
            System.out.println("|===========================|");
        }
    }

    // Main method
    public static void main(String[] args) {

        Players p = new Players("John Deo", 25, "American", "00");

        p.displayInfo();

        // Creating inner class objects
        Cricket_Player cp = p.new Cricket_Player(
                "Virat Kohli", 35, "Indian", "18",
                "Right-handed", "Right-arm Medium", 13848);

        Football_Player fp = p.new Football_Player(
                "Lionel Messi", 36, "Argentine", "10",
                "Forward", 807, "Left");

        Hockey_Player hp = p.new Hockey_Player(
                "PR Sreejesh", 35, "Indian", "16",
                "Right", "Goalkeeper", 260);

        // Polymorphism
        Players[] players = { cp, fp, hp };

        for (Players player : players) {
            player.displayInfo();
            player.play();
            player.train();
            player.eat();
            System.out.println();
        }
    }
}