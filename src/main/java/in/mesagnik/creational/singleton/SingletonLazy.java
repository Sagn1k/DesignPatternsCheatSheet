package in.mesagnik.creational.singleton;

class SingletonLazy {
    // static class
    private static SingletonLazy instance;
    private SingletonLazy()
    {
        System.out.println("Singleton is Instantiated.");
    }
    public static SingletonLazy getInstance()
    {
        if (instance == null)
            instance = new SingletonLazy();
        return instance;
    }
    public void doSomething()
    {
        System.out.println("Something is Done.");
    }
}

//Making it thread safe by static initialization by JDK

class SingletonStatic {
    private static SingletonStatic obj = new SingletonStatic();
    private SingletonStatic() {}

    public static SingletonStatic getInstance() { return obj; }

    public void doSomething()
    {
        System.out.println("Something is Done.");
    }
}

class SingletonThreadSafe {
    private static volatile SingletonThreadSafe obj = null;
    private SingletonThreadSafe() {}

    public static SingletonThreadSafe getInstance()
    {
        if (obj == null) {
            // To make thread safe
            synchronized (SingletonThreadSafe.class)
            {
                // check again as multiple threads
                // can reach above step
                if (obj == null)
                    obj = new SingletonThreadSafe();
            }
        }
        return obj;
    }

    public void doSomething()
    {
        System.out.println("Something is Done.");
    }
}

class SingletonLazyMain {
    public static void main(String[] args)
    {
        SingletonLazy.getInstance().doSomething();

        SingletonStatic.getInstance().doSomething();

        SingletonThreadSafe.getInstance().doSomething();

    }
}
