import java.lang.Math;
import java.lang.Object;
import java.util.Arrays;
import java.io.*;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;


public class charGen{

	private int r1;
	private int r2;
	private int r3;
	private int hp;	
	private int str;
	private int con;
	private int dex;
	private int intel;
	private int wis;
	private int cha;
	int[] stats = new int[6];

	LinkedList<String> jobArray  = new LinkedList<String>();;
	ArrayList<String> raceArray = new ArrayList<String>();
	ArrayList<String> percentages = new ArrayList<String>();
	ArrayList<String> bgArray = new ArrayList<String>();
	ArrayList<String> traitArray = new ArrayList<String>();
	ArrayList<String> flawArray = new ArrayList<String>();
	ArrayList<String> idealArray = new ArrayList<String>();
	ArrayList<String> bondArray = new ArrayList<String>();

	private String temp;
	private String race;
	private String job;
	private String bg;
	private String personality;
	private String ideal;
	private String bond;
	private String flaw;
	//String items;

	Scanner s = null;

public static void main(String[] args){
	try
    {
        charGen obj = new charGen();
        obj.run();
    }
    catch (Exception e)
    {
        e.printStackTrace ();
    }

	
}

	public void run() throws Exception
	{
		race = raceSelect();
		job = jobSelect();
		bg = bgSelect();
		personality = personSelect();
		ideal = idealSelect();
		bond = bondSelect();
		flaw = flawSelect();
		statSort(job);
		raceBuff(race);
		hitPoints();
		System.out.println("Race: " + race);
		System.out.println("Class: " + job);
		System.out.println("Hit Points: " + hp);
		System.out.printf("STR: %d\tINT: %d%nCON: %d\tWIS: %d%nDEX: %d\tCHA: %d%n",str,intel,con,wis,dex,cha);
		System.out.println("Background: " + bg);
		System.out.println("Personality: " + personality);
		System.out.println("Ideal: " + ideal);
		System.out.println("Bond: " + bond);
		System.out.println("Flaw: " + flaw);
		System.out.println();
	
	}

