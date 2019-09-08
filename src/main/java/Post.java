import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class Post {
    int userId;
    int id;
    String title;
    String body;

}
