

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.Iterator;
	import java.util.List;
	 
	class CricketPlayer {
	 
	    private int id;
	    private String name;
	    private String rank;
	    private long score;
	 
	    public CricketPlayer(int id, String name, String rank, long score) {
	        super();
	        this.id = id;
	        this.name = name;
	        this.rank = rank;
	        this.score = score;
	    }
	 
	    public int getId() 
	    {
	        return id;
	    }
	 
	    public void setId(int id) 
	    {
	        this.id = id;
	    }
	 
	    public String getName()
	    {
	        return name;
	    }
	 
	    public void setName(String name) 
	    {
	        this.name = name;
	    }
	 
	    public String getRank()
	    {
	        return rank;
	    }
	 
	    public void setRanking(String rank)
	    {
	        this.rank = rank;
	    }
	 
	    public long getScore()
	    {
	        return score;
	    }
	 
	    public void setScore(long score) 
	    {
	        this.score = score;
	    }
	 
	    @Override
	    public String toString() 
	    {
	        return "CricketPlayer [id=" + id + ", name=" + name + ", rank=" + rank + ", score=" + score + "]";
	    }
	 
	}
	
	 
	public class CricketPlayers
	{
	 
	    public static void main(String[] args)
	    {
	 
	        CricketPlayer c1 = new CricketPlayer(01,"vk", "01R", 43526);
	        CricketPlayer c2 = new CricketPlayer(02, "msd", "02R", 56789);
	        CricketPlayer c3 = new CricketPlayer(03, "pandya", "03R", 98765);
	        CricketPlayer c4 = new CricketPlayer(04, "abd", "90R", 98765);
	        CricketPlayer c5 = new CricketPlayer(05, "raina", "07R", 546378);
	        CricketPlayer c6 = new CricketPlayer(06, "kapil", "35R", 2587);
	       
	        ArrayList<CricketPlayer> list = new ArrayList<>();
	        Collections.addAll(list, c1, c2, c3, c4, c5, c6);

	            Comparator<CricketPlayer> cc = Comparator.comparing(CricketPlayer::getRank).reversed();
	            list.sort(cc);
	            for(CricketPlayer cricketPlayer:list) 
	            {
	                
	                System.out.println(cricketPlayer);
	        }
	    
	 
	    }
	}
	
	
	
	
	
	
	 
	

