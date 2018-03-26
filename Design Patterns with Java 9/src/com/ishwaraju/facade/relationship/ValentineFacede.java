package com.ishwaraju.facade.relationship;

public class ValentineFacede {
	private final Valentine velantine;

	public ValentineFacede(Valentine velantine) {
		this.velantine = velantine;
	}

	public void patchUp() {
		velantine.roseDay();
		velantine.proposeDay();
		velantine.chcocolaetDay();
		velantine.teddyDay();
		velantine.promiseDay();
		velantine.hugDay();
		velantine.kissDay();
		velantine.valentineDay();

		System.out.println("Congratulation !!! you got a life partner !!");
	}

	public void breakup() {
		velantine.kickDay();
		velantine.slapDay();
		velantine.kickDay();
		velantine.perfumeDay();
		velantine.flirtingDay();
		velantine.confessionDay();
		velantine.missingDay();
		velantine.breakupDay();

		System.out.println("Sorry about your breakup");
	}
}
