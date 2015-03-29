import java.lang.Math;
import java.lang.Object;
import java.util.Arrays;


public class charGen{

	int r1;
	int r2;
	int hp;	
	int str;
	int con;
	int dex;
	int intel;
	int wis;
	int cha;
	int[] stats = new int[6];

	String temp;
	String race;
	String job;
	String bg;
	String personality;
	String ideal;
	String bond;
	String flaw;
	//String items;

public static void main(String[] args){
	try
    {
        charGen obj = new charGen();
        obj.run (args);
    }
    catch (Exception e)
    {
        e.printStackTrace ();
    }

	
}

	public void run (String[] args) throws Exception
	{
    	race = raceSelect();
		job = jobSelect();
		bg = bgSelect(job);
		personality = personSelect(bg);
		ideal = idealSel(bg);
		bond = bondSel(bg);
		flaw = flawSel(bg);
		statSort();
		raceBuff();
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

	public String raceSelect(){
		r1 = (int)Math.floor((100*Math.random()+1));
		if(0<=r1 && r1<=32){
			temp = "Human";
		} else if (r1 > 32 && r1 <= 44) {
			temp = "Lightfoot Halfling";
		} else if (r1 > 44 && r1 <= 52) {
			temp = "Stout Halfling";
		} else if (r1 > 52 && r1 <= 58) {
			temp = "High Elves";
		} else if (r1 > 58 && r1 <= 68) {
			temp = "Wood Elves";			
		} else if (r1 > 68 && r1 <= 70) {
			temp = "Drow";
		} else if (r1 > 70 && r1 <= 73) {
			temp = "Hill Dwarf";
		} else if (r1 > 73 && r1 <= 80) {
			temp = "Mountain Dwarf";
		} else if (r1 > 80 && r1 <= 83) {
			temp = "Forest Gnome";
		} else if (r1 > 83 && r1 <= 85){
			temp = "Rock Gnome";
		} else if ( r1 > 85 && r1 <= 90) {
			temp = "Half Elf";
		} else if ( r1 > 90 && r1 <= 94) {
			temp = "Half Orc";
		} else if (r1 > 94 && r1 <= 97) {
			temp = "Tielfling";
		}
		else{
			temp = "Dragonborn";
		}

		return temp;
	}

	public String jobSelect(){
		r1 = (int)Math.floor((12*Math.random()+1));
		switch(r1){
			case 1: temp = "Barbarian";
			break;
			case 2: temp = "Bard";
			break;
			case 3: temp = "Cleric";
			break;
			case 4: temp = "Druid";
			break;
			case 5: temp = "Fighter";
			break;
			case 6: temp = "Monk";
			break;
			case 7: temp = "Paladin";
			break;
			case 8: temp = "Ranger";
			break;
			case 9: temp = "Rogue";
			break;
			case 10: temp = "Sorcerer";
			break;
			case 11: temp = "Warlock";
			break;
			case 12: temp = "Wizard";
			break;
		}
		return temp;
	}

	public String bgSelect(String in){
		if (in.equals("Barbarian")) {
			temp = "Outlander";
		} else if (in.equals("Bard")){
			temp = "Entertainer";
		} else if (in.equals("Cleric")) {
			temp = "Acoylyte";
		} else if (in.equals("Druid")){
			temp = "Hermit";
		} else if (in.equals("Fighter")) {
			temp = "Soldier";
		} else if (in.equals("Monk")) {
			temp = "Hermit";
		} else if (in.equals("Paladin")) {
			temp = "Noble";
		} else if (in.equals("Ranger")) {
			temp = "Outlander";
		} else if (in.equals("Rogue")) {
			temp = "Charlatan";
		} else if (in.equals("Sorcerer")) {
			temp = "Hermit";
		} else if (in.equals("Warlock")) {
			temp = "Charlatan";
		} else if (in.equals("Wizard")) {
			temp = "Sage";
		}
		return temp;
	}
	public String personSelect(String in){
		r1 =  (int)Math.floor(8*Math.random() + 1);
		switch(r1){
			case 1: 
				if (in.equals("Acoylyte")) {
					temp = "I idolize a Hero of my faith and constantly compare myself to them.";
				} else if (in.equals("Charlatan")) {
					temp = "I fall in and out love easily, and am always pursuing someone.";
				}else if (in.equals("Entertainer")) {
					temp = "I know a story relevant to almost every situation.";
				}else if (in.equals("Hermit")) {
					temp = "I've been isolated for so long that I rarely speak, preferring gesture and the occasional grunt.";
				}else if (in.equals("Noble")) {
					temp = "My eloquent flattery makes everyone I talk to feel like the most wonderful and important person in the world.";	
				}else if (in.equals("Outlander")) {
					temp = "I'm driven by a wanderlust that led me away from home.";
				} else if (in.equals("Sage")) {
					temp = "I use polysyllabic words that convey the impression of great erudition.";
				}else if (in.equals("Soldier")) {
					temp = "I'm always polite and respectful.";
				}
				break;
			case 2:
				if (in.equals("Acoylyte")) {
					temp = "I can find common ground between the fiercest enemies, empathizing with them and always working towards peace.";
				} else if (in.equals("Charlatan")) {
					temp = "I have a joke for every occasion, especially occasions where humour is inappropriate.";
				}else if (in.equals("Entertainer")) {
					temp = "Whenever I come to a new place, I collect local rumours and spread gossip.";
				}else if (in.equals("Hermit")) {
					temp = "I am utterly serene, even in face of disaster";
				}else if (in.equals("Noble")) {
					temp = "The common folk love me for my kindness and generosity.";	
				}else if (in.equals("Outlander")) {
					temp = "I watch over my friends as if they were a litter of newborn pups.";
				} else if (in.equals("Sage")) {
					temp = "I've read every book in the world's greatest libraries - or I like to boast that I have.";
				}else if (in.equals("Soldier")) {
					temp = "I'm haunted by the memories of war. I can't get the images of violence out of my mind.";
				}
				break;
			case 3:
				if (in.equals("Acoylyte")) {
					temp = "I see omens in every event and action. The gods try to speak to us, we just need to listen.";
				} else if (in.equals("Charlatan")) {
					temp = "Flattery is my preferred trick for getting what I want.";
				}else if (in.equals("Entertainer")) {
					temp = "I'm a hopeless romantic, always searching for that \"special someone.\"";
				}else if (in.equals("Hermit")) {
					temp = "The leader of my community had something wise to say on every topic, and I am eager to share that wisdom.";
				}else if (in.equals("Noble")) {
					temp = "No one could doubt by looking at regal bearing that I am a cut above the unwashed masses.";	
				}else if (in.equals("Outlander")) {
					temp = "I once ran 25 miles without stopping, to warn my clan of an approaching orc horde. I'd do it again if I had to.";
				} else if (in.equals("Sage")) {
					temp = "I'm used to helping out those who aren't as smart as I am, and I patiently explain anything and everything to others.";
				}else if (in.equals("Soldier")) {
					temp = "I've lost too many friends, and I'm slow to make new ones.";
				}
			break;
			case 4:
				if (in.equals("Acoylyte")) {
					temp = "Nothing can shake my optimistic attitude.";
				} else if (in.equals("Charlatan")) {
					temp = "I'm a born gambler who can't resist taking a risk for a potential payoff.";
				}else if (in.equals("Entertainer")) {
					temp = "Nobody stays angry at me or around me for long, since I can defuse any amount of tension.";
				}else if (in.equals("Hermit")) {
					temp = "I feel tremendous empathy for all who suffer.";
				}else if (in.equals("Noble")) {
					temp = "I take great pains to always look my best and follow the latest fashions.";	
				}else if (in.equals("Outlander")) {
					temp = "I have a lesson for every situation, drawn from observing nature.";
				} else if (in.equals("Sage")) {
					temp = "There's nothing I like more than a good mystery.";
				}else if (in.equals("Soldier")) {
					temp = "I'm full of inspiring and cautionary tales from my military experience relevant to almost every combat situation.";
				}
			break;
			case 5:
				if (in.equals("Acoylyte")) {
					temp = "I quote (or misquote sacred texts and proverbs in almost every situation.)";
				} else if (in.equals("Charlatan")) {
					temp = "I lie about almost everything, even when there's no good reason to.";
				}else if (in.equals("Entertainer")) {
					temp = "I love a good insult, even one directed at me.";
				}else if (in.equals("Hermit")) {
					temp = "I'm oblivious to etiquette and social expectations.";
				}else if (in.equals("Noble")) {
					temp = "Despite my noble birth, I do not place myself above other folk. We all have the same blood.";	
				}else if (in.equals("Outlander")) {
					temp = "I place no stock in wealthy or well-mannered folk. Money and manners won't save you from a hungry owlbear.";
				} else if (in.equals("Sage")) {
					temp = "I'm willing to listen to every side of an argument before I make my own judgement.";
				}else if (in.equals("Soldier")) {
					temp = "I can stare down a hell hound without flinching.";
				}
			break;
			case 6:
				if (in.equals("Acoylyte")) {
					temp = "I am tolerant (or intolerant) of other faiths and respect (or condemn) the worship of other gods.";
				} else if (in.equals("Charlatan")) {
					temp = "Sarcasm and insults are my weapons of choice.";
				}else if (in.equals("Entertainer")) {
					temp = "I get bitter if I'm not the center of attention.";
				}else if (in.equals("Hermit")) {
					temp = "I connect everything that happens to me to a grand, cosmic plan.";
				}else if (in.equals("Noble")) {
					temp = "My favor, once lost, is lost forever.";	
				}else if (in.equals("Outlander")) {
					temp = "I'm always picking things up, absently fiddling with them, and sometimes accidentally breaking them.";
				} else if (in.equals("Sage")) {
					temp = "I speak slowly when talking to idiots, which almost everyone is compared to me.";
				}else if (in.equals("Soldier")) {
					temp = "I enjoy being strong and like breaking things.";
				}
			break;
			case 7:
				if (in.equals("Acoylyte")) {
					temp = "I've enjoyed fine food, drink, and high society among my temple's elite. Rough living grates on me.";
				} else if (in.equals("Charlatan")) {
					temp = "I keep multiple holy symbols on me and invoke whatever deity might come in useful at any given moment.";
				}else if (in.equals("Entertainer")) {
					temp = "I'll settle for nothing less than perfection.";
				}else if (in.equals("Hermit")) {
					temp = "I often get lost in my own thoughts and contemplation, becoming oblivious to my surroundings.";
				}else if (in.equals("Noble")) {
					temp = "If you do me an injury, I will crush you, ruin your name, and salt your fields.";	
				}else if (in.equals("Outlander")) {
					temp = "I feel far more comfortable around animals than people.";
				} else if (in.equals("Sage")) {
					temp = "I am horribly, horribly awkward in social.";
				}else if (in.equals("Soldier")) {
					temp = "I have a crude sense of humour.";
				}
			break;
			case 8:
				if (in.equals("Acoylyte")) {
					temp = "I've spent so long in the temple that I have little practical experience dealing with people in the outside world.";
				} else if (in.equals("Charlatan")) {
					temp = "I pocket anything I see that might have some value.";
				}else if (in.equals("Entertainer")) {
					temp = "I'll change my mood or my mind as quickly as I change key in a song.";
				}else if (in.equals("Hermit")) {
					temp = "I am working on a grand philosophical theory and love sharing my ideas.";
				}else if (in.equals("Noble")) {
					temp = "I don't like to get my hands dirty, and I won't be caught dead in unsuitable accomadations.";
				}else if (in.equals("Outlander")) {
					temp = "I was in fact raised by wolves.";
				} else if (in.equals("Sage")) {
					temp = "I'm convinced that peopl are always trying to steal my secrets.";
				}else if (in.equals("Soldier")) {
					temp = "I face problems head-on. A simple, direct solution is the best path to success.";
				}
			break;
		}
		return temp;
	}

	public String idealSel(String in){
		r1 = (int)Math.random()*6 + 1;
		switch(r1){
			case 1:
				if (in.equals("Acoylyte")) {
					temp = "The ancient traditions of worship and sacrifice must be preserved and uphelp.";
				} else if (in.equals("Charlatan")) {
					temp = "I am a free spirit no one tells me what to do.";
				}else if (in.equals("Entertainer")) {
					temp = "When I perform, I make the world better than it was.";
				}else if (in.equals("Hermit")) {
					temp = "My gifts are meant to be shared with all, not used for my own benefit.";
				}else if (in.equals("Noble")) {
					temp = "Respect is due to me because of my position, but all people regardless of statio deserve to be treated with dignity.";	
				}else if (in.equals("Outlander")) {
					temp = "Life is like the seasons, in constant change, and we must change with it.";
				} else if (in.equals("Sage")) {
					temp = "The path to power and self-improvement is through knowledge.";
				}else if (in.equals("Soldier")) {
					temp = "Our lot is to lay down our lives in the defense of others,";
				}
			break;
			case 2:
				if (in.equals("Acoylyte")) {
					temp = "I always try to help those in need, no matter what the personal cost.";
				} else if (in.equals("Charlatan")) {
					temp = "I never target people that can't afford to lose a few coins.";
				}else if (in.equals("Entertainer")) {
					temp = "The stories, legends, and songs of the past must never be forgotten, for they teach us who we are.";
				}else if (in.equals("Hermit")) {
					temp = "Emotions must not cloud our sense of what is right and true, or our logical thinking.";
				}else if (in.equals("Noble")) {
					temp = "It is my duty to respect the authority of those above me, just as those below me must respect mine.";	
				}else if (in.equals("Outlander")) {
					temp = "It is a person's responsibility to make the most happiness for the whole tribe.";
				} else if (in.equals("Sage")) {
					temp = "What is beatiful points us beyond itself toward what is true.";
				}else if (in.equals("Soldier")) {
					temp = "I do what I must and obey just authority.";
				}
			break;
			case 3:
				if (in.equals("Acoylyte")) {
					temp = "We must help bring about the changes the gods are constantly working in the world.";
				} else if (in.equals("Charlatan")) {
					temp = "I distribute the money I acquire to the people who really need it.";
				}else if (in.equals("Entertainer")) {
					temp = "The world is in need of new ideas and bold action.";
				}else if (in.equals("Hermit")) {
					temp = "Inquiry and curiosity are the pillars of progress.";
				}else if (in.equals("Noble")) {
					temp = "I must prove that I can handle myself without the coddling of my family.";	
				}else if (in.equals("Outlander")) {
					temp = "If I dishonour myself, I dishonour my whole clan";
				} else if (in.equals("Sage")) {
					temp = "Emotions must not cloud our logical thinking.";
				}else if (in.equals("Soldier")) {
					temp = "When people follow orders blindly, they embrace a kind of tyranny.";
				}
			break;
			case 4:
				if (in.equals("Acoylyte")) {
					temp = "I hope to one day rise to the top of my faith's religious hierarchy.";
				} else if (in.equals("Charlatan")) {
					temp = "I never run the same con twice.";
				}else if (in.equals("Entertainer")) {
					temp = "I’m only in it for the money and fame.";
				}else if (in.equals("Hermit")) {
					temp = "Solitude and contemplation are paths toward mystical or magical power.";
				}else if (in.equals("Noble")) {
					temp = "If I can attain more power, no one will tell me what to do.";	
				}else if (in.equals("Outlander")) {
					temp = "The natural world is more important than all the constructs of civilization.";
				} else if (in.equals("Sage")) {
					temp = "Nothing should fetter the infinite possiblity inherent in all existence.";
				}else if (in.equals("Soldier")) {
					temp = "In life as in war, the stronger force wins.";
				}
			break;
			case 5:
				if (in.equals("Acoylyte")) {
					temp = "I trust that my deity will guide my actions. I have faith that if I work hard, things will go well.";
				} else if (in.equals("Charlatan")) {
					temp = "Material goods come and go. Bonds of friendship last forever.";
				}else if (in.equals("Entertainer")) {
					temp = "I like seeing the smiles on people’s faces when I perform. That’s all that matters.";
				}else if (in.equals("Hermit")) {
					temp = "Meddling in the affairs of others only causes trouble.";
				}else if (in.equals("Noble")) {
					temp = "Blood runs thicker than water.";	
				}else if (in.equals("Outlander")) {
					temp = "I must earn glory in battle, for myself and my clan.";
				} else if (in.equals("Sage")) {
					temp = "knowledge is the path to power and domination.";
				}else if (in.equals("Soldier")) {
					temp = "Ideals aren't worth killing over or going to war for.";
				}
			break;
			case 6:
				if (in.equals("Acoylyte")) {
					temp = "I seek to prove myself worthy of my god's favor by matching my actions against his or her teachings.";
				} else if (in.equals("Charlatan")) {
					temp = "I'm determined to make something of myself.";
				}else if (in.equals("Entertainer")) {
					temp = "Art should reflect the soul; it should come from within and reveal who we really are.";
				}else if (in.equals("Hermit")) {
					temp = "If you know yourself, there's nothing left to know.";
				}else if (in.equals("Noble")) {
					temp = "It is my duty to protect and care for the people beneath me.";	
				}else if (in.equals("Outlander")) {
					temp = "The strongest are meant to rule.";
				} else if (in.equals("Sage")) {
					temp = "The goal of a life of study is the betterment of oneself.";
				}else if (in.equals("Soldier")) {
					temp = "My city, nation, or people are all that matter.";
				}
			break;
		}
		return temp;
	}

	public String bondSel(String in){
		r1 = (int)Math.random()*6 + 1;
		switch(r1){
			case 1:
				if (in.equals("Acoylyte")) {
					temp = "I would die to recover and ancient relic of my faith that was lost long ago.";
				} else if (in.equals("Charlatan")) {
					temp = "I fleeced the wrong person and must work to ensure that this individual never crosses paths with me or those that I care about.";
				}else if (in.equals("Entertainer")) {
					temp = "My instrument is my most treasured possession, and it reminds me of someone I love.";
				}else if (in.equals("Hermit")) {
					temp = "Nothing is more important than the other members of my hermitage, order, or association.";
				}else if (in.equals("Noble")) {
					temp = "I will face any challenge to win the approval of my family.";	
				}else if (in.equals("Outlander")) {
					temp = "My family, clan, or tribe is the most important thing in my life, even when they are far from me.";
				} else if (in.equals("Sage")) {
					temp = "It is my duty to protect my students.";
				}else if (in.equals("Soldier")) {
					temp = "I would still lay down my life for the peopl I served with.";
				}
			break;
			case 2:
				if (in.equals("Acoylyte")) {
					temp = "I will someday get revenge on the corrupt temple hierarchy who branded me a heretic.";
				} else if (in.equals("Charlatan")) {
					temp = "I owe everything to my mentor - a horrible person who's probably rotting in jail somewhere.";
				}else if (in.equals("Entertainer")) {
					temp = "Some stole my precious instrument, and someday I'll get it back.";
				}else if (in.equals("Hermit")) {
					temp = "I entered seclusion to hide from the ones who might still be hunting me. I must someday confront them.";
				}else if (in.equals("Noble")) {
					temp = "My house's alliance with another noble family must be sustained at all costs.";	
				}else if (in.equals("Outlander")) {
					temp = "An injury to the unspoiled wilderness of my home is an injury to me.";
				} else if (in.equals("Sage")) {
					temp = "I have ancient text that holds terrible secrets that must not fall into the wrong hands.";
				}else if (in.equals("Soldier")) {
					temp = "Somene save my life on the battlefield. To this day, I will never leave a friend behind.";
				}
			break;
			case 3:
				if (in.equals("Acoylyte")) {
					temp = "I owe my life to the priest who took me who took me in when my parents died.";
				} else if (in.equals("Charlatan")) {
					temp = "Somewhere out ther, I have a child who doesn't know me. I'm making the world better for him or her.";
				}else if (in.equals("Entertainer")) {
					temp = "I want to be famous, whatever it takes.";
				}else if (in.equals("Hermit")) {
					temp = "I'm still seeking the enlightenment I pursued in my seclusion, and it still eludes me.";
				}else if (in.equals("Noble")) {
					temp = "Nothing is more important than the other members of my family.";	
				}else if (in.equals("Outlander")) {
					temp = "I will bring terrible wrath down on the evil doers who destroyed my homeland.";
				} else if (in.equals("Sage")) {
					temp = "I work to preserve a library, university, scriptorium, or monastery.";
				}else if (in.equals("Soldier")) {
					temp = "My honour is my life.";
				}
			break;
			case 4:
				if (in.equals("Acoylyte")) {
					temp = "Everything I do is for the common people.";
				} else if (in.equals("Charlatan")) {
					temp = "I come from a noble family, and one day I'll reclaim my lands and title from those who stole them from me.";
				}else if (in.equals("Entertainer")) {
					temp = "I idolize a hero of the old tales and measure my deeds against that person's.";
				}else if (in.equals("Hermit")) {
					temp = "I entered seclusion because I loved someone I could not have.";
				}else if (in.equals("Noble")) {
					temp = "I am in love with the heir of a family that my family despises.";	
				}else if (in.equals("Outlander")) {
					temp = "I am the last of my tribe, and it is up to me to ensure their names enter legend.";
				} else if (in.equals("Sage")) {
					temp = "My life's work is a series of tomes related to a specific field of lore.";
				}else if (in.equals("Soldier")) {
					temp = "I'll never forget the crushing defeat my company suffered or the enemies who dealt it.";
				}
			break;
			case 5:
				if (in.equals("Acoylyte")) {
					temp = "I will do anything to protect the temple were I served.";
				} else if (in.equals("Charlatan")) {
					temp = "A powerful person killed someone I love. Some day soon, I'll have my revenge.";
				}else if (in.equals("Entertainer")) {
					temp = "I will do anything to prove myself superior to my hated rival.";
				}else if (in.equals("Hermit")) {
					temp = "Should my discovery come to light, it could bring ruin to the world.";
				}else if (in.equals("Noble")) {
					temp = "My loyalty to my sovereign is unwavering.";	
				}else if (in.equals("Outlander")) {
					temp = "I suffer awful visions of a coming disaster and will do nothing to prevent it.";
				} else if (in.equals("Sage")) {
					temp = "I've been searching my whole life for the answer to a certain question.";
				}else if (in.equals("Soldier")) {
					temp = "Those who fight beside me are those worth dying for.";
				}
			break;
			case 6:
				if (in.equals("Acoylyte")) {
					temp = "I seek to preserved a sacred text that my enemies consider heretical and seek to destroy.";
				} else if (in.equals("Charlatan")) {
					temp = "I swindled and ruined a person who didnt deserve it. I seek to atone for my misdeeds but might never be able to forgive myself.";
				}else if (in.equals("Entertainer")) {
					temp = "I would do anything for the other members of my old troupe.";
				}else if (in.equals("Hermit")) {
					temp = "My isolation gave me great insight into a great evil that only I can destroy.";
				}else if (in.equals("Noble")) {
					temp = "The common folk must see me as a hero of the people.";	
				}else if (in.equals("Outlander")) {
					temp = "It is my duty to provide children to sustain my tribe.";
				} else if (in.equals("Sage")) {
					temp = "I sold my soul for knowledge. I hope to do great deeds and win it back.";
				}else if (in.equals("Soldier")) {
					temp = "I fight for those who cannot fight for themselves.";
				}
			break;
		}
		return temp;
	}

	public String flawSel(String in){
		r1 = (int)Math.random()*6 + 1;
		switch(r1){
			case 1:
				if (in.equals("Acoylyte")) {
					temp = "I judge others harshly, and myself even more severely.";
				} else if (in.equals("Charlatan")) {
					temp = "I can't resist a pretty face.";
				}else if (in.equals("Entertainer")) {
					temp = "I'll do anything to win fame and renown.";
				}else if (in.equals("Hermit")) {
					temp = "Now that I've returned to the world, I enjoy its delights a little too much.";
				}else if (in.equals("Noble")) {
					temp = "I secretly believe that everyone is beneath me.";	
				}else if (in.equals("Outlander")) {
					temp = "I am too enamored of ale, wine, and other intoxicants.";
				} else if (in.equals("Sage")) {
					temp = "I am easily distracted by the promise of information.";
				}else if (in.equals("Soldier")) {
					temp = "The monstrous enemy we faced in battle still leaves me quivering with fear.";
				}
			break;
			case 2:
				if (in.equals("Acoylyte")) {
					temp = "I put too much trust in those who wield power within my temple's hierarchy.";
				} else if (in.equals("Charlatan")) {
					temp = "I'm always in debt. I spend all my ill-gotten gains on decadent luxuries faster than I bring them in...";
				}else if (in.equals("Entertainer")) {
					temp = "I'm a sucker for a pretty face.";
				}else if (in.equals("Hermit")) {
					temp = "I harbor dark, bloodthirsty thoughts that my isolation and meditation failed to quell.";
				}else if (in.equals("Noble")) {
					temp = "I hide a truly scandalous secret that could ruin my family forever.";	
				}else if (in.equals("Outlander")) {
					temp = "There's no room for caution in a life lived to the fullest.";
				} else if (in.equals("Sage")) {
					temp = "Most people scream and run when they see a demon. I stop and take notes on its anatomy.";
				}else if (in.equals("Soldier")) {
					temp = "I have little respect for anyone who is not a proven warrior.";
				}
			break;
			case 3:
				if (in.equals("Acoylyte")) {
					temp = "My piety sometimes leads me to blindly trust those that profess faith in my god.";
				} else if (in.equals("Charlatan")) {
					temp = "I'm convinced that no one could ever fool me the way I fool others.";
				}else if (in.equals("Entertainer")) {
					temp = "A scandal prevents me from ever going home again. That kind of trouble seems to follow me around.";
				}else if (in.equals("Hermit")) {
					temp = "I am dogmatic in my thoughts and my philosophy.";
				}else if (in.equals("Noble")) {
					temp = "I too often hear veiled insults and threats in every word addressed to me, and I'm quick to anger.";	
				}else if (in.equals("Outlander")) {
					temp = "I remember every insult I've received and nurse a silent resentment toward anyone who's ever wronged me.";
				} else if (in.equals("Sage")) {
					temp = "Unlocking an ancient mystery is worth price of a civilization.";
				}else if (in.equals("Soldier")) {
					temp = "I made a terrible mistake in battle that cost many lives - and I would do anything to keep that mistake secret.";
				}
			break;
			case 4:
				if (in.equals("Acoylyte")) {
					temp = "I am inflexible in my thinking.";
				} else if (in.equals("Charlatan")) {
					temp = "I'm too greedy for my own good. I cant resist taking a risk if there's money involved.";
				}else if (in.equals("Entertainer")) {
					temp = "I once satirized a noble who still wants my head. It ws a mistake that I will likely repeat.";
				}else if (in.equals("Hermit")) {
					temp = "I let my need to win arguments overshadow friendships and harmony.";
				}else if (in.equals("Noble")) {
					temp = "I have an insatiable desire for carnal pleasures.";	
				}else if (in.equals("Outlander")) {
					temp = "I am slow to trust members of other races, tribes, and societies.";
				} else if (in.equals("Sage")) {
					temp = "I overlook obvious solutions in favor of complicated.";
				}else if (in.equals("Soldier")) {
					temp = "My hatred of my enemies is blind and unreasoning.";
				}
			break;
			case 5:
				if (in.equals("Acoylyte")) {
					temp = "I am suspicious of strangers and expect the worst of them.";
				} else if (in.equals("Charlatan")) {
					temp = "I can't resist swindling people who are more powerful than me.";
				}else if (in.equals("Entertainer")) {
					temp = "I have trouble keeping my true feelings hidden. My sharp tongue lands me in trouble.";
				}else if (in.equals("Hermit")) {
					temp = "I'd risk too much to uncover a lost bit of knowledge.";
				}else if (in.equals("Noble")) {
					temp = "In fact, the world does revolve around me.";	
				}else if (in.equals("Outlander")) {
					temp = "Violence is my answer to almost any challenge.";
				} else if (in.equals("Sage")) {
					temp = "I speak without really thinking through my words, invariably insulting others.";
				}else if (in.equals("Soldier")) {
					temp = "I obey the law, even if the law causes misery.";
				}
			break;
			case 6:
				if (in.equals("Acoylyte")) {
					temp = "Once I pick a goal, I become obsessed with it to the detriment of everything else in my life.";
				} else if (in.equals("Charlatan")) {
					temp = "I hate to admit it and will hate myself for it, but I'll run and preserve my own hide if the going gets tough.";
				}else if (in.equals("Entertainer")) {
					temp = "Despite my best efforts, I am unreliable to my friends.";
				}else if (in.equals("Hermit")) {
					temp = "I like keeping secrets and won't share them with anyone.";
				}else if (in.equals("Noble")) {
					temp = "By my words and actions, I often bring shame to my family.";	
				}else if (in.equals("Outlander")) {
					temp = "Don't expect me to save those who can't save themselves. It is nature's way that the strong thrive and the weak perish.";
				} else if (in.equals("Sage")) {
					temp = "I can't keep a secret to save my life, or anyone else's.";
				}else if (in.equals("Soldier")) {
					temp = "I'd rather eat my armor than admit when I'm wrong.";
				}
			break;
		}
	return temp;
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

	public void statSort(){
		statGen();
		switch(job){
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

	public void raceBuff(){
		switch(race){
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
		if (x == 1) {
			return -5;
		}else if (x == 2 || x == 3) {
			return -4;
		}else if (x == 4 || x == 5) {
			return -3;
		}else if (x == 6 || x ==  7) {
			return -2;
		}else if (x == 8 || x == 9) {
			return -1;
		}else if (x == 10 || x == 11) {
			return 0;
		}else if (x == 12 || x == 13) {
			return 1;
		}else if (x == 14 || x == 15) {
			return 2;
		}else if (x == 16 || x == 17) {
			return 3;
		}else if (x == 18 || x == 19) {
			return 4;
		}else if (x == 20 || x == 21) {
			return 5;
		}else if (x == 22 || x == 23) {
			return 6;
		}else if (x == 24 || x == 25) {
			return 7;
		}else if (x == 26 || x == 27) {
			return 8;
		}else if (x == 28 || x == 29) {
			return 9;
		}else if ( x == 30) {
			return 10;
		}else {
			return 0;
		}
		
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

}