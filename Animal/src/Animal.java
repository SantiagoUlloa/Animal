
    public class Animal {
        //Put instance variables here
        private int numLegs;
        private int topSpeed;
        private boolean isEndangered;
        private String name;
        //Put constructor here
        public Animal(int numLegs, int topSpeed, boolean isEndagered, String name ){
            this.numLegs = numLegs;
            this.topSpeed = topSpeed;
            this.isEndangered = isEndagered;
            this.name = name;
        }
        //Put getters and setters here
        public int getNumLegs(){
            return this.numLegs;
        }

        public void setNumLegs(int numLegs){
            this.numLegs = numLegs;
        }

        public int getTopSpeed(){
            return this.topSpeed;
        }

        public void setTopSpeed(int topSpeed){
            this.topSpeed = topSpeed;
        }

        public boolean getEndangered(){
            return this.isEndangered;
        }

        public void setEndangered(boolean isEndangered){
            this.isEndangered = isEndangered;
        }

        public String getName(){
            return this.name;
        }

        public void setName(String name){
            this.name = name;
        }


        public static void main(String[] args) {
            System.out.println("Hello, world");
            //Instantiate new Animal
            Animal animal = new Animal(4, 35, true, "Cheetah" );

            String name;
            int topSpeed;

            //get name and speed values using getters
            name = animal.getName();
            topSpeed = animal.getTopSpeed();

            //Print some output
            System.out.println(name + " has a top speed of " + topSpeed);

            //Set new name, speed, and endangered properties values using setters
            animal.setName("Lion");
            animal.setTopSpeed(25);
            animal.setEndangered(false);

            //get new values using getters
            name = animal.getName();
            topSpeed = animal.getTopSpeed();

            //Print some output
            System.out.println(name + " has a top speed of " + topSpeed);
        }
    }

