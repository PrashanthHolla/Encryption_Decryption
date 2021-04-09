package Geek_practice_prashanth;

public class Kingdom {
	
	private String KingName;
	private String KingEmblem;
	
    public Kingdom(String KingName,String KingEmblem)
    {
    	this.KingName=KingName;
    	this.KingEmblem=KingEmblem;
    }
    
    public String getKingname()
    {
    	return this.KingName;
    }
    
    public String getKingEmblem()
    {
    	return this.KingEmblem;
    }
    
    public void setKingname(String KingName)
    {
    	 this.KingName=KingName;
    }
    
    public void setKingEmblem(String KingEmblem)
    {
    	 this.KingEmblem=KingEmblem;
    }
    
    public String toString()
    {
    	return this.KingName+" "+this.KingEmblem; 
    }
    
    public Kingdom getKingdom(Kingdom kingdom)
    {
    	return this; 
    }
}
