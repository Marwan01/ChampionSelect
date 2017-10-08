import java.util.Scanner;
public class Champion {

	private String fav;
	private int lane;
	private int power;
	private int health;
	
	public Champion()
	{
		lane = 0;
		power = 0;
		health = 0;
		fav = null;
	}
	public void choiceEntries()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("What is your favorite lane?");
			System.out.printf("(top=1), (mid=2), (bot=3), (jungle=4), (support=5)");
			lane = sc.nextInt();
		}
		while((lane != 1) && (lane != 2) && (lane !=3) && (lane != 4) && (lane != 5));
		do
		{
			System.out.print("Do you prefer (ad=1) or (ap=2)?");
			power = sc.nextInt();
			
		}
		while((power != 1) && (power != 2));
		do
		{
			System.out.print("Do you like (tank=1) or (squishy=2)?");
			health =  sc.nextInt();
		}
		while ((health != 1) && (health != 2));
		sc.close();
	}
	public void choice()
	{
		if(lane== 1)
		{
			if(power == 1)	
			{
				if(health == 1)
				{
					fav = "You should play Nasus or Gnar!";
				}
				else
				{
					fav = "You Should play Tryndamere or Yasuo!";
				}
			}
			else
			{
				if(health == 1)
				{
					fav = "You should play Cho'gath or Malphite!";
				}
				else
				{
					fav = "You Should play Teemo.";
				}
			}
		}
		else if(lane== 2)
		{
			if(power == 1)	
			{
				if(health == 1)
				{
					fav = "You should play Yasuo!";
				}
				else
				{
					fav = "You Should play Talon!";
				}
			}
			else
			{
				if(health == 1)
				{
					fav = "You should play Diana or Annie!";
				}
				else
				{
					fav = "You Should play Lux or Katarina";
				}
			}
		}
		else if(lane== 3)
		{
			if(power == 1)	
			{
				if(health == 1)
				{
					fav = "You should play Vayne!";
				}
				else
				{
					fav = "You Should play Lucian or Ashe or Tristana or Miss Fortune!";
				}
			}
			else
			{
				if(health == 1)
				{
					fav = "Maybe Ezreal?";
				}
				else
				{
					fav = "You Should play Teemo.";
				}
			}
		}
		if(lane == 4)
		{
			if(power == 1)	
			{
				if(health == 1)
				{
					fav = "You should play Jax or Volibear!";
				}
				else
				{
					fav = "You Should play Tryndamere or Jax or Shaco!";
				}
			}
			else
			{
				if(health == 1)
				{
					fav = "You should play Zac or Maokai!";
				}
				else
				{
					fav = "You Should play Evelynn!";
				}
			}
		}
		else if (lane == 5)
		{
			if(power == 1)	
			{
				if(health == 1)
				{
					fav = "You should play Leona!";
				}
				else
				{
					fav = "You Should play Jax!";
				}
			}
			else
			{
				if(health == 1)
				{
					fav = "You should play Amumu or Maplhite or Nunu!";
				}
				else
				{
					fav = "You Should play Janna or Annie or Lux!";
				}
			}
		}
		
	}
	public String toString()
	{
		return fav;
	}
}
