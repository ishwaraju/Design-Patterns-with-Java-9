package com.ishwaraju.facade.relationship;

public class TestFacedePattern {
	public static void main(String[] args) {
		Valentine valentine = new Valentine();
		ValentineFacede valentineFacede = new ValentineFacede(valentine);
		valentineFacede.patchUp();
		System.out.println("Congrats!!! you are lucky  to have a wonderful person in your life !!");

		valentineFacede.breakup();
		System.out.println("Sorry for your loss !!!");
	}
}
