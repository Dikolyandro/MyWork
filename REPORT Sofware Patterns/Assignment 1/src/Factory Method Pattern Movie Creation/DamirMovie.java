import java.util.Scanner;

public interface DamirMovie {
    String getTitle();
    void play();
}

class ZhaiMovie implements DamirMovie {
    private String title;

    public ZhaiMovie(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void play() {
        System.out.println("Playing Zhai and not interesting movie: " + title);
    }
}
class IMAXMovie implements DamirMovie {
    private String title;

    public IMAXMovie(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void play() {
        System.out.println("Playing IMAX movie: " + title);
    }
}

class ThreeDMovie implements DamirMovie {
    private String title;

    public ThreeDMovie(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void play() {
        System.out.println("Playing 3D movie: " + title);
    }
}
class AnimationMovie implements DamirMovie {
    private String title;

    public AnimationMovie(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void play() {
        System.out.println("Playing Animation Movie: " + title);
    }
}

abstract class MovieFactory {
    public abstract DamirMovie createMovie(String title);
}

class ZhaiMovieFactory extends MovieFactory {
    @Override
    public DamirMovie createMovie(String title) {
        return new ZhaiMovie(title);
    }
}

class IMAXMovieFactory extends MovieFactory {
    @Override
    public DamirMovie createMovie(String title) {
        return new IMAXMovie(title);
    }
}

class ThreeDMovieFactory extends MovieFactory {
    @Override
    public DamirMovie createMovie(String title) {
        return new ThreeDMovie(title);
    }
}

class AnimationMovieFactory extends MovieFactory {
    @Override
    public DamirMovie createMovie(String title) {
        return new AnimationMovie(title);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose movie: 1 - Zhai, 2 - IMAX, 3 - 3D, 4 - Animation");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Title of your Movie:");
        String title = scanner.nextLine();

        MovieFactory factory = null;

        if (choice == 1) {
            factory = new ZhaiMovieFactory();
        } else if (choice == 2) {
            factory = new IMAXMovieFactory();
        } else if (choice == 3) {
            factory = new ThreeDMovieFactory();
        } else if (choice == 4) {
            factory = new AnimationMovieFactory();
        } else {
            System.out.println("Инвалидный выбор");
            return;
        }


        DamirMovie movie = factory.createMovie(title);
        movie.play();
    }
}
