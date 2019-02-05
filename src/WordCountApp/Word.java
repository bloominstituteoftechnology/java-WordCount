package WordCountApp;

public class Word
{
    private String breed;
    private int avgWeight;
    private boolean apartment;

    //create constructors

    public Dogs(String breed, int avgWeight, boolean apartment)
    {
        this.breed = breed;
        this.avgWeight = avgWeight;
        this.apartment = apartment;
    }


    //create getter and setters

    public String getBreed()
    {
        return breed;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    public int getAvgWeight()
    {
        return avgWeight;
    }

    public void setAvgWeight(int avgWeight)
    {
        this.avgWeight = avgWeight;
    }

    public boolean isApartment()
    {
        return apartment;
    }

    public void setApartment(boolean apartment)
    {
        this.apartment = apartment;
    }


    //override toString methods
    @Override
    public String toString()
    {
        return "Dogs{" +
                "breed='" + breed + '\'' +
                ", avgWeight=" + avgWeight +
                ", apartment=" + apartment +
                '}';
    }
}