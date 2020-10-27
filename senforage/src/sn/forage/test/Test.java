package sn.forage.test;

import sn.forage.dao.IUSERS;
import sn.forage.dao.Userforage;
import sn.forage.entities.Users;

public class Test {
	public static void main(String[] args) {
		IUSERS usersdao = new Userforage();
		Users u = new Users();
		u.setNom("Diatta");
		u.setPrenom("NOEL");
		u.setIdentifiant("nono@gmail.com");
		u.setPassword("123passer");
		System.out.println(usersdao.add(u));
	}

}
