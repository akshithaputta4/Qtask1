abstract class Flower {
     public abstract String whatsYourName();
}

class Jasmine extends Flower{
    @Override
    public String whatsYourName()
    {
        return "Jasmine";
    }
}

class Lily extends Flower{
    @Override
    public String whatsYourName()
    {
        return "Lily";
    }
}

 abstract class Region {
     public abstract Flower yourNationalFlower();
}

class WestBengal extends Region{
    @Override
    public Jasmine yourNationalFlower()
    {
        return new Jasmine();
    }
}

class AndhraPradesh extends Region{
    @Override
    public Lily yourNationalFlower()
    {
        return new Lily();
    }
}

