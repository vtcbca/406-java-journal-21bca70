class Crickter
{
    public String name;
    public double matchPlayed;
    public void setValues(String name,double matchPlayed)
	{
        this.name=name;
        this.matchPlayed=matchPlayed;
    }
}
class Batsman extends Crickter
{
    public double totalruns;
    public double avarageRuns(double totalruns)
	{
        this.totalruns=totalruns;
        return this.totalruns/matchPlayed;
    }

}
class Bowler extends Crickter
{
    public double wickets;
    public double avarageWickets(double wickets)
	{
        this.wickets=wickets;
        return this.wickets/matchPlayed;
    }
}
class main 
{
    public static void main(String args[])
	{
        Batsman bm=new Batsman();
        bm.setValues("Sachin Tendulkar",782);
        double avgRuns=bm.avarageRuns(34357);
        System.out.println("Batsman Information\n");
        System.out.println("Batsman Name:"+bm.name);
        System.out.println("Batsman Run:"+bm.totalruns);
        System.out.println("Batsman Match Played:"+bm.matchPlayed);
        System.out.println("Batsman Avg Runs:"+avgRuns);      
        Bowler br=new Bowler();
        br.setValues("Muttiah Muralitharan",583);
        double avgWickets=br.avarageWickets(1347);
        System.out.println("\nBowler Information\n");
        System.out.println("Bpwler Name:"+br.name);
        System.out.println("Bpwler Wicketcs:"+br.wickets);
        System.out.println("Bpwler Match Played:"+br.matchPlayed);
        System.out.println("Bpwler Avg Wickets:"+avgWickets); 
    }
} 
