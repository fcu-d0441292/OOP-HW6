package fcu.iecs.oop.pokemon;

import java.util.Random;

public class GYM {
	private static Pokemon[] c;
	private static Pokemon[] d;
	public static void fight(Player...players){
		Random a=new Random();
		int g;
		g=a.nextInt(2);
		int e=0;
		int f=0;
		c=players[0].getPokemons();
		d=players[1].getPokemons();
		for(int i=0;i<3;i++){
			if(c[i].getType()==PokemonType.FIRE && d[i].getType()==PokemonType.GRASS){
				e++;
			}else if(d[i].getType()==PokemonType.FIRE && c[i].getType()==PokemonType.GRASS){
				f++;
			}else if(c[i].getType()==PokemonType.GRASS && d[i].getType()==PokemonType.WATER){
				e++;
			}else if(d[i].getType()==PokemonType.GRASS && c[i].getType()==PokemonType.WATER){
				f++;
			}else if(c[i].getType()==PokemonType.WATER && d[i].getType()==PokemonType.FIRE){
				e++;
			}else if(d[i].getType()==PokemonType.WATER && c[i].getType()==PokemonType.FIRE){
				f++;
			}else if(c[i].getType()==d[i].getType()){
				if(c[i].getCp()>d[i].getCp()){
					e++;
				}else if(c[i].getCp()<d[i].getCp()){
					f++;
				}else if(c[i].getCp()==d[i].getCp()){
					if(g==0){
						e++;
					}else if(g==1){
						f++;
					}
				}
			}
		}
		if(e==2){
			int level=players[0].getLevel();
			level++;
			players[0].setLevel(level);
			System.out.println("Winner is ["+players[0].getPlayerName()+"], and his/her level becomes ["+ players[0].getLevel()+"]");
		}else if(f==2){
			int level=players[1].getLevel();
			level++;
			players[1].setLevel(level);
			System.out.println("Winner is ["+players[1].getPlayerName()+"], and his/her level becomes ["+ players[1].getLevel()+"]");
		}
	}

}