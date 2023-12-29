public class StrongDuck extends Duck{
    public StrongDuck()
    {
        quackbehavior = new NoiseQuack();
        flybehavior = new QuickFly();
    }
    @Override
    public void TypeOfDuck()
    {
        System.out.println("I am a Strong Duck :|");
    }
    @Override
    public void perquack()
    {
        quackbehavior.quack();
    }
    @Override
    public void perfly()
    {
        flybehavior.fly();
    }
}
