package com.kh.game.monster.model.vo;

import com.kh.game.job.model.vo.Characters;

public abstract class Monster {
	private String name;
	private int atk;
	private int hp;
	private int exp;
	
	public Monster() {
		
	}

	public Monster(String name, int atk, int hp, int exp) {
		this.name = name;
		this.atk = atk;
		this.hp = hp;
		this.exp = exp;
	}
	
	@Override
	public String toString() {
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	public abstract void attack(Characters c);
}
