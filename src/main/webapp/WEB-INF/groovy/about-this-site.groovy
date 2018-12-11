import com.google.appengine.api.datastore.Entity

def about = new Entity('about-this-site')
about.save()

//request.about-this-site = datastore.execute { select all from about }

forward '/WEB-INF/pages/about-this-site.gtpl'
