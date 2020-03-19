package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RacingField {

    private final int totalTurns;
    private final int carNumbers;
    private final List<Car> cars;

    public RacingField(int totalTurns, int carNumbers) {
        this.totalTurns = totalTurns;
        this.carNumbers = carNumbers;
        this.cars = createCars(carNumbers);
    }

    public void nextTurn() {
        for (Car car : cars) {
            car.move();
        }
    }

    public List<Integer> getCarDistances() {
        return cars.stream()
                .map(Car::getDrivenDistance)
                .collect(Collectors.toList());
    }

    public int getTotalTurns() {
        return totalTurns;
    }

    public int getCarNumbers() {
        return carNumbers;
    }

    private List<Car> createCars(int carNumbers) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < carNumbers; i++) {
            Car car = new Car();
            cars.add(car);
        }
        return cars;
    }


}
