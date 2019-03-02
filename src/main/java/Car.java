public class Car {
    private int location;
    private String name;
    private final static int CONDITION_NUMBER = 4;

    public Car() {
        location = 0;
    }

    public Car(String name){ //like domain + service
        super(); // 써도 되나..?
        this.name = name;
    }

    public String getName() { //test를 위해서 getName을추가했는데 별로인듯ㅠㅠ
        return name;
    }

    public void repeatUpTo(int tryCount) {
        for (int i = 0; i < tryCount; i++) {
            int randomNum = RandomMaker.generateRandomInt();
            updateLocationAccordingTo(randomNum);
        }
    }

    private void updateLocationAccordingTo(int randomNum) {
        if (randomNum >= CONDITION_NUMBER) {
            location++;
        }
    }

    public String drawRacingRoad() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < location; i++) {
            stringBuilder.append("=");
        }
        return stringBuilder.toString();
    }

}
