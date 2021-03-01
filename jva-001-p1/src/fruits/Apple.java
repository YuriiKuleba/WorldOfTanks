package fruits;

public class Apple extends Fruit{

    private String sort;

    private Origin origin;

    public Apple() {
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }


    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    @Override
    public String showFeatures() {
        return "fruit: Apple \nsort: " + getSort() + "\ncountry: " + getOrigin().getCountry() +
                "\nyear: " + getOrigin().getSelectedYear() + super.showFeatures();

    }
}
