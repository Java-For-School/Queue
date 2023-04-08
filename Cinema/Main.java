package Cinema;

import Cinema.Cinema.Cinema;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        System.out.printf("Is Cinema empty: %b\n", cinema.isEmpty());
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                cinema.insert(String.valueOf(i), j);
            }
        }
        System.out.printf("Is Cinema empty: %b\n", cinema.isEmpty());
        String id = "Alon Filler";
        int theatre = 1;
        System.out.printf("Id: %s is listed in theatre: %d : %b\n", id, theatre, cinema.isListed(id, cinema.getStandPointArray()[theatre - 1]));
        id = "1";
        System.out.printf("Id: %s is listed in theatre: %d : %b\n", id, theatre, cinema.isListed(id, cinema.getStandPointArray()[theatre - 1]));
        theatre = 2;
        System.out.printf("Id: %s is listed in theatre: %d : %b\n", id, theatre, cinema.isListed(id, cinema.getStandPointArray()[theatre - 1]));
        id = "Alon Filler";
        cinema.insert(id, theatre);
        System.out.printf("Id: %s is listed in theatre: %d : %b\n", id, theatre, cinema.isListed(id, cinema.getStandPointArray()[theatre - 1]));
        System.out.printf("The most filled theatre is: %d\n", getMostFilledTheatre(cinema));

    }
    private static int getMostFilledTheatre(Cinema cinema) {
        Queue<String>[] standPointArray = cinema.getStandPointArray();
        int mostPeople = 0;
        int mostPeopleIndex = 0;
        
        for (int i = 0; i < 10; i++) {
            Queue<String> theatre = standPointArray[i];
            int size = theatre.size();
            if (size > mostPeople) {
                mostPeople = size;
                mostPeopleIndex = i;
            }
        }

        return mostPeopleIndex + 1;
    }
}