public class WeakDuck extends Duck{
    public WeakDuck()
    {
        quackbehavior = new LowQuack();
        flybehavior = new SlowFly();
    }
    @Override
    public void TypeOfDuck()
    {
        System.out.println("I am a Weak Duck :|");
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
