package bloogy
import groovyx.gaelyk.datastore.Entity
import groovyx.gaelyk.datastore.Key
import groovyx.gaelyk.datastore.Unindexed

@Entity(unindexed=false)
class Post {
   public static  @Key String title
   public static String content
   public static String created
   public static String draft
   public static String type
   public static String categories
}

