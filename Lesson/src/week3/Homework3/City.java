package week3.Homework3;

public class City {
    // 도시 이름
    private String cityName;
    // 도시 인구
    private int population;
    // 도시의 인구 증가율 (%)
    private double growthRate;

    public City(int populationIn, double growthRateIn, String cityNameIn) {
        population = populationIn;
        growthRate = growthRateIn;
        cityName = cityNameIn;
    }


    // 주어진 연도 후의 예상 인구를 계산한다
    public int computeFuturePopulation(int years) {
        // 예상 인구
        double populationAmount = population;
        // 연도
        int count = years;
        // 주어진 연도 후의 예상 인구를 계산한다
//        for (int i = 1; i <= count; i++) {
//            populationAmount += (populationAmount * growthRate / 100);
//        }
        // 예상 인구를 반환한다
        populationAmount = populationAmount * Math.pow(1 + growthRate / 100, count);
        return (int) populationAmount;
    }
    // 도시 이름을 주어진 값으로 변경한다
    public void setName(String newName) {
        // 여기에 코드를 삽입하세요
        cityName = newName;
    }
    // 도시 인구를 주어진 값으로 변경
    public void setPopulation(int newPopulation) {
        // 여기에 코드를 삽입하세요
        population = newPopulation;
    }
    // 도시 인구 증가율을 주어진 값으로 변경
    public void setGrowthRate(int newGrowthRate) {
        // 여기에 코드를 삽입하세요
        growthRate = newGrowthRate;
    }
    // 도시 이름을 반환한다
    public String getName() {
        // 여기에 코드를 삽입하세요
        return cityName;
    }
    // 도시 인구를 반환한다
    public int getPopulation() {
        // 여기에 코드를 삽입하세요
        return population;
    }
    // 도시 인구 증가율을 반환한다
    public double getGrowthRate() {
        // 여기에 코드를 삽입하세요
        return growthRate;
    }

}