	public void raceCollect(String in){
		try{
			s = new Scanner(new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/" + in + ".txt")))).useDelimiter("\n|\t");
			while (s.hasNext()){
				raceArray.add(s.next());
				percentages.add(s.next());
			}
		} 
		catch (Exception e){
			e.printStackTrace();
		}
		finally{
			if (s != null){
				s.close();
			}
		}
	}

	public void jobCollect(String in){
		try{
			s = new Scanner(new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/" + in + ".txt"))));
			while (s.hasNext()){
				jobArray.add(s.next());
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
		finally{
			if(s != null){
				s.close();
			}
		}
	}

	public void bgCollect(String in){
		try{
			s = new Scanner(new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/" + in + ".txt")))).useDelimiter("\n|\t");
			while (s.hasNext()){
				bgArray.add(s.next());
			}
		} 
		catch (Exception e){
			e.printStackTrace();
		}
		finally{
			if (s != null){
				s.close();
			}
		}
	}

	public void personCollect(String in){
		try{
			s = new Scanner(new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/" + in + ".txt")))).useDelimiter("\n|\t");
			while (s.hasNext()){
				traitArray.add(s.next());
			}
		} 
		catch (Exception e){
			e.printStackTrace();
		}
		finally{
			if (s != null){
				s.close();
			}
		}
	}

	public void flawCollect(String in){
		try{
			s = new Scanner(new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/" + in + ".txt")))).useDelimiter("\n|\t");
			while (s.hasNext()){
				flawArray.add(s.next());
			}
		} 
		catch (Exception e){
			e.printStackTrace();
		}
		finally{
			if (s != null){
				s.close();
			}
		}
	}

	public void idealCollect(String in){
		try{
			s = new Scanner(new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/" + in + ".txt")))).useDelimiter("\n|\t");
			while (s.hasNext()){
				idealArray.add(s.next());
			}
		} 
		catch (Exception e){
			e.printStackTrace();
		}
		finally{
			if (s != null){
				s.close();
			}
		}
	}

	public void bondCollect(String in){
		try{
			s = new Scanner(new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/" + in + ".txt")))).useDelimiter("\n|\t");
			while (s.hasNext()){
				bondArray.add(s.next());
			}
		} 
		catch (Exception e){
			e.printStackTrace();
		}
		finally{
			if (s != null){
				s.close();
			}
		}
	}

	public String raceSelect(){
		raceCollect("Race");
		r1 = (int)Math.floor((raceArray.size()*Math.random()));
		return raceArray.get(r1);
	}
	public String jobSelect(){
		jobCollect("Jobs");
		r1 = (int)Math.floor((jobArray.size()*Math.random()));
		return jobArray.get(r1);
	}

	public String bgSelect(){
		bgCollect("Background");
		r1 = (int)Math.floor((bgArray.size()*Math.random()));
		return bgArray.get(r1);
	}
	
	public String personSelect(){
		personCollect("Traits");
		r1 = (int)Math.floor(traitArray.size()*Math.random());
		r2 = (int)Math.floor(traitArray.size()*Math.random());
		while(r1 == r2)
			r2 = (int)Math.floor(traitArray.size()*Math.random());
		r3 = (int)Math.floor(traitArray.size()*Math.random());
		while(r1 == r3 || r2 == r3)
			r3 = (int)Math.floor(traitArray.size()*Math.random());
		return (traitArray.get(r1) + ", " + traitArray.get(r2) + " and " + traitArray.get(r3));
	}

	public String flawSelect(){
		flawCollect("Flaws");
		r1 = (int)Math.floor(flawArray.size()*Math.random());
		r2 = (int)Math.floor(flawArray.size()*Math.random());
		while(r1 == r2)
			r2 = (int)Math.floor(flawArray.size()*Math.random());
		r3 = (int)Math.floor(flawArray.size()*Math.random());
		while(r1 == r3 || r2 == r3)
			r3 = (int)Math.floor(flawArray.size()*Math.random());
		return (flawArray.get(r1) + ", " + flawArray.get(r2) + " and " + flawArray.get(r3));
	}

	public String idealSelect(){
		idealCollect("Ideals");
		r1 = (int)Math.floor(Math.random()*idealArray.size());
		return idealArray.get(r1);
	}
		
	public String bondSelect(){
		bondCollect("Bonds");
		r1 = (int)Math.floor(Math.random()*idealArray.size());
		return idealArray.get(r1);
	}

	public int getStats(){
		r1 = 0;
		for(int x = 0; x < 4; x++){
			r1 += (int)Math.floor(1+Math.random()*6);
		}
		return r1;
	}

	public void statGen(){
		for(int y = 0; y < 6; y++){
			stats[y] = getStats();
		}
		Arrays.sort(stats);
	}

	public void statSort(String in){
		statGen();
		switch(in){
			case "Barbarian":
				str = stats[5];
				con = stats [4];
				dex = stats[3];
				intel = stats[0];
				wis = stats[1];
				cha = stats[2];
			break;
			case "Bard":
				str = stats[0];
				con = stats[3];
				dex = stats[4];
				intel = stats[1];
				wis = stats[2];
				cha = stats[5];
			break;
			case "Cleric":
				str = stats[0];
				con = stats[4];
				dex = stats[3];
				intel = stats[2];
				wis = stats[5];
				cha = stats[1];
			break;
			case "Druid":
				str = stats[2];
				con = stats[4];
				dex = stats[3];
				intel = stats[1];
				wis = stats[5];
				cha = stats[0];
			break;
			case "Fighter":
				str = stats[5];
				con = stats[3];
				dex = stats[4];
				intel = stats[0];
				wis = stats[1];
				cha = stats[2];
			break;
			case "Monk":
				str = stats[2];
				con = stats[3];
				dex = stats[5];
				intel = stats[0];
				wis = stats[4];
				cha = stats[1];
			break;
			case "Paladin":
				str = stats[5];
				con = stats[3];
				dex = stats[1];
				intel = stats[2];
				wis = stats[0];
				cha = stats[4];
			break;
			case "Ranger":
				str = stats[2];
				con = stats[1];
				dex = stats[5];
				intel = stats[0];
				wis = stats[4];
				cha = stats[3];
			break;
			case "Rogue":
				str = stats[0];
				con = stats[1];
				dex = stats[5];
				intel = stats[4];
				wis = stats[2];
				cha = stats[3];
			break;
			case "Sorcerer":
				str = stats[0];
				con = stats[4];
				dex = stats[1];
				intel = stats[2];
				wis = stats[3];
				cha = stats[5];
			break;
			case "Warlock":
				str = stats[0];
				con = stats[4];
				dex = stats[2];
				intel = stats[3];
				wis = stats[1];
				cha = stats[5];
			break;
			case "Wizard":
				str = stats[0];
				con = stats[3];
				dex = stats[4];
				intel = stats[5];
				wis = stats[2];
				cha = stats[1];
			break;
		}
	}

	public void raceBuff(String in){
		switch(in){
			case "Human": 
			str++;
			con++;
			dex++;
			intel++;
			wis++;
			cha++;
			break;
			
			case "Lightfoot Halfling":
			dex += 2;
			cha++;
			break;
			
			case "Stout Halfling":
			dex += 2;
			con++;
			break;

			case "High Elves":
			dex += 2;
			intel++;
			break;

			case "Wood Elves":
			dex += 2;
			wis++;
			break;

			case "Drow":
			dex += 2;
			cha++;
			break;

			case "Hill Dwarf":
			con += 2;
			wis++;
			break;

			case "Mountain Dwarf":
			str += 2;
			con += 2;
			break;

			case "Rock Gnome":
			con++;
			intel += 2;
			break;

			case "Forest Gnome":
			dex++;
			intel += 2;
			break;

			case "Half Elf":
			cha += 2;
			break;

			case "Half Orc":
			str += 2;
			con++;
			break;

			case "Tielfling":
			intel++;
			cha += 2;
			break;

			case "Dragonborn":
			str += 2;
			cha++;
			break;
		}
	}

	public void hitPoints(){
		switch (job) {
			case "Barbarian": 
			hp = 12 + modifier(con);
			break;
			case "Bard":
			hp = 8 + modifier(con);
			break;
			case "Cleric":
			hp = 8 + modifier(con);	
			break;
			case "Druid":
			hp = 8 + modifier(con);	
			break;
			case "Fighter":
			hp = 10 + modifier(con);	
			break;
			case "Monk":
			hp = 8 + modifier(con);	
			break;
			case "Paladin":
			hp = 10 + modifier(con);
			break;
			case "Ranger":
			hp = 10 + modifier(con);
			break;
			case "Rogue":
			hp = 8 + modifier(con);
			break;
			case "Sorcerer":
			hp = 6 + modifier(con);
			break;
			case "Warlock":
			hp = 8 + modifier(con);
			break;
			case "Wizard":
			hp = 6 + modifier(con);
			break;
		}

		}

	public int modifier(int x){
		return (int)Math.floor(x-10)/2;	
	}

	public String getRace(){
		return race;
	}
	
	public String getJob(){
		return job;
	}
	
	public String getBg(){
		return bg;
	}
	
	public String getPers(){
		return personality;
	}
	
	public String getIde(){
		return ideal;
	}
	
	public String getBond(){
		return bond;
	}
	
	public String getFlaw(){
		return flaw;
	}

	public String getStr(){
		return (""+str);
	}

	public String getCha(){
		return (""+ cha);
	}

	public String getCon(){
		return (""+ con);
	}
	
	public String getDex(){
		return (""+ dex);
	}

	public String getIntel(){
		return (""+ intel);
	}
	
	public String getWis(){
		return (""+ wis);
	}

	public int getHp(){
		return hp;
	}

}