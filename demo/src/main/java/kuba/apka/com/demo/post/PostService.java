package kuba.apka.com.demo.post;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import ch.qos.logback.classic.spi.LoggerRemoteView;
import java.util.List;

@Service
public class PostService{

    private static ArrayList<Post> posts = new ArrayList<>();
    private static int idCounter = 0;

    static {
        posts.add(new Post(++idCounter,
         "Title 1",
         "https://www.w3schools.com/w3css/img_lights.jpg",
          "Lorem ipsum dolor sit amet, consectetur adipiscing elit,"+
          "sed do eiusmod tempor incididunt ut labore et dolore magna" +
          "aliqua. Ut enim ad minim veniam, quis nostrud exercitation" +
          "ullamco laboris nisi ut aliquip ex ea commodo consequat" ));
          posts.add(new Post(++idCounter,
          "Title 2",
          "https://www.w3schools.com/w3css/img_lights.jpg",
           "Lorem ipsum dolor sit amet, consectetur adipiscing elit,"+
           "sed do eiusmod tempor incididunt ut labore et dolore magna" +
           "aliqua. Ut enim ad minim veniam, quis nostrud exercitation" +
           "ullamco laboris nisi ut aliquip ex ea commodo consequat" ));
           posts.add(new Post(++idCounter,
           "Title 3",
           "https://www.w3schools.com/w3css/img_lights.jpg",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit,"+
            "sed do eiusmod tempor incididunt ut labore et dolore magna" +
            "aliqua. Ut enim ad minim veniam, quis nostrud exercitation" +
            "ullamco laboris nisi ut aliquip ex ea commodo consequat" ));
            posts.add(new Post(++idCounter,
            "Title 4",
            "https://www.w3schools.com/w3css/img_lights.jpg",
             "Lorem ipsum dolor sit amet, consectetur adipiscing elit,"+
             "sed do eiusmod tempor incididunt ut labore et dolore magna" +
             "aliqua. Ut enim ad minim veniam, quis nostrud exercitation" +
             "ullamco laboris nisi ut aliquip ex ea commodo consequat" ));
             posts.add(new Post(++idCounter,
             "Title 5",
             "https://www.w3schools.com/w3css/img_lights.jpg",
              "Lorem ipsum dolor sit amet, consectetur adipiscing elit,"+
              "sed do eiusmod tempor incididunt ut labore et dolore magna" +
              "aliqua. Ut enim ad minim veniam, quis nostrud exercitation" +
              "ullamco laboris nisi ut aliquip ex ea commodo consequat" ));
    }

    public List<Post> getAll(){
        return posts;
    }

    public Post get(int id){
        return posts.get(id);
    }
}