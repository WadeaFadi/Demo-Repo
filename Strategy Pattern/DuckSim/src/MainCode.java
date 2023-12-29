public class MainCode {
    public static void main(String []args)
    {
        StrongDuck s = new StrongDuck();
        s.TypeOfDuck();
        s.perquack();
        s.perfly();
        FlyBehavior fl = new SlowFly();
        s.SetFlyBehavior(fl);
        System.out.print("Sometimes ");
        s.perfly();
        System.out.println("***************************");
        WeakDuck w = new WeakDuck();
        w.TypeOfDuck();
        w.perquack();
        w.perfly();
        QuackBehavior qu = new NoiseQuack();
        w.SetQuackBehavior(qu);
        System.out.print("Sometimes ");
        s.perquack();

    }
}
