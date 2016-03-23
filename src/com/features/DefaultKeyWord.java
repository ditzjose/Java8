package com.features;
interface Actor
{
	void act();
	void speak();
	default void comedy() // class implementing this interface no need to override comedy, hence default keyword is used
	{
		System.out.println("Comedy interface.. .. ");
	}
	// These are called as default methods()
	default void rude() 
	{
		System.out.println("rude interface.. .. ");
	}
}
class Comedian implements Actor
{

	@Override
	public void act() {
		System.out.println("act.. .. ");
	}

	@Override
	public void speak() {
		System.out.println("speak.. .. ");
		
	}
	
	@Override
	public void comedy()
	{
		System.out.println("comedy.. .. ");
	}

}
class Villian implements Actor
{
	@Override
	public void act() {
		System.out.println("act.. .. ");
	}

	@Override
	public void speak() {
		System.out.println("speak.. .. ");
		
	}
	
	@Override
	public void rude()
	{
		System.out.println("rude.. .. ");
	}	
}
public class DefaultKeyWord {
	public static void main(String... command)
	{
		
	}
}
