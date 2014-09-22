
public class VendingMachine
{
    private int numberOfCans;
    private int numberOfTokens;
    public VendingMachine()
    {
        this.numberOfCans=10;
    }
    public VendingMachine(int cans)
    {
        this.numberOfCans=cans;
    }

    public void fillUp(int cans)
    {
        this.numberOfCans+=cans;

    }
    
    public void insertToken()
    {
        this.numberOfTokens+=1;
        this.numberOfCans-=1;

    }
    
    public int getCanCount()
    {
        return this.numberOfCans;
    }
    
    public int getTokenCount()
    {
        return this.numberOfTokens;
    }




}
