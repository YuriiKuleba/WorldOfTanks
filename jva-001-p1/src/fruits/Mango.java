package fruits;

public class Mango extends Fruit{

    private String sort;

    private Origin origin;

    public Mango() {
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
        return "fruit: Mango \nsort: " + getSort() + "\ncountry: " + getOrigin().getCountry() +
                "\nyear: " + getOrigin().getSelectedYear() + super.showFeatures();

    }
}
