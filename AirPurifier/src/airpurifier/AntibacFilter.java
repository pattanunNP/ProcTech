package airpurifier;

public class AntibacFilter extends Filter {
    protected static final int START_CAPACITY = 10000;
    protected static final double EXTRA_LIFE_CAPACITY = 2.5;
    protected int currentCapacity;

    public AntibacFilter() {
        currentCapacity = (int) (START_CAPACITY * EXTRA_LIFE_CAPACITY);
    }

    @Override
    public void filter(int airVolumnInLiter) {
        super.filter(airVolumnInLiter);
        this.currentCapacity = (int) Math.max(0, currentCapacity - airVolumnInLiter);
        Antibac();
        ClearMusty();
    }

    public void ClearMusty() {
        System.out.println("Clear Musty");
    }

    public void Antibac() {
        System.out.println("Antibac");
    }

    public int getCurrentCapacity() {
        return super.getCurrentCapacity();
    }

    public String getFilterType() {
        return getClass().getSimpleName();
    }

    public String toString() {
        return "[" + getFilterType() + "] Current Capacity: " + getCurrentCapacity();
    }
}
