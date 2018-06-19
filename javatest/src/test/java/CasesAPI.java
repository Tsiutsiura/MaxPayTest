import entity.Film;
import entity.People;
import entity.Planet;
import org.junit.Assert;
import org.junit.Test;
import until.BaseRequest;

public class CasesAPI extends Assert {

    String peopleURL = "https://swapi.co/api/people/1/";
    String peopleName;
    String planetURL;
    String planetName;
    String film;


    @Test
    public void cases1() throws Exception {

        //cases - поиск человека с id=1 (Luke Skywalker).

        BaseRequest<People> fReq = new BaseRequest<People>(peopleURL, People.class);
        fReq.Initialize();

        peopleName = fReq.getItem().getName();
        System.out.println("People name: " + peopleName);
        assertEquals("Name doesn't matched", "Luke Skywalker", peopleName);

    }

    @Test
    public void cases2() throws Exception {

        // case2 - по его homeworld найти планету, проверить ее peopleName (Tatooine) и population (200000).

        BaseRequest<People> fReq = new BaseRequest<People>(peopleURL, People.class);
        fReq.Initialize();

        planetURL = fReq.getItem().getHomeworld();
        System.out.println("Planet's URL for search: " + planetURL);
        BaseRequest<Planet> fReqPlanet = new BaseRequest<Planet>(planetURL, Planet.class);
        fReqPlanet.Initialize();

        planetName = fReqPlanet.getItem().getName();
        System.out.println("Planet's name: " + planetName);
        assertEquals("Planet peopleName doesn't matched", "Tatooine", fReqPlanet.getItem().getName());
        System.out.println("Planet's population: " + fReqPlanet.getItem().getPopulation());
        assertEquals("Planet population doesn't matched", 200000, fReqPlanet.getItem().getPopulation());

    }

    @Test
    public void cases3() throws Exception {

        //case3 - для первого в списке этой планеты фильма проверить title (Attack of the Clones); проверить, принадлежит ли фильму Luke Skywalker и его планета

        BaseRequest<People> fReq = new BaseRequest<People>(peopleURL, People.class);
        fReq.Initialize();
        planetURL = fReq.getItem().getHomeworld();

        BaseRequest<Planet> fReqPlanet = new BaseRequest<Planet>(planetURL, Planet.class);
        fReqPlanet.Initialize();

        film = fReqPlanet.getItem().getFilms().get(0);
        BaseRequest<Film> fReqFilm = new BaseRequest<Film>(film, Film.class);
        fReqFilm.Initialize();

        assertEquals("Film`s title doesn't matched", "Attack of the Clones", fReqFilm.getItem().getTitle());

        System.out.println("Is Luke Skywalker in film: " + fReqFilm.getItem().getCharacters().contains(peopleURL));
        System.out.println("Is Luke Skywalker planet '" + planetName + "' in film: " + fReqFilm.getItem().getPlanets().contains(planetURL));
    }

}



