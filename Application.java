//abstract product class
public abstract interface Application {
    void display();
}

//concrete class #1
class Game implements Application {
    @Override
    public void display() {
        System.out.println("The game class");
    }
}
//concrete class #2
class Shopping implements Application {
    @Override
    public void display() {
        System.out.println("The shopping class");
    }
}

class ApplicationFactory {
    public static Application createApplication(String type) {
        if (type.equals("game")) {
            return new Game();
        } else if (type.equals("shopping")) {
            return new Shopping();
        }
        throw new IllegalArgumentException("Invalid application"+type);
    }
}